package SkippableTVGui;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import java.awt.Dimension;

import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class homeScreen {
	
	private JFrame myFrame;
	
	public homeScreen(){
		myFrame = new JFrame("SkippableTV");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocation(0,0);
		myFrame.setPreferredSize(new Dimension(1440,850));
		Box bigBox = Box.createVerticalBox();
		Box topBox = Box.createHorizontalBox();
		JButton login = new JButton("Login");
		JButton newUser = new JButton("New User");
		JLabel logoLabel = new JLabel();
		Icon logo = new ImageIcon("skippyHomeScreen.png");
		
		bigBox.add(topBox);
		logoLabel.setIcon(logo);
		topBox.add(logoLabel);
		myFrame.add(bigBox);
		
		JLabel blurb = new JLabel("SkippableTV is an awesome program.");
		topBox.add(blurb);
		
		topBox.add(login);
		
		topBox.add(newUser);
	
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new loginScreen();
			myFrame.dispose();
				
			}
		});
		
		newUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new newUserScreen();
			myFrame.dispose();
				
			}
		});
		myFrame.pack();
		myFrame.setVisible(true);
	
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new homeScreen(); }
		});
	}
}
