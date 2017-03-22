package ClassesMetier;
import java.util.*;
public class Ligne_commande {
	private int NumCommande;
	private int NumProduit;
	private int Quantite;
	private Date Date_commande;
	
	private float SousTotal;


public Ligne_commande(int numCommande, int numProduit, int quantite, Date date_commande, float sousTotal) {
		NumCommande = numCommande;
		NumProduit = numProduit;
		Quantite = quantite;
		Date_commande = date_commande;
		SousTotal = sousTotal;
	}
public Ligne_commande(){}
public Ligne_commande(Ligne_commande ligne){
	this.NumCommande = ligne.NumCommande;
	this.NumProduit = ligne.NumProduit;
	this.Quantite = ligne.Quantite;
	this.SousTotal = ligne.SousTotal;
}
public int getNumCommande() {
	return NumCommande;
}
public void setNumCommande(int numCommande) {
	NumCommande = numCommande;
}
public int getNumProduit() {
	return NumProduit;
}
public void setNumProduit(int numProduit) {
	NumProduit = numProduit;
}
public int getQuantite() {
	return Quantite;
}
public void setQuantite(int quantite) {
	Quantite = quantite;
}
public Date getDate_commande() {
	return Date_commande;
}
public void setDate_commande(Date date_commande) {
	Date_commande = date_commande;
}
public float getSousTotal() {
	return SousTotal;
}
public void setSousTotal(float sousTotal) {
	SousTotal = sousTotal;
}

}