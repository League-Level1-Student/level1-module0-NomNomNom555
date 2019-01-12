import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SensitiveKeyBoard implements KeyListener{
	JFrame frame;
	JPanel panel;
public static void main(String[] args) {
	new SensitiveKeyBoard().createUI();
}
void createUI() {
	frame= new JFrame();
	panel= new JPanel();
	frame.add(panel);
	frame.addKeyListener(this);
	frame.setVisible(true);
	frame.pack();
}
static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }


public void keyPressed(KeyEvent arg0) {
	
	speak("Ouch!");	
	
	
}

public void keyReleased(KeyEvent arg0) {

}

public void keyTyped(KeyEvent arg0) {
	
}

}
