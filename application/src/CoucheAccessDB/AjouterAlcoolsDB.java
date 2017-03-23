package CoucheAccessDB;
import java.sql.*; 
import ClassesMetier.*;

public class AjouterAlcoolsDB extends operationDB { 
	private Alcools Alcool;

public AjouterAlcoolsDB(Alcools Alcool) { 
	super("AjouterResultat"); 
	this.Alcool = Alcool; 
}
public int ExecuterRequete(Connection SqlConn) throws Exception { 
	PreparedStatement stmt1 = SqlConn.prepareStatement("insert into Produits (NumProduit,Nom,Image,Prix,Stock) values (?,?,?,?,?)");
	PreparedStatement stmt2 = SqlConn.prepareStatement("insert into Alcools (Degré,Gout,Provenance,Peremption,fk_Produits) values (?,?,?,?,?)");
	try{
    	SqlConn.setAutoCommit(false);
    	stmt1.setInt(1, Alcool.getNumProduit());
    	stmt1.setString(2, Alcool.getNom());
    	stmt1.setString(3, Alcool.getImage());
    	stmt1.setFloat(4, Alcool.getPrix());
    	stmt1.setInt(5, Alcool.getStock());
    	stmt1.executeUpdate();
		stmt2.setInt(1,Alcool.getDegre());
	    stmt2.setString(2, Alcool.getGout());
	    stmt2.setString(3, Alcool.getProvenance());
	    stmt2.setString(4, Alcool.getPeremptionTxt());
		stmt2.setInt(5, Alcool.getNumProduit());
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
