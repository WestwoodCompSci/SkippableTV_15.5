package SkippableTVGui;

import java.awt.Color;
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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		
		box.add(Box.createVerticalStrut(10));
		
		//Icon logo = new ImageIcon("skippy.png");
		//logo.setPreferredWidth(30);
		BufferedImage img;
		try {
			img = ImageIO.read(new File("skippy.png"));
			
			JLabel hi = new JLabel(new ImageIcon(img.getScaledInstance(150, 150, Image.SCALE_DEFAULT)));
			
			box.add(hi);
			
			
			myLoginFrame.setIconImage(img);


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//resize here
	
	
		
		box.add(Box.createVerticalStrut(35));
		
		Box h1Box = Box.createHorizontalBox();
		JLabel Username = new JLabel("Username  ");
		Username.setFont(new Font("Avenir",Font.PLAIN,22));
		h1Box.add(Username);
		JTextField usernameText = new JTextField();
		h1Box.add(usernameText);
		h1Box.add(Box.createHorizontalStrut(30));
		
		
		box.add(h1Box);
		
		box.add(Box.createVerticalStrut(40));
		
		Box h2Box = Box.createHorizontalBox();
		JLabel Password = new JLabel("Password   ");
		Password.setFont(new Font("Avenir",Font.PLAIN,22));
		h2Box.add(Password);
		JTextField passwordText = new JTextField();
		h2Box.add(passwordText);
		h2Box.add(Box.createHorizontalStrut(30));
		
		
		box.add(h2Box);
		
		box.add(Box.createVerticalStrut(15));
		
		
		JButton login = new JButton("Login");
		box.add(login);
		box.add(Box.createVerticalStrut(15));
		
		passwordText.addKeyListener(new KeyListener(){

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					login.doClick();
					
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
		
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameText.getText();
				String password = passwordText.getText();
				
				//Server server = new Server();
				//boolean valid = server.authenticate(username,password);
				boolean valid = false;
				
				if(valid == false)
				{
					JOptionPane.showMessageDialog(myLoginFrame, "Wrong username/password");
				}else{
					new userHomeScreen();
					myLoginFrame.dispose();
				}
				
				
				
			}
		});
		

		myLoginFrame.pack();
		myLoginFrame.setVisible(true);
		myLoginFrame.setResizable(false);

	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new userHomeScreen(); }
		});
	}
}
