package CoucheAccessDB;

import java.sql.*; 
import java.util.*;

import ClassesMetier.Alcools;

public class ListerAlcoolsDB extends operationDB { 
	private List<Alcools> Liste;
	
	public List<Alcools> getListe() { 
		//System.out.println(Liste.get(0).toString());
		return Liste; 
	}

	public ListerAlcoolsDB() { 
		super("ListerAlcools"); 
	}

	public int ExecuterRequete(Connection SqlConn) throws Exception { 
		Liste = new ArrayList<Alcools>();
		//CallableStatement sqlCmd = SqlConn.prepareCall("{ call ListerCours() }"); 
		Statement stmt = SqlConn.createStatement();
		ResultSet rs;		 
        rs = stmt.executeQuery("SELECT * FROM Produits,Alcools where Produits.NumProduit = Alcools.fk_Produits");
		//ResultSet sqlRes = SqlCmd.executeQuery();            
			/*while (rs.next() == true)    
				Liste.add(new Alcools(
						rs.getInt("NumProduit"),
						rs.getString("Nom"),
						rs.getString("Image"),
						rs.getInt("Prix"),
						rs.getInt("Stock"),
						rs.getInt("Degré"),
						rs.getString("Gout"),
						rs.getString("Provenance"),
						rs.getString("Peremption")
					)
				);*/
				rs.close();                
		return Liste.size(); 
	}
}
