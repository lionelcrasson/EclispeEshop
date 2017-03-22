package CoucheAccessDB;

import java.sql.Connection;
public abstract class operationDB { 
	protected String Nom = "";
	public String getNom() { 
		return Nom; 
	}
	protected operationDB(String nom) { 
		Nom = nom; 
	}
	public abstract int ExecuterRequete(Connection SqlConn) throws Exception;

}
