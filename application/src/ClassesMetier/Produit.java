package ClassesMetier;

public class Produit {
	private int NumProduit;    
	private String Nom;    
	private String Image;    
	private int Prix;
	private int Stock;

	// -----------------------------------------------
	
	public Produit(){}
	/*public Produit(Produit produit){
		this.Nom = produit.Nom;
		this.Image = produit.Image;
		this.Prix = produit.Prix;
		this.Stock = produit.Stock;
	}*/
	public Produit(int NumProduit, String Nom, String Image,int Prix,int Stock){
		this.Nom = Nom;
		this.Image = Image;
		this.Prix = Prix;
		this.Stock = Stock;
	}
	
	public int getNumProduit() { return NumProduit; }    
	public String getNom() {return Nom;}
	public String getImage(){return Image;}
	public int getPrix(){return Prix;}
	public int getStock(){return Stock;}
	
	public void setNom(String Nom){
		this.Nom = Nom;
	}
	public void setImage(String Image){
		this.Image = Image;
	}
	public void setImage(int Prix){
		this.Prix = Prix;
	}
	public void setStock(int Stock){
		this.Stock = Stock;
	}
}
