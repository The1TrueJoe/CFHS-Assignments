// JosephTelaak


package FRQ;

public class CH7And9Test3by3StudentFile
{ // char array is a field
	
	
   public static char[][] grid={{'a','c','c'},
  						   	   	{'b','b','b'},
  						   	   	{'b','c','f'}};
	
	
  // the main calls the find3and3 method
  public static void main(String[] args)
  {
   // Call the find3and3 method.
    //< insert code here>
    find3and3(grid);


  }// end main
  /**
   * This method checks to see if a char in the 
   * array appears 3 times in a row and 3 times in a column.
   * if both of the above conditions are true, print the char &
   * each of its locations indicating in which row and column the 
   * char appeared.
   * @param grid is an array of chars.
   */
  public static  void find3and3(char[][] grid) 
  { 
  //< Insert code here to process the grid in row column order.>
    
   
   //< for loop to process the rows.>
   for (int row = 0; row < grid.length; row++) {
    
     //< for loop to process the columns.> 
	 for (int col = 0; col < grid[row].length; col++) {
	   
        char ch = grid[row][col];//Assign char from grid
        
        // Call other methods.
        boolean is3InRow=findCharInRow(ch,row);
        boolean is3InCol=findCharInCol(ch,col);
        is3By3(is3InRow,is3InCol,ch);
        
	 }
   }
  
  }
  /**
   * 
   * @param ch ,char from the grid array
   * @param row , will be passed in and the column will be checked
   * for appearances of the char
   * @return true or false
   */
  public static boolean findCharInRow(char ch, int row) {
  //< Insert code for method.>
	  
	  boolean inRow = false;
	  
	  for (int i = 0; i < grid[row].length; i++) {
		  if ((ch + "").equals(grid[row][i] + "")) {
			  inRow = true;
		  } else {
			  return false;
		  }
	  }
	  
	  return inRow;
	  
	  
  }
 
  /**
   * 
   * @param ch,char from the grid array
   * @param col column will be passed in and the row will be checked
   * for appearances of the char
   * @return true or false
   */
  public static boolean findCharInCol(char ch,int col) {
  //< Insert code for method.>
	  
	  boolean inCol = false;
	  
	  for (int i = 0; i < grid.length; i++) {
		  if ((ch + "").equals(grid[i][col] + "")) {
			  inCol = true;
		  } else {
			  return false;
		  }
	  }
	  
	  return inCol;
	  
	  
  }
  

  
  
  /**
   * If is3InRow & is3InCol are both true then print the char
   * and each of its locations in row then column order. 
   * @param is3InRow , does the char appear in the row 3 times?
   * @param is3InCol . does the char appear in the column 3 times?
   * @param ch 
   */
 public static void is3By3(boolean is3InRow,boolean is3InCol,char ch) {
 //< Insert code for method.>
	 
	 if (is3InRow && is3InCol) {
		 for (int row = 0; row < grid.length; row++) {
			 for (int col = 0; col < grid[row].length; col++) {
				 if ((grid[row][col] + "").equals(ch + "")) {
					 System.out.println(ch + ": (" + row + ", " + col + ")");
				 }
			 }
		 }
	 } 
	 
 } // if?
 
  
}// end class
