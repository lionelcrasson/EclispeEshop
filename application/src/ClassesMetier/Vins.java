package ClassesMetier;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Vins extends Produit{
	private String Couleur;
	private String Saveur;
	private String Provenance;
	private int Maturation;
	private LocalDate Fabrication;
	
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
				LocalDate Fabrication){
		super(NumProduit, Nom, Image,Prix,Stock);
		this.Couleur = Couleur;
		this.Saveur = Saveur;
		this.Provenance = Provenance;
		this.Maturation = Maturation;
		this.Fabrication = Fabrication;
	}


public LocalDate getFabrication() {
	return Fabrication;
}
public String getFabricationTxt(){ 
	return Fabrication.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")); 
}
public void setFabrication(String s) throws ExceptionFormat {
	try {
		Fabrication = LocalDate.parse(s, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}
	catch (Exception e) {
		throw new ExceptionFormat("la date de péremption n'a pas un format correct");
	}
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