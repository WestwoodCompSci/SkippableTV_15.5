import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class SkippableTVGUI {

	private JFrame myFrame;
	
	public SkippableTVGUI()
	{

		myFrame = new JFrame("SkippableTV");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocation(0,0);
		myFrame.setPreferredSize(new Dimension(1440,850));
		
		
		
		
				
		myFrame.pack();
		myFrame.setVisible(true);	
	}
	
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new SkippableTVGUI(); }
		});
	}

}
