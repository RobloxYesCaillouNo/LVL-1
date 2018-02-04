import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
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
		JButton button1 = new JButton("Joke");
		JButton button2 = new JButton("Punchline");
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "hi");

	}

}
