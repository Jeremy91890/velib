import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.w3c.dom.*;

import javax.xml.parsers.*;

import org.xml.sax.SAXException;


public class Passerelle {

	private static String urlCarto = "http://www.velib.paris.fr/service/carto";
	private static String urlDispo = "http://www.velib.paris.fr/service/stationdetails/";
	private static Document document;

	public void Passerelle(){
		
	}
	
	public static Document init(String url){
		
		try{
			// on créé un document qui contiendra le fichier XML 
			DocumentBuilderFactory fabrique = DocumentBuilderFactory.newInstance();
			DocumentBuilder constructeur = fabrique.newDocumentBuilder();
			
			try{
				// On renvoie le document
				document = constructeur.parse(url);
				return document;
			}
			catch(SAXException | IOException e){
				e.printStackTrace();
				return null;
			}
		}
		catch(ParserConfigurationException e){
			e.printStackTrace();
			return null;
		}	
	}
	
	public static Carte getCarte(){
		// on créer le document avec notre URL
		init(urlCarto);
		// on déclare une carte dans laquelle on va ajouter les stations
		Carte carte = new Carte();
		Element racine = document.getDocumentElement();
		int nbMarker = racine.getElementsByTagName("marker").getLength();
		NodeList list = racine.getElementsByTagName("marker");
		int i ;
		// On parcours chaque station
		for (i = 0; i < nbMarker; i++){
			boolean open;
			boolean bonus;
			
			if(((Element) list.item(i)).getAttribute("bonus").equals("0")){
				 bonus = false;
			}
			else {
				 bonus = true;
			}
			
			if(((Element) list.item(i)).getAttribute("open").equals("0")){
				 open = false;
			}
			else {
				 open = true;
			}
			// On ajoute dans la carte chaque station en ne prenant que certains éléments
			carte.ajouteStation(((Element) list.item(i)).getAttribute("number"),((Element) list.item(i)).getAttribute("fullAddress"),bonus, open);
		}
		return carte;
	}
	
	public static HashMap<String, String> getDispo(String number){
		// On ajoute le numero de la station à l'URL
		String url = urlDispo+number;
		//On établie la connexion
		init(url);
		// On remplit un dictionnaire clé = nom balise valeur = valeur balise
		HashMap<String, String> hashmap = new HashMap();
		Element racine = document.getDocumentElement();
		NodeList list = (NodeList) racine.getElementsByTagName("*");
		int i ;
		int nb = list.getLength();
		// parcours du fichier xml
		for (i=0;i<nb;i++){
			// getTextContent est aussi possible au lieu de getNodeValue()
			hashmap.put(list.item(i).getNodeName(), list.item(i).getFirstChild().getNodeValue());
		}
		return hashmap;	
	}
}
