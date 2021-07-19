package APLUSSkeletons;
public class LogMessage
{
	private String machineId;
	private String description;
	
    public LogMessage( String message ) 
    {
    	//add code here for Part A of Question 2
    }
    
    public void setMessage( String message )
    {
     	//add code here for Part A of Question 2
    }
    
    public boolean containsWord( String keyword )
    {
    	//add code here for Part B of Question 2
      return false;
    }
    
    public String getMachineId()
    {
    	return machineId;
    }
    
    public String getDescription()
    {
    	return description;
    }
    
    public String toString()
    {
    	return "" + machineId + " " + description;
    }    
}