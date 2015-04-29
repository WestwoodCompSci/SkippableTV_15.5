package SkippableTVGui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
		myLoginFrame.setLocation(400,250);
		myLoginFrame.setPreferredSize(new Dimension(500,550));
		
		
		
		
		Box box = Box.createVerticalBox();
		myLoginFrame.add(box);
		
		//Icon logo = new ImageIcon("skippy.png");
		//logo.setPreferredWidth(30);
		BufferedImage img;
		try {
			img = ImageIO.read(new File("skippy.png"));
			
			JLabel hi = new JLabel(new ImageIcon(img.getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
			
			box.add(hi);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//resize here
	
	
		
		box.add(Box.createVerticalStrut(30));
		
		Box h1Box = Box.createHorizontalBox();
		JLabel Username = new JLabel("Username  ");
		Username.setFont(new Font("Avenir",Font.PLAIN,22));
		h1Box.add(Username);
		JTextField usernameText = new JTextField();
		h1Box.add(usernameText);
		
		
		box.add(h1Box);
		
		Box h2Box = Box.createHorizontalBox();
		JLabel Password = new JLabel("Password   ");
		Password.setFont(new Font("Avenir",Font.PLAIN,22));
		h2Box.add(Password);
		JTextField passwordText = new JTextField();
		h2Box.add(passwordText);
		
		
		box.add(h2Box);
		
		JButton login = new JButton("Login");
		box.add(login);
		
		
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameText.getText();
				String password = passwordText.getText();
				
				//Server server = new Server();
				//boolean valid = server.authenticate(username,password);
				
				//if(valid == true)
				{
					
				}
				
			}
		});
		
		
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
