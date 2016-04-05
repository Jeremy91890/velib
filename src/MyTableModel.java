import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class MyTableModel extends AbstractTableModel{
	private String[] nomColonnes = {"Numéro", "Adresse", "Bonus", "Ouvert"};
	private Carte laCarte;
	private ArrayList<Station> lesStations = new ArrayList<Station>();
	private final Object[][]donnees;

	
	public MyTableModel()
	{
		
		// initialise laCarte gr�ce � Passerelle puis
		// charge l'ensemble des stations de laCarte dans les Stations
		
		super();
		laCarte = Passerelle.getCarte();
		
		for(int i = 0; i<laCarte.nbStations(); i++){
			this.lesStations.add(laCarte.getLaStation(i));
		}
		this.donnees = new Object[lesStations.size()][];
		
		for(int i = 0;i<lesStations.size();i++){
			donnees[i] = new Object[]{lesStations.get(i).getNumero(), lesStations.get(i).getAdresse(), lesStations.get(i).isBonus(), lesStations.get(i).isOuvert()};
		}
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		//return donnees.length;
		return lesStations.size();

	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return nomColonnes.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {

		case 0:
			// Num
			return lesStations.get(rowIndex).getNumero();

		case 1:
			// Adresse
			return lesStations.get(rowIndex).getAdresse();

		case 2:
			// Bonus
			return lesStations.get(rowIndex).isBonus();

		case 3:
			// ouvert
			return lesStations.get(rowIndex).isOuvert();
			
		default:
			throw new IllegalArgumentException();
		}
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		return nomColonnes[columnIndex];
	}
	
	
	 @Override
	public Class getColumnClass(int c) {
        // renvoie la classe d'un �l�ment de la colonne c
		switch (c) {
		case 0:
			return String.class;
		case 1:
			return String.class;
		case 2:
			return Boolean.class;
		case 3 :
			return Boolean.class;
		default:
			return Object.class;
		}
    }
	public void setLesStations(String n) {
		// vide la liste des stations puis e 
		// la remplit avec toutes les stations de l'arrondissement n
		
		lesStations.removeAll(lesStations);
		for(int i = 0; i<laCarte.nbStations(); i++){
			if(laCarte.getLaStation(i).getArrondissement().equals(n)){
				this.lesStations.add(laCarte.getLaStation(i));
				System.out.println();
			}
		}
		
	}
}