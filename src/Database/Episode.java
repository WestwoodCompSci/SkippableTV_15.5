package Database;

import java.util.List;

public class Episode {
	

	private static String episodeName;
	private static String episodeInfo;
	private static int skippability; 
	private static int numEpisode;

		public Episode()
		{
			episodeName = "";
			episodeInfo = "";
			skippability = 0;
			numEpisode = 0;
		}
	
	public static String getEpisodeName()
	{
		return episodeName;
		
	}
	
	public  static String getEpisodeInfo()
	{
		return episodeInfo;
	}
	
	public static int getSkippability()
	{
		return skippability;
	}
	

	
	public static int getNumEpisode()
	{
		return numEpisode;
	}
	
	public void setNumEpisode( int x)
	{
		numEpisode = x;
		//add to text file
	}
	public void setEpisodeName( String x)
	{
		episodeName = x;
		//add to text file
	}
	
	public void setEpisodeInfo( String x)
	{
		episodeInfo = x;
		//add to text file
	}

	public void setSkippability( int x)
	{
		skippability = x;
		//add to text file
	}
	

}
