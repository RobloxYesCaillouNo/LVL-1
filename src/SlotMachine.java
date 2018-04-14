
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//visit roblox.com/games to play a game on roblox!
//¡visita roblox.com/games para jugar a roblox!

public class SlotMachine implements ActionListener {
	JButton button = new JButton();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();

	public static void main(String[] args) throws MalformedURLException {
		SlotMachine slot = new SlotMachine();
		slot.create();
	}

	public void create() throws MalformedURLException {
		frame.setVisible(true);
		panel.setVisible(true);
		// frame.setSize(1000, 500);
		frame.setTitle("Slot machine game...lol");
		frame.add(button);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		button.addActionListener(this);
		frame.pack();
		frame.add(panel);
		roll();
	}

	public void roll() throws MalformedURLException {
		panel.remove(label1);
		panel.remove(label2);
		panel.remove(label3);
		String Cherries;
		Cherries = "CherriesForSlotmachine.png";
		String Bar;
		Bar = "BarSymbol.png";
		String orange;
		orange = "images.png";
		Random gen = new Random();
		int d = gen.nextInt(3);
		
		if (d == 0) {
			label1 = createLabelImage(orange);
		}
		if (d == 1) {
			label1 = createLabelImage(Bar);
		}
		if (d == 2) {
			label1 = createLabelImage(Cherries);
		}
		int a = gen.nextInt(3);
		if (a == 0) {
			label2 = this.createLabelImage(orange);
		}
		if (a == 1) {
			label2 = this.createLabelImage(Bar);
		}
		if (a == 2) {
			label2 = this.createLabelImage(Cherries);
		}
		int b = gen.nextInt(3);
		if (b == 0) {
			label3 = this.createLabelImage(orange);
		}
		if (b == 1) {
			label3 = this.createLabelImage(Bar);
		}
		if (b == 2) {
			label3 = this.createLabelImage(Cherries);
		}
		
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		if (d == a && a == b) {
			System.out.println("You Win!");
		}
		frame.pack();

	}

	private JLabel createLabelImage(String cherries) throws MalformedURLException {
		URL imageURL = getClass().getResource(cherries);
		if (imageURL == null) {
			System.err.println("Could not find image " + cherries);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(button)) {
			try {
				roll();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
}
