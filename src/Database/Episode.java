package Database;

import java.util.List;

public class Episode {
	

	private static String episodeName;
	private static String episodeInfo;
	private static int skippability; 
	private static List<String> episodeComments; 
	private static int numEpisode;

		public Episode()
		{
			episodeName = "";
			episodeInfo = "";
			skippability = 0;
			episodeComments = null;
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
	
	public static List<String> getEpisodeComments()
	{
		return episodeComments;
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
	
	public void setEpisodeComments( List<String> x)
	{
		episodeComments = x;
		//add to text file 
	}

}
