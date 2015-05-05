package Database;

import java.util.List;

public class Episode {
	

	private  String episodeName;
	private  String episodeInfo;
	private  int skippability; 
	private  int numEpisode;

		public Episode()
		{
			episodeName = "";
			episodeInfo = "";
			skippability = 0;
			numEpisode = 0;
		}
	
	public  String getEpisodeName()
	{
		return episodeName;
		
	}
	
	public   String getEpisodeInfo()
	{
		return episodeInfo;
	}
	
	public  int getSkippability()
	{
		return skippability;
	}
	

	
	public  int getNumEpisode()
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
