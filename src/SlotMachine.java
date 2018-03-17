
import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SlotMachine {
	public static void main(String[] args) {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();	
	frame.setVisible(true);
	frame.setSize(1000, 500);
	frame.setTitle("Slot machine game...lol");
	JPanel panel = new JPanel();
	frame.add(panel);
	String Cherries;
	Cherries = "CherriesForSlotmachine.png";
	JLabel Cherries1 = createLabelImage(Cherries);
	frame.pack();

	}
	  private JLabel createLabelImage(String cherries)
				throws MalformedURLException
		{
			URL imageURL = getClass().getResource(cherries);
			if (imageURL == null)
			{
				System.err.println("Could not find image " + cherries);
				return new JLabel();
			}
			Icon icon = new ImageIcon(imageURL);
			JLabel imageLabel = new JLabel(icon);
			return imageLabel;
		}
}
