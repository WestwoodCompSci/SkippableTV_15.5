package Database;

import java.util.List;

public class Show {
	
	//FIELDS
	//---------------------------------------------------------------
	private  String myName;
	private  String myInfo;
	private  int myNumOfSeasons;
	private  List<String> myEpisodes;
	private  int mySeason;
	private  List<String> myComments;
	
	//CONSTRUCTORS
	//----------------------------------------------------------------
	public Show(String Name, String Info, int NumOfSeasons, List<String> Episodes, int Season, List<String> Comments)
	{
		myName = Name;
		myInfo = Info;
		myNumOfSeasons = NumOfSeasons;
		myEpisodes = Episodes;
		mySeason = Season;
		myComments = Comments;
		
	}
	//METHODS
	//----------------------------------------------------------------
	
	
	public String getName()
	{
		return myName;
	}
	

	public String getInfo()
	{
		return myInfo;
	}
	
	public int getNumOfSeasons()
	{
		return myNumOfSeasons;
	}
	
	public List<String> getEpisodes()
	{
		return myEpisodes;
	}
	
	public List<String> getComments(String username)
	{
		return myComments;
	}
	
	public boolean isSeason(int season)
	{
		return season>0 && season<=myNumOfSeasons;
	}
	
	public int getSeason(int num)
	{
		return mySeason;
	}
	
	public String setName(String x)
	{
		return myName = x;
	}


	public void setNumofSeasons(int numofseasons) {
		myNumOfSeasons = numofseasons;
		
	}
}
