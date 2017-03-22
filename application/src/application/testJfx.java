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
		 Chemises Nouvelle_chemise = new Chemises(99,"nouvelle", null,200,20,"coton","rouge","XXL");
		 button = new Button();
	     button.setText("Click Me");
	     button.setOnAction(e -> {
	    	 try {
				CoucheMetier.AjouterChemise(Nouvelle_chemise);
			} catch (ExceptionAccessDB e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	     });
		 
	     liste_Alcools = CoucheMetier.ListerAlcools();
		 
		 /*for(Alcools A: liste_Alcools){
			 
			 Label label = new Label();	
			 label.setText(A.getNom().toString());
			 layout.getChildren().add(label);
		 }
		 */
	     layout.getChildren().add(button);
		 // fixer le titre et afficher la fenêtre
		 Scene scene = new Scene(layout,300,250);
		 stage.setScene(scene);
		 stage.show();
		 } 
}
