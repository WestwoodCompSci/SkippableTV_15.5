package Database;

import java.util.ArrayList;
import java.util.List;

public class Season {

	private  List<String> comments;
	private  List<Episode> episodes;
	private String summary;
	
	private int numOfEpisodes;
	private  int seasonNum;
	
		
		public  void setSummary(String sum)
		{
			summary = sum;
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
		
		
		public  List<Episode> getEpisodes()
		{
			return episodes;
		}
		
		
		public  List<String> getComments(User user)
		{
			List<String> L = new ArrayList<String>();
			L.addAll(comments);
			return L;
		}
		
		public  double getProgress(User user)
		{
			double prog = 0;
			double tot = (double)episodes.size();
			for(int i = 0; i< episodes.size(); i++)
			{
				for(int j = 0; j< user.getEpisodesWatched().size(); j++)
				{
					if(episodes.get(i).equals(user.getEpisodesWatched().get(j)))
					{
						prog++;
					}
				}
			}
			
			double progress = (prog/tot)*100;
			return progress;
		}
		public static void setNumofEps(int numofeps) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	
	
	
	
	
	

