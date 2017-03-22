package CoucheAccessDB;

import java.sql.*; 
import java.util.*;
import ClassesMetier.*; 

public class AccessDB {
	private Connection SqlConn = null;    
	private final int MaxTentatives = 3;
	 public AccessDB() throws ExceptionAccessDB    {      
		 if(SqlConn == null) {        
			 int nbTentatives = 0;
	 
	      while (true)          
	      {              
	    	  try{              
	    		  ouvrir_connexion();              
	    		  return;              
	    	  }              
	    	  catch (Exception e){              
	    		  nbTentatives++;              
	    		  if (nbTentatives == MaxTentatives)        
	    			  throw new ExceptionAccessDB("Connexion à la BD", e.getMessage());               
	    		  }          
	    }        
	}   

	}
	private void ouvrir_connexion()throws Exception{
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	
	 this.SqlConn = DriverManager.getConnection(
					"jdbc:sqlserver://localhost:1433;" +   
					"database=gestion6;user=génial;password=super;"
			);
	}
	 private int ExecuterRequete(operationDB operation) throws ExceptionAccessDB{    
		 int nbTentatives = 0;
		 	while (true){       
		 		try  {        
		 			if(nbTentatives > 0) {
		 				ouvrir_connexion();
		 				System.out.println("tentative");
		 			}	 				
		 			return operation.ExecuterRequete(SqlConn);     
		 		}catch(Exception e){     
		 			nbTentatives++;            
		 			if (nbTentatives == 3)
		 				throw new ExceptionAccessDB(operation.getNom(), e.getMessage());     
		 			} 
		 		}  
		 	} 
	 public List<Alcools> ListerAlcools() throws ExceptionAccessDB { 
		 ListerAlcoolsDB operation = new ListerAlcoolsDB();  
		 ExecuterRequete(operation); 
		 return operation.getListe(); 
	 }
	 public int AjouterChemise(Chemises chemise) throws ExceptionAccessDB { 
		 AjouterChemisesDB operation = new AjouterChemisesDB(chemise);  
		 return ExecuterRequete(operation); 

	 }
}
