package Database;

import java.util.List;

public class Episode {
	

	private String episodeName;
	private String episodeInfo;
	private int skippability; 
	private List<String> episodeComments; 
	private int numEpisode;

		public Episode()
		{
			episodeName = "";
			episodeInfo = "";
			skippability = 0;
			episodeComments = null;
			numEpisode = 0;
		}
	
	public String getEpisodeName()
	{
		return episodeName;
		
	}
	
	public String getEpisodeInfo()
	{
		return episodeInfo;
	}
	
	public int getSkippability()
	{
		return skippability;
	}
	
	public List<String> episodeComments()
	{
		return episodeComments;
	}
	
	public int getNumEpisode()
	{
		return numEpisode;
	}
	
	public void setNumEpisode( int x)
	{
		numEpisode = x;
	}
	public void setEpisodeName( String x)
	{
		episodeName = x;
	}
	
	public void setEpisodeInfo( String x)
	{
		episodeInfo = x;
	}

	public void setSkippability( int x)
	{
		skippability = x;
	}
	
	public void setEpisodeComments( List<String> x)
	{
		episodeComments = x;
	}

}
