package APLUSSkeletons;
import java.util.List;
import java.util.ArrayList;

public class CrosswordPuzzle
{
	private Square[][] puzzle;
	
	public CrosswordPuzzle( boolean[][] blackSquares ) 
	{ 
		//add code here for Part B of Question 3 	
	} 
    	
	public boolean toBeLabeled( int r, int c, boolean[][] blackSquares )
	{
		//add code here for Part A of Question 3 	
		return false;
	}   
    	
    	//not part of the exam, but helpful to see the grid
    public String toString()
    {
    	String ret = "";
    	for( Square[] row : puzzle )
    	{
    		for( Square it : row )
    		{
    			if( it == null )
    				ret += String.format("%-9s","null");
    			else
    				ret += it;
    		}
    		ret += "\n";
    	}
    	return ret;
    }
}