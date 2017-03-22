package ClassesMetier;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Alcools extends Produit{
	private int degre;
	private String gout;
	private String Provenance;
	private LocalDate Peremption;
	
	public Alcools(int NumProduit,String Nom,String Image,int Prix,int Stock,int degre, String gout, String provenance, LocalDate peremption) {
		super(NumProduit, Nom, Image,Prix,Stock);
		this.degre = degre;
		this.gout = gout;
		this.Provenance = provenance;
		this.Peremption = peremption;
	}
	public Alcools(){}
	public Alcools(Alcools alcool){
		this.degre = alcool.degre;
		this.gout = alcool.gout;
		this.Provenance = alcool.Provenance;
		this.Peremption = alcool.Peremption;
	}
	public int getDegre() {
		return degre;
	}
	public void setDegre(int degre) {
		this.degre = degre;
	}
	public String getGout() {
		return gout;
	}
	public void setGout(String gout) {
		this.gout = gout;
	}
	public String getProvenance() {
		return Provenance;
	}
	public void setProvenance(String provenance) {
		Provenance = provenance;
	}
	public LocalDate getPeremption() {
		return Peremption;
	}
	public String getPeremptionTxt(){ 
		return Peremption.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")); 
	}


	public void setPeremption(String s) throws ExceptionFormat {
		try {
			Peremption = LocalDate.parse(s, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		}
		catch (Exception e) {
			throw new ExceptionFormat("la date de péremption n'a pas un format correct");
		}
	 }


}
