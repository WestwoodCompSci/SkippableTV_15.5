package SkippableTVGui;

import java.awt.Dimension;

import javax.swing.JFrame;

public class userHomeScreen {
	private JFrame myFrame;
	
	public userHomeScreen(){
		myFrame = new JFrame("SkippableTV");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocation(0,0);
		myFrame.setPreferredSize(new Dimension(1440,850));
		
		myFrame.pack();
		myFrame.setVisible(true);	
	}
}
