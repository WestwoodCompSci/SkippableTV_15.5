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
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import Database.User;


public class userHomeScreen {
	private JFrame myFrame;
	
	public userHomeScreen(){
		myFrame = new JFrame("SkippableTV");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocation(0,0);
		myFrame.setPreferredSize(new Dimension(1440,850));
		Box bigBox = Box.createVerticalBox();
		
		Box topBox = Box.createHorizontalBox();
		JLabel logoLabel = new JLabel();
		Icon logo = new ImageIcon("skippyHomeScreen.png");
		logoLabel.setIcon(logo);
		
		
		JLabel blurb = new JLabel("SkippableTV is an awesome program.");
		
		JButton logoutButton = new JButton("Logout");
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myFrame.dispose();
				new homeScreen();
				
			}
		});
		
		topBox.add(logoLabel);
		topBox.add(blurb);
		topBox.add(Box.createVerticalStrut(100));
		topBox.add(logoutButton);
		bigBox.add(topBox);
		
		Box secondBox = Box.createHorizontalBox();
		JLabel showLabel = new JLabel("Shows");
		JButton searchButton= new JButton("Search");
		JTextField searchInput = new JTextField();
		searchInput.setPreferredSize(new Dimension(100, 100));
		secondBox.add(showLabel);
		secondBox.add(Box.createVerticalStrut(100));
		secondBox.add(searchButton);
		secondBox.add(searchInput);
		bigBox.add(Box.createVerticalStrut(10));
		bigBox.add(secondBox);
		
		 
		
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
