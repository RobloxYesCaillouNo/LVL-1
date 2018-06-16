import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener{
	static JPanel panel = new JPanel();
	static JFrame frame = new JFrame();
	static JTextField textfield1 = new JTextField(15);
	static JButton button = new JButton("Translate");
	static JTextField textfield = new JTextField(15);
	public static void main(String[] args) {
		PigLatin pig = new PigLatin();
		pig.MakeGui();
	}
	void MakeGui() {
		frame.add(panel);	
		panel.add(textfield);
		panel.add(button);
		panel.add(textfield1);
		frame.setVisible(true);
		frame.pack();
		button.addActionListener(this);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			PigLatinTranslator pig1 = new PigLatinTranslator();
			String latiin = pig1.translate(textfield.getText());
			textfield1.setText(latiin);
			
	}
}
