package ClassesMetier;
import java.util.Date;

public class Vins extends Produit{
	private String Couleur;
	private String Saveur;
	private String Provenance;
	private int Maturation;
	private Date Fabrication;
	
	public Vins(){};
	public Vins(Vins vin){
		this.Couleur = vin.Couleur;
		this.Saveur = vin.Saveur;
		this.Provenance = vin.Provenance;
		this.Maturation = vin.Maturation;
		this.Fabrication = vin.Fabrication;
		
	}
	public Vins(int NumProduit,
				String Nom,
				String Image,
				int Prix,
				int Stock,
				String Couleur,
				String Saveur,
				String Provenance,
				int Maturation,
				Date Fabrication){
		super(NumProduit, Nom, Image,Prix,Stock);
		this.Couleur = Couleur;
		this.Saveur = Saveur;
		this.Provenance = Provenance;
		this.Maturation = Maturation;
		this.Fabrication = Fabrication;
	}


public Date getFabrication() {
	return Fabrication;
}

public void setFabrication(Date fabrication) {
	Fabrication = fabrication;
}

public int getMaturation() {
	return Maturation;
}

public void setMaturation(int maturation) {
	Maturation = maturation;
}

public String getProvenance() {
	return Provenance;
}

public void setProvenance(String Provenance) {
	this.Provenance = Provenance;
}

public String getSaveur() {
	return Saveur;
}

public void setSaveur(String saveur) {
	Saveur = saveur;
}

public String getCouleur() {
	return Couleur;
}

public void setCouleur(String couleur) {
	Couleur = couleur;
}

}