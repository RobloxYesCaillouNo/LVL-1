import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IntroToBianary implements ActionListener {
	JFrame frame = new JFrame("Convert 8 bits of binary to ASCII");
	JPanel panel = new JPanel();
	JTextField field = new JTextField(20);
	JButton button = new JButton("Convert");

	public static void main(String[] args) {
		IntroToBianary bianry = new IntroToBianary();
		bianry.MakeGui();
	}

	void MakeGui() {
		frame.add(panel);
		panel.add(field);
		panel.add(button);
		frame.setVisible(true);
		frame.pack();
		button.addActionListener(this);

	}

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (button.equals(e.getSource())) {
			JOptionPane.showMessageDialog(null, convert(field.getText()));
		}
	}

}
