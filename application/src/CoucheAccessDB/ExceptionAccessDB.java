package CoucheAccessDB;

@SuppressWarnings("serial") 
public class ExceptionAccessDB extends Exception{
 
		private String Details;
	
    // --------------------------------------------------------
    public String getDetails() { return Details; }        
    // --------------------------------------------------------        
    public ExceptionAccessDB(String cause, String details)    {        
    	super(cause);        
    	Details = details;  
    	System.out.println(Details);
    	} 
 }


