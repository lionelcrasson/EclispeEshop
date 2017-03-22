package ClassesMetier;
import java.util.Date;

public class Client {
	private int NumClient;
	private String Nom;
	private String Prenom;
	private String adresse1;
	private String adresse2;
	private String Ville;
	private int code_postal;
	private  Date date_naissance;
	
	public Client( 
					int numClient, 
					String nom, 
					String prenom, 
					String adresse1, 
					String adresse2, 
					String ville,
					int code_postal, 
					Date date_naissance) {
		NumClient = numClient;
		Nom = nom;
		Prenom = prenom;
		this.adresse1 = adresse1;
		this.adresse2 = adresse2;
		Ville = ville;
		this.code_postal = code_postal;
		this.date_naissance = date_naissance;
	}
	public Client(){};
	public Client(Client client){
		this.NumClient = client.NumClient;
		this.Nom = client.Nom;
		this.Prenom = client.Prenom;
		this.adresse1 = client.adresse1;
		this.adresse2 = client.adresse2;
		this.Ville = client.Ville;
		this.code_postal = client.code_postal;
		this.date_naissance = client.date_naissance;
	}
	
	public int getNumClient() {
		return NumClient;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getAdresse1() {
		return adresse1;
	}
	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}
	public String getAdresse2() {
		return adresse2;
	}
	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		Ville = ville;
	}
	public int getCode_postal() {
		return code_postal;
	}
	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}





}