package FRQ2016_1;
import java.util.ArrayList;

/* Part (a) */

public class RandomStringChooser
{
  private ArrayList<String> words;

  public RandomStringChooser(String[] wordArray)
  {
    words = new ArrayList<String>();
    
    for (String w : wordArray) {
      words.add(w);
    }
  }

  public String getNext()
  {
    if (words.size() == 0) {
      return "NONE";
    }
    
    int i = (int)(Math.random() * words.size());
    
    return words.remove(i);
  }
}