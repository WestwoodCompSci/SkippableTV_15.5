package SkippableTVGui;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class userHomeScreen {
	private JFrame myFrame;
	
	public userHomeScreen(){
		myFrame = new JFrame("SkippableTV");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocation(0,0);
		myFrame.setPreferredSize(new Dimension(1440,850));
		
		Icon logo = new ImageIcon("skippy.png");
		JLabel logoLabel = new JLabel(logo);
		Box topBox = Box.createHorizontalBox();
		topBox.add(logoLabel);
		myFrame.add(topBox);
		
		myFrame.pack();
		myFrame.setVisible(true);	
		
		//link to homeScreen (via logout)
	}
	
}
