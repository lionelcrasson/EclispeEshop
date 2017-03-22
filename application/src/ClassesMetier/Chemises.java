package ClassesMetier;

public class Chemises extends Produit{
	private String Matiere;
	private String Couleur;
	private String Taille;
	
	public Chemises (){}
	public Chemises(Chemises chemise){
		this.Matiere = chemise.Matiere;
		this.Couleur = chemise.Couleur;
		this.Taille = chemise.Taille;
	}
	public Chemises(int NumProduit, 
					String Nom, 
					String Image,
					int Prix,
					int Stock, 
					String Matiere,
					String Couleur,
					String Taille){
		super(NumProduit, Nom, Image,Prix,Stock);
		this.Matiere = Matiere;
		this.Couleur = Couleur;
		this.Taille = Taille;
	}
	public String getMatiere() {
		return Matiere;
	}

	public void setMatiere(String matiere) {
		Matiere = matiere;
	}

	public String getCouleur() {
		return Couleur;
	}

	public void setCouleur(String couleur) {
		Couleur = couleur;
	}

	public String getTaille() {
		return Taille;
	}

	public void setTaille(String taille) {
		Taille = taille;
	}


}
