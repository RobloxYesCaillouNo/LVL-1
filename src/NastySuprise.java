import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener{
	static JPanel panel = new JPanel();
	static JFrame frame = new JFrame();
	static JButton button = new JButton("Trick");
	static JButton button1 = new JButton("Treat");
	public static void main(String[] args) {
	NastySuprise suprise = new NastySuprise();
	suprise.MakeGui();
	}
	void MakeGui() {
		frame.add(panel);	
		panel.add(button);
		panel.add(button1);
		frame.setVisible(true);
		frame.pack();
		button.addActionListener(this);
		button1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(button)) {
			showPictureFromTheInternet("https://01iajxoiw1-flywheel.netdna-ssl.com/wp-content/uploads/2017/11/cute.jpg");
		}
		else if (buttonPressed.equals(button1)) {
			showPictureFromTheInternet("http://i0.kym-cdn.com/photos/images/original/000/545/114/d44.jpeg");
		}
	}
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}

}
