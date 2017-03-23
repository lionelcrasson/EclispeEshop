package application;

import java.util.*;
import java.util.List;

import javafx.application.Application; 
import javafx.stage.*; 
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;

import ClassesMetier.*;
import CoucheAccessDB.*;
import CoucheMetier.Metier;


public class testJfx extends Application{
	
	private static final int LARGEUR = 350;
	private static final int HAUTEUR = 350;
	
	public static Metier CoucheMetier;
	private List<Alcools> liste_Alcools;
	private List<Chemises> liste_Chemises;
	private List<Vins> liste_Vins;
	private List<Client> liste_Clients;
	private List<Commande> liste_Commandes;
	
	Button button;
	
	public static void main(String[] args) {
		try { 
			CoucheMetier = new Metier(); 
		} catch (ExceptionAccessDB e) { 
			System.out.println("\nAccès à la BD impossible (" + e.getMessage() + ")"); 
			System.exit(0); 
			
		}
		Application.launch(testJfx.class, args);
		
	}
	 @Override 
	 public void start(Stage stage) throws ExceptionAccessDB { 
		 stage.setTitle("Fenêtre simple");
		 StackPane layout = new StackPane();
		 Chemises New_chemise = new Chemises(99,"nouvelle", null,200,20,"coton","rouge","XXL");
		 button = new Button();
	     button.setText("Click Me");
	     button.setOnAction(e -> {
	    	 try {
				CoucheMetier.AjouterChemise(New_chemise);
			} catch (ExceptionAccessDB e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	     });
	     
	     /*for(Alcools A: liste_Alcools){
		 
		 Label label = new Label();	
		 label.setText(A.getNom().toString());
		 layout.getChildren().add(label);
	 		}
	      */
	     
		 //CoucheMetier.AjouterChemise(New_chemise);
	     //CoucheMetier.AjouterAlcool(New_alcool);
	     //CoucheMetier.AjouterVin(New_vin);
	     //*CoucheMetier.AjouterClient(New_client);
	     //*CoucheMetier.modifChemise(New_chemise);
	     //*CoucheMetier.modifAlcool(New_alcool);
	     //*CoucheMetier.modifVin(New_vin);
	     //*CoucheMetier.modifClient(New_client);
	     //*CoucheMetier.delChemise(0);
	     //*CoucheMetier.delAlcool(0);
	     //*CoucheMetier.delVin(0);
	     //*CoucheMetier.delClient(0);
	     liste_Alcools = CoucheMetier.ListerAlcools();
		 liste_Chemises = CoucheMetier.ListerChemises();
		 liste_Vins = CoucheMetier.ListerVins();
		 liste_Clients = CoucheMetier.ListerClients();
		 liste_Commandes = CoucheMetier.ListerCommandes(0);
		 
		 
	     layout.getChildren().add(button);
		 // fixer le titre et afficher la fenêtre
		 Scene scene = new Scene(layout,300,250);
		 stage.setScene(scene);
		 stage.show();
		 } 
}
