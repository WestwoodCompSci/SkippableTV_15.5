package SkippableTVGui;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class loginScreen {
	
	private JFrame myLoginFrame;
	
	public loginScreen()
	{
		myLoginFrame = new JFrame("SkippableTV");
		myLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myLoginFrame.setLocation(0,0);
		myLoginFrame.setPreferredSize(new Dimension(1440,850));
		
		Box box = Box.createVerticalBox();
		myLoginFrame.add(box);
		
		box.add(Box.createVerticalStrut(30));
		
		Box h1Box = Box.createHorizontalBox();
		JLabel Username = new JLabel("	Username");
		Username.setFont(new Font("Avenir",Font.PLAIN,22));
		h1Box.add(Username);
		JTextField usernameText = new JTextField();
		h1Box.add(usernameText);
		
		box.add(h1Box);
		
		Box h2Box = Box.createHorizontalBox();
		JLabel Password = new JLabel("	Password");
		Password.setFont(new Font("Avenir",Font.PLAIN,22));
		h2Box.add(Password);
		JTextField passwordText = new JTextField();
		h2Box.add(passwordText);
		
		box.add(h2Box);
		
		
		
		myLoginFrame.pack();
		myLoginFrame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new loginScreen(); }
		});
	}
}
