package SkippableTVGui;

import javax.swing.SwingUtilities;

public class newUserScreen {
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new userHomeScreen(); }
		});
	}
}
