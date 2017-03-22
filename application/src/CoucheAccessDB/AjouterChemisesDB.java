package CoucheAccessDB;
import java.sql.*; 
import ClassesMetier.*;

public class AjouterChemisesDB extends operationDB { 
	private Chemises Chemise;

public AjouterChemisesDB(Chemises Chemise) { 
	super("AjouterResultat"); 
	this.Chemise = Chemise; 
}
public int ExecuterRequete(Connection SqlConn) throws SQLException { 
	PreparedStatement stmt1 = SqlConn.prepareStatement("insert into Chemises (Matiere,Couleur,Taille,fk_Produits) values (?,?,?,?)");
	PreparedStatement stmt2 = SqlConn.prepareStatement("insert into Produits (NumProduit,Nom,Image,Prix,Stock) values (?,?,?,?,?)");
    try{
    	SqlConn.setAutoCommit(false);
    	stmt2.setInt(1, Chemise.getNumProduit());
    	stmt2.setString(2, Chemise.getNom());
    	stmt2.setString(3, Chemise.getImage());
    	stmt2.setFloat(4, Chemise.getPrix());
    	stmt2.setInt(5, Chemise.getStock());
    	stmt2.executeUpdate();
    	stmt1.setString(1,Chemise.getMatiere());
        stmt1.setString(2, Chemise.getCouleur());
        stmt1.setString(3, Chemise.getTaille());
        stmt1.setInt(4, Chemise.getNumProduit());
        stmt1.executeUpdate();
    	
    	SqlConn.commit();
    	System.out.println("transact ok");
    }catch (SQLException e){
    	System.out.println(e.toString());
    	SqlConn.rollback();  
    	throw(e);
    }
    return 0;
    } 
}
