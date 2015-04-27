package Database;

import java.util.List;

public class Season {

	private List<String> comments;
	private String summary;
	private int length;
	private int numOfEpisodes;
	
		
		public  void setSummary(String sum)
		{
			summary = sum;
		}
		public  void setSeasonLength(int seasonLength)
		{
			length = seasonLength;
		}
		public  void setNumOfEpisodes(int num)
		{
			numOfEpisodes = num;
		}
		public  int getSeason(String show)
		{
		
		}
		
		public  String getInfo()
		{
			return summary;
		}
		
		
		public static List<String> getEpisodes()
		{
			return Show.getEpisodes();
		}
		
		public static List<String> getEpisodes(int season)
		{
			
		}
		
		public static List<String> getComments(String username)
		{
			List<String> L = new List<String>();
			return L;
		}
		
		public static int getProgress(String username)
		{
			
			return 1;
		}
	}
	
	
	
	
	
	
	
	

