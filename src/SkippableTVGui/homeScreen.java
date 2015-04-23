package SkippableTVGui;
import javax.swing.JFrame;
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
		JButton testButton = new JButton("test");
		myFrame.add(testButton);
		myFrame.pack();
		myFrame.setVisible(true);	
	
	
		testButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				new userHomeScreen();	
				myFrame.dispose();
			}
		});
	}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new homeScreen(); }
		});
	}
}
