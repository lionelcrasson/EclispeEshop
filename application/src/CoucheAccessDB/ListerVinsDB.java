package CoucheAccessDB;

import java.sql.*; 
import java.util.*;

import ClassesMetier.Vins;

public class ListerVinsDB extends operationDB { 
	private List<Vins> Liste;
	
	public List<Vins> getListe() { 
		System.out.println(Liste.get(0).toString());
		return Liste; 
	}

	public ListerVinsDB() { 
		super("ListerVins"); 
	}

	public int ExecuterRequete(Connection SqlConn) throws Exception { 
		Liste = new ArrayList<Vins>();
		//CallableStatement sqlCmd = SqlConn.prepareCall("{ call ListerCours() }"); 
		Statement stmt = SqlConn.createStatement();
		ResultSet rs;		 
        rs = stmt.executeQuery("SELECT * FROM Produits,Vins where Produits.NumProduit = Vins.fk_Produits");
		//ResultSet sqlRes = SqlCmd.executeQuery();            
			while (rs.next() == true)    
				Liste.add(new Vins(
						rs.getInt("NumProduit"),
						rs.getString("Nom"),
						rs.getString("Image"),
						rs.getInt("Prix"),
						rs.getInt("Stock"),
						rs.getString("Couleur"),
						rs.getString("Saveur"),
						rs.getString("Provenance"),
						rs.getInt("Maturation"),
						rs.getDate("Fabrication")
					)
				);
				rs.close();                
		return Liste.size(); 
	}
}
