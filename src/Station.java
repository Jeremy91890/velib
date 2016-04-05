
public class Station {

	private String adresse;
	private String arrondissement;
	private boolean bonus;
	private String numero;
	private boolean ouvert;
	
	public Station(String unNumero, String uneAdresse, boolean bonus, boolean ouvert) {
		// TODO Auto-generated constructor stub
		 
		//Definition de l'arrondissement
		// Si pas un arrondissement, mais d�partement
		if(Integer.parseInt(unNumero) > 21000 && unNumero.length() == 5){
			this.arrondissement = 9+unNumero.substring(0, 1);
		}
		// Si arrondissement >= 10 
		else {
			if(unNumero.length() == 5){
				this.arrondissement = unNumero.substring(0, 2);
			}
			// Si arrondissement < 10
			else{
				if(unNumero.length() == 4){
					this.arrondissement = unNumero.substring(0, 1);
				}
				// Si plateforme mobile
				else{
					this.arrondissement = "mobile";
				}
			}
		}
		
		this.adresse = uneAdresse;
		this.bonus = bonus;
		this.numero = unNumero;
		this.ouvert = ouvert; 
	}
	
	public String getAdresse(){	
		return this.adresse;
	}
	
	public String getArrondissement(){
		return this.arrondissement;
	}
	
	public String getNumero(){
		return this.numero;
	}
	
	public boolean isBonus(){
		return this.bonus;
	}
	
	public boolean isOuvert(){
		return this.ouvert;
	}
	
	public String toString(){
		return "Adresse : "+this.adresse+"\nArrondissement : "+this.arrondissement+"\nBonus : "+this.bonus+"\nNumero : "+this.numero+"\nOuvert : "+this.ouvert;
	}
	
	

}
