package SkippableTVGui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class newUserScreen {
	
	private JFrame myNewUserFrame;
	// Network myNetwork = new Network();
	public newUserScreen()
	{
		myNewUserFrame = new JFrame("SkippableTV");
		myNewUserFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myNewUserFrame.setLocation(400,250);
		myNewUserFrame.setPreferredSize(new Dimension(500,550));
		
		
		
		Box box = Box.createVerticalBox();
		myNewUserFrame.add(box);
		
		box.add(Box.createVerticalStrut(10));
		
		//Icon logo = new ImageIcon("skippy.png");
		//logo.setPreferredWidth(30);
		BufferedImage img;
		try {
			img = ImageIO.read(new File("skippy.png"));
			
			JLabel hi = new JLabel(new ImageIcon(img.getScaledInstance(150, 150, Image.SCALE_DEFAULT)));
			
			box.add(hi);
			
			
			myNewUserFrame.setIconImage(img);


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//resize here
	
	
		
		box.add(Box.createVerticalStrut(35));
		
		Box h1Box = Box.createHorizontalBox();
		JLabel createUsername = new JLabel("Create New Username:  ");
		createUsername.setFont(new Font("Avenir",Font.PLAIN,18));
		h1Box.add(createUsername);
		JTextField usernameText = new JTextField();
		h1Box.add(usernameText);
		h1Box.add(Box.createHorizontalStrut(30));
		
		
		box.add(h1Box);
		
		box.add(Box.createVerticalStrut(40));
		
		Box h2Box = Box.createHorizontalBox();
		JLabel createPassword = new JLabel("Create Password   ");
		createPassword.setFont(new Font("Avenir",Font.PLAIN,18));
		h2Box.add(createPassword);
		JTextField passwordText = new JTextField();
		h2Box.add(passwordText);
		h2Box.add(Box.createHorizontalStrut(30));
		
		
		box.add(h2Box);
		
		box.add(Box.createVerticalStrut(40));
		
		Box h3Box = Box.createHorizontalBox();
		JLabel enterEmail = new JLabel("Enter Email:   ");
		enterEmail.setFont(new Font("Avenir",Font.PLAIN,18));
		h3Box.add(enterEmail);
		JTextField emailText = new JTextField();
		h3Box.add(emailText);
		h3Box.add(Box.createHorizontalStrut(30));
		
		
		box.add(h3Box);
		
		box.add(Box.createVerticalStrut(15));
		
		
		JButton createAccount = new JButton("Create Account");
		box.add(createAccount);
		box.add(Box.createVerticalStrut(15));
		
		passwordText.addKeyListener(new KeyListener(){

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					createAccount.doClick();
					
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		
		});
		
		createAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameText.getText();
				String password = passwordText.getText();
				String email = emailText.getText();
				
			
			}
		});
		

		myNewUserFrame.pack();
		myNewUserFrame.setVisible(true);
		myNewUserFrame.setResizable(false);

	}
	
	public static void main(String[] args)
	{
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new newUserScreen(); }
		});
	}
}
