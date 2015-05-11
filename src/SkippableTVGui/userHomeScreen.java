package SkippableTVGui;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public class userHomeScreen {
	private JFrame myFrame;
	
	public userHomeScreen(){
		myFrame = new JFrame("SkippableTV");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocation(0,0);
		myFrame.setPreferredSize(new Dimension(1440,850));
		Box bigBox = Box.createVerticalBox();
		
		Box loginBox = Box.createHorizontalBox();
		Box logoBox = Box.createHorizontalBox();
		JLabel logoLabel = new JLabel();
		Icon logo = new ImageIcon("skippyHomeScreen.png");
		logoLabel.setIcon(logo);
		
		JLabel blurb = new JLabel("SkippableTV is an awesome program.");
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		logoBox.add(logoLabel);
		logoBox.add(blurb);
		
		loginBox.add(loginButton);
		
		bigBox.add(logoBox);
		
		bigBox.add(loginBox);
		
		
		 
		
		myFrame.add(bigBox);
		myFrame.pack();
		myFrame.setVisible(true);	
		
		//link to homeScreen (via logout)
	}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new userHomeScreen(); }
		});
	}
	
}
