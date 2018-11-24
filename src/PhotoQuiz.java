/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
               
               String fox= "https://ichef.bbci.co.uk/news/624/cpsprodpb/F38E/production/_84005326_thinkstockphotos-460190767.jpg";
		// 2. create a variable of type "Component" that will hold your image
               Component image;
		// 3. use the "createImage()"  below to initialize your Component
             image= createImage(fox);
		// 4. add the image to the quiz window
             quizWindow.add(image);
		// 5. call the pack() method on the quiz window
             quizWindow.pack();
		// 6. ask a question that relates to the image
             String one= JOptionPane.showInputDialog("What animal is this?");
		// 7. print "CORRECT" if the user gave the right answer
             if(one.equals("a fox")) {
            	 JOptionPane.showMessageDialog(null, "CORRECT!");
             }
		// 8. print "INCORRECT" if the answer is wrong
             else {
            	 JOptionPane.showMessageDialog(null,"INCORRECT");
             }
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
             quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
             String computer= "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNyetrZsVp3dsCSLmaBqviPdvrsCv08mIjL78vidw6D8JG_lSq";
             Component windows;
             windows= createImage(computer);
		// 11. add the second image to the quiz window
             quizWindow.add(windows);
		// 12. pack the quiz window
              quizWindow.pack();
		// 13. ask another question
              String two= JOptionPane.showInputDialog("What company of computer(s) is this?");
		// 14+ check answer, say if correct or incorrect, etc.
              if(two.equals("Windows")) {
            	  JOptionPane.showMessageDialog(null, "CORRECT!");
              }
              else if(two.equals("Lenovo")) {
            	  JOptionPane.showMessageDialog(null, "CORRECT!");
              }
              else if(two.equals("Acer")) {
            	  JOptionPane.showMessageDialog(null, "CORRECT!");
              }
              else if(two.equals("Dell")) {
            	  JOptionPane.showMessageDialog(null, "CORRECT!");
              }
              else if(two.equals("HP")) {
            	  JOptionPane.showMessageDialog(null, "CORRECT!");
              }
              else {
            	  JOptionPane.showMessageDialog(null,"INCORRECT!");
              }
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





