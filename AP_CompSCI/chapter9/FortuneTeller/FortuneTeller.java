// Fortune Teller
package FortuneTeller;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FortuneTeller extends JFrame
    implements ActionListener
{
  //private static final EasySound ding = new EasySound("ding.wav");

  // Declare an array of "fortunes" (strings):\
	
private static final long serialVersionUID = 1L;

public String[] fortunes = {
		  "Yes, of course!",
		  "Without a doubt, yes.",
		  "You can count on it.",
		  "For sure!",
		  "Ask me later.",
		  "I'm not sure.",
		  "I can't tell you right now.",
		  "I.ll tell you after my nap.",
		  "No way!",
		  "I don't think so.",
		  "Without a doubt, no.",
		  "The answer is clearly NO!"
  };

  private JTextField display;
  
  public FortuneTeller()
  {
    super("Fortune Teller");

    display = new JTextField("  Press \"Next\" to see your fortune...", 25);
    display.setBackground(Color.WHITE);
    display.setEditable(false);

    JButton go = new JButton("Next");
    go.addActionListener(this);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(display);
    c.add(go);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    // Pick and display a random fortune:

    Random rand = new Random();
    
    String selection = fortunes[rand.nextInt(fortunes.length)];

    display.setText("  " + selection );
   // ding.play();
  }

  public static void main(String[] args)
  {
    JFrame window = new FortuneTeller();
    window.setBounds(300, 300, 300, 100);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setVisible(true); 
  }
}
