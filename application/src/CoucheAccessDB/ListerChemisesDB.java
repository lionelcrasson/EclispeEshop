package CoucheAccessDB;

import java.sql.*; 
import java.util.*;

import ClassesMetier.Chemises;

public class ListerChemisesDB extends operationDB { 
	private List<Chemises> Liste;
	
	public List<Chemises> getListe() { 
		System.out.println(Liste.get(0).toString());
		return Liste; 
	}

	public ListerChemisesDB() { 
		super("ListerChemises"); 
	}

	public int ExecuterRequete(Connection SqlConn) throws Exception { 
		Liste = new ArrayList<Chemises>();
		//CallableStatement sqlCmd = SqlConn.prepareCall("{ call ListerCours() }"); 
		Statement stmt = SqlConn.createStatement();
		ResultSet rs;		 
        rs = stmt.executeQuery("SELECT * FROM Produits,Chemises where Produits.NumProduit = Chemises.fk_Produits");
		//ResultSet sqlRes = SqlCmd.executeQuery();            
			while (rs.next() == true)    
				Liste.add(new Chemises(
						rs.getInt("NumProduit"),
						rs.getString("Nom"),
						rs.getString("Image"),
						rs.getInt("Prix"),
						rs.getInt("Stock"),
						rs.getString("Matière"),
						rs.getString("Couleur"),
						rs.getString("Taille")
					)
				);
				rs.close();                
		return Liste.size(); 
	}
}
