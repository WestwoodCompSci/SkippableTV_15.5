package Database;

import java.util.ArrayList;
import java.util.List;

public class Season {

	private List<String> comments;
	private static List<Episode> episodes;
	private String summary;
	private int length;
	private int numOfEpisodes;
	private static int seasonNum;
	
		
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
		
		public void setSeasonNum(int num)
		{
			seasonNum = num;
		}
		
		public void setListOfEpisodes(List<Episode> thing)
		{
			episodes = thing;
		}
		
		public  String getInfo()
		{
			return summary;
		}
		
		
		public static List<Episode> getEpisodes()
		{
			return episodes;
		}
		
		
		public static List<String> getComments(String username)
		{
			List<String> L = new ArrayList<String>();
			return L;
		}
		
		public static int getProgress(String username)
		{
			
			return 1;
		}
		public static void setNumofEps(int numofeps) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	
	
	
	
	
	

