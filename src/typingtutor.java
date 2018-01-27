import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class typingtutor implements KeyListener {

	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	char currentLetter;

	public static void main(String[] args) {
		typingtutor tutor = new typingtutor();
		tutor.CreateGUI();
	}

	private void CreateGUI() {
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		frame.setVisible(true);
		frame.setTitle("Type or Die");
		frame.add(label);
		frame.setSize(500, 500);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("You typed: " + e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
	}
}