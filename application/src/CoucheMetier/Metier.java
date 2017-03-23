package CoucheMetier;

import CoucheAccessDB.*;
import java.util.*;
import ClassesMetier.*;

public class Metier {
	private AccessDB accessDB;
	
	public Metier() throws ExceptionAccessDB{
		accessDB = new AccessDB();
	
	}
	public List<Alcools> ListerAlcools() throws ExceptionAccessDB { 
		return accessDB.ListerAlcools(); 
	}
	public List<Chemises> ListerChemises() throws ExceptionAccessDB { 
		return accessDB.ListerChemises(); 
	}
	public List<Vins> ListerVins() throws ExceptionAccessDB { 
		return accessDB.ListerVins(); 
	}
	public List<Client> ListerClients() throws ExceptionAccessDB { 
		return accessDB.ListerClients(); 
	}
	public List<Commande> ListerCommandes(int IDclient) throws ExceptionAccessDB { 
		return accessDB.ListerCommandes(IDclient); 
	}
	public int AjouterChemise(Chemises chemise) throws ExceptionAccessDB { 
		return accessDB.AjouterChemise(chemise);
	}
	public int AjouterAlcool(Alcools Alcool) throws ExceptionAccessDB { 
		return accessDB.AjouterAlcool(Alcool);
	}
	public int AjouterVin(Vins vin) throws ExceptionAccessDB { 
		return accessDB.AjouterVin(vin);
	}
	
}
