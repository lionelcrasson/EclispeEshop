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
	public int AjouterChemise(Chemises chemise) throws ExceptionAccessDB { 
		return accessDB.AjouterChemise(chemise);
	}
}
