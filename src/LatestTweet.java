import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LatestTweet implements ActionListener{
static JPanel panel = new JPanel();
static JFrame frame = new JFrame();
static JButton button = new JButton("Search the Twitterverse");
static JTextField textfield = new JTextField(10);
	public static void main(String[] args) {
frame.add(panel);	
panel.add(button);
panel.add(textfield);
frame.setVisible(true);
frame.pack();
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
