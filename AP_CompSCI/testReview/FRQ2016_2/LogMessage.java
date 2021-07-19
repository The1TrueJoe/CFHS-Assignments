package FRQ2016_2;
public class LogMessage
{
	private String machineId;
	private String description;
	
    public LogMessage( String message ) 
    {
    	machineId = message.substring(0, message.indexOf(':'));
    	description = message.substring(message.indexOf(':'), message.length());
    }
     
    public void setMessage( String message ) 
    {
    	machineId = message.substring(0, message.indexOf(':'));
    	description = message.substring(message.indexOf(':'), message.length());
    }
    
    public boolean containsWord( String keyword )
    {
    	if (description.contains(keyword)) {
    		if (description.substring(0, keyword.length()).equals(keyword) || 
    				(description.charAt(description.indexOf(keyword+1)) + " ").equals(" ")) {
    			
    			if (description.substring(description.length() - keyword.length(), description.length()).equals(keyword) ||
    					(description.charAt(description.indexOf(keyword+1)) + " ").equals(" ")) {
    				
    				return true;
    				
    			} else {
    				return false;
    			} 
    			
    		} else {
    			return false;
    		}
    		
    	} else {
    		return false;
    	}
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
    	return "" + machineId + ":" + description;
    }    
}