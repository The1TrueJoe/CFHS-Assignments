package FRQ2017_1;

import java.util.ArrayList;
//a 1
public class Digits
{
  /** The list of digits from the number used to construct this object.
   *  The digits appear in the list in the same order in which they appear in the original number.
   */
  private ArrayList<Integer> digitList;

  /**************** Part (a) ****************/

  /** Constructs a Digits object that represents num.
   *  Precondition: num >= 0
   */

  public Digits(int num)
  {
   String number = ((Integer) num).toString();
   
   for(int i = 0; i < number.length(); i++) {
	   digitList.add(Integer.parseInt(number.charAt(i) + ""));
   }
  }

 

  public String toString()
  {
    return digitList.toString();
  }

  /**************** Part (b) ****************/

  /** Returns true if the digits in this Digits object are in strictly increasing order;
   *  false otherwise.
   */
  public boolean isStrictlyIncreasing()
  {
   for(int i = 0; i < digitList.size(); i++) {
	   if (digitList.get(i) > digitList.get(i+1)) {
		   return false;
	   }
   }
   
   return true;
  }

  public static void main(String[] args)
  {
    Digits d1 = new Digits(15704);
    System.out.println(d1);

    Digits d2 = new Digits(0);
    System.out.println(d2);

    System.out.println((new Digits(7)).isStrictlyIncreasing()); // true
    System.out.println((new Digits(1356)).isStrictlyIncreasing()); // true
    System.out.println((new Digits(1336)).isStrictlyIncreasing()); // false
    System.out.println((new Digits(1536)).isStrictlyIncreasing()); // false
    System.out.println((new Digits(65310)).isStrictlyIncreasing()); // false
  }
}