import java.util.ArrayList;

public class Carte {

	private ArrayList<Station> mesStations;
	
	public Carte() {
		mesStations = new ArrayList<Station>();
		// TODO Auto-generated constructor stub
	}
	
	public void ajouteStation(String unNumero,  String uneAdresse, boolean bonus, boolean ouvert){
		Station uneStation = new Station(unNumero, uneAdresse,  bonus, ouvert);
		mesStations.add(uneStation);
	}
	
	public Station chercher(String unNumero){
		
		for(Station uneStation : mesStations){
			if(uneStation.getNumero().equals(unNumero)){
				return uneStation;
			}
		}
		return null;
	}
	
	public Station getLaStation (int i){
		return mesStations.get(i);
	}
	
	public int nbStations(){
		return mesStations.size();
	}
}
