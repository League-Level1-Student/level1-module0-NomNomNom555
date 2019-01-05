import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton item;
	JButton second;
	JButton last;
	
public static void main(String[] args) {
	new Cuteness().createUI();
}
void createUI() {
	frame= new JFrame();
	panel= new JPanel();
	item= new JButton("Watch cute doges");
	second= new JButton("Watch adorable frog");
	last= new JButton("Watch funny/cute animation");
	frame.add(panel);
	panel.add(item);
	panel.add(second);
	panel.add(last);
	item.addActionListener(this);
	second.addActionListener(this);
	last.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
}


void showDoge() {
    playVideo("https://www.youtube.com/watch?v=kMhw5MFYU0s");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=aPWWGpgCe24");
}

void showVid() {
    playVideo("https://www.youtube.com/watch?v=oHfqNUyavAI");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
    
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==item) {
		showDoge();
	}
	else if(e.getSource()== second) {
		showFrog();
	}
	else if(e.getSource()== last) {
		showVid();
	}
}

}
