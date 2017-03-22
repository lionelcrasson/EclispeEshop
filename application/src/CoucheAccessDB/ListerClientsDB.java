package CoucheAccessDB;

import java.sql.*; 
import java.util.*;

import ClassesMetier.Client;

public class ListerClientsDB extends operationDB { 
	private List<Client> Liste;
	
	public List<Client> getListe() { 
		System.out.println(Liste.get(0).toString());
		return Liste; 
	}

	public ListerClientsDB() { 
		super("ListerClients"); 
	}

	public int ExecuterRequete(Connection SqlConn) throws Exception { 
		Liste = new ArrayList<Client>();
		//CallableStatement sqlCmd = SqlConn.prepareCall("{ call ListerCours() }"); 
		Statement stmt = SqlConn.createStatement();
		ResultSet rs;		 
        rs = stmt.executeQuery("SELECT * FROM Clients");
		//ResultSet sqlRes = SqlCmd.executeQuery();            
			while (rs.next() == true)    
				Liste.add(new Client(
						rs.getInt("NumClient"),
						rs.getString("Nom"),
						rs.getString("Prenom"),
						rs.getString("Adressel1"),
						rs.getString("Adressel2"),
						rs.getString("Ville"),
						rs.getInt("CodePostal"),
						rs.getDate("Provenance")
					)
				);
				rs.close();                
		return Liste.size(); 
	}
}
