package CoucheAccessDB;
import java.sql.*; 
import ClassesMetier.*;

public class AjouterVinsDB extends operationDB { 
	private Vins Vin;

public AjouterVinsDB(Vins Vin) { 
	super("AjouterResultat"); 
	this.Vin = Vin; 
}
public int ExecuterRequete(Connection SqlConn) throws Exception { 
	PreparedStatement stmt1 = SqlConn.prepareStatement("insert into Produits (NumProduit,Nom,Image,Prix,Stock) values (?,?,?,?,?)");
	PreparedStatement stmt2 = SqlConn.prepareStatement("insert into Vins (Couleur,Saveur,Provenance,Maturation,Fabrication,fk_Produits) values (?,?,?,?,?)");
	try{
    	SqlConn.setAutoCommit(false);
    	stmt1.setInt(1, Vin.getNumProduit());
    	stmt1.setString(2, Vin.getNom());
    	stmt1.setString(3, Vin.getImage());
    	stmt1.setFloat(4, Vin.getPrix());
    	stmt1.setInt(5, Vin.getStock());
    	stmt1.executeUpdate();
		stmt2.setString(1,Vin.getCouleur());
	    stmt2.setString(2, Vin.getSaveur());
	    stmt2.setString(3, Vin.getProvenance());
	    stmt2.setInt(4, Vin.getMaturation());
		stmt2.setString(5, Vin.getFabricationTxt());
		stmt2.setInt(6, Vin.getNumProduit());
		stmt2.executeUpdate();
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
