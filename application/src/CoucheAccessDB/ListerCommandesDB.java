package CoucheAccessDB;

import java.sql.*; 
import java.util.*;

import ClassesMetier.Commande;

public class ListerCommandesDB extends operationDB { 
	private List<Commande> Liste;
	private int IdClient;
	public List<Commande> getListe() { 
		System.out.println(Liste.get(0).toString());
		return Liste; 
	}

	public ListerCommandesDB(int IdClient) { 
		super("ListerCommandes"); 
		this.IdClient = IdClient;
	}

	public int ExecuterRequete(Connection SqlConn) throws Exception { 
		this.Liste = new ArrayList<Commande>();
		//CallableStatement sqlCmd = SqlConn.prepareCall("{ call ListerCours() }"); 
		PreparedStatement stmt = SqlConn.prepareStatement("SELECT * FROM Produits,commandeProduit where fk_NumClient = ?");
		stmt.setInt(1, this.IdClient);
		ResultSet rs;		 
        rs = stmt.executeQuery();
		//ResultSet sqlRes = SqlCmd.executeQuery();            
			while (rs.next() == true)    
				this.Liste.add(new Commande(
						rs.getInt("NumCommande"),
						rs.getInt("fk_NumClient"),
						rs.getString("Statut"),
						rs.getDate("DateCmd")
					)
				);
				rs.close();                
		return this.Liste.size(); 
	}
}
