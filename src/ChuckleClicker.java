import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	
	JButton button1;
	JButton button2;
	
	public static void main(String[] args) {
		ChuckleClicker c = new ChuckleClicker();
		
		c.makeButtons();
	}

	public void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 100);
		frame.add(panel);
		 button1 = new JButton("Joke");
		panel.add(button1);
		 button2 = new JButton("Punchline");
		panel.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "(Insert text here)");
		
		if(e.getSource() == button1) {
			JOptionPane.showInputDialog("What river do Roblox with pal hair go into?");
		}
		else if(e.getSource() == button2) {
			JOptionPane.showInputDialog("A few users on Roblox make inappropriate user meshes."
					+ " Ban all user meshes!");
		}
	}

}
