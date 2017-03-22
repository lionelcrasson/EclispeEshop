package ClassesMetier;
import java.util.*;
public class Commande {
	private int NumCommande;
	private int Client;
	private String statut;
	private Date date_commande;
	
	public Commande(){}
	public Commande(int numCommande, int client, String statut, Date date_commande) {
		NumCommande = numCommande;
		Client = client;
		this.statut = statut;
		this.date_commande = date_commande;
	}
	public Commande(Commande commande){
		this.NumCommande = commande.NumCommande;
		this.Client = commande.Client;
		this.statut = commande.statut;
		this.date_commande = commande.date_commande;
	}
	
	public int getNumCommande() {
		return NumCommande;
	}
	public void setNumCommande(int numCommande) {
		NumCommande = numCommande;
	}

	public int getClient() {
		return Client;
	}
	public void setClient(int client) {
		Client = client;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public Date getDate_commande() {
		return date_commande;
	}
	public void setDate_commande(Date date_commande) {
		this.date_commande = date_commande;
	}
}
