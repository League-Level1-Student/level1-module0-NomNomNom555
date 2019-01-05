import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fortune implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton button;
public static void main(String[] args) {
	Fortune fc = new Fortune();
	fc.showButton();
}
public void showButton() {
	frame= new JFrame();
	panel= new JPanel();
	button= new JButton("Fortune");
	frame.add(panel);
	panel.add(button);
	button.addActionListener(this);
	frame.pack();
	frame.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()== button) {
		JOptionPane.showMessageDialog(null, "WOOHOO!");
		int rand= new Random().nextInt(5);
		if(rand==0) {
			JOptionPane.showMessageDialog(null,"a good day soon");
		}
		else if(rand==1) {
			JOptionPane.showMessageDialog(null,	"bad day");
		}
		else if(rand==2) {
			JOptionPane.showMessageDialog(null,"keep cool");
		}
		else if(rand==3) {
			JOptionPane.showMessageDialog(null,"don't be afraid");
		}
		else if(rand==4) {
			JOptionPane.showMessageDialog(null,"extra isn't always best");
		}
	}
	
}
}
