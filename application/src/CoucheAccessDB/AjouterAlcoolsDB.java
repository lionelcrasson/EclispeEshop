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
	PreparedStatement stmt = SqlConn.prepareStatement("insert into Alcools (Degré,Gout,Provenance,Peremption,fk_Produits) values (?,?,?,?,?)");
    stmt.setInt(1,Alcool.getDegre());
    stmt.setString(2, Alcool.getGout());
    stmt.setString(3, Alcool.getProvenance());
    stmt.setString(4, Alcool.getPeremptionTxt());
	stmt.setInt(5, Alcool.getNumProduit());
    stmt.executeQuery();
	
    return 1;
    } 
}
