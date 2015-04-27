package Database;

import java.util.List;

public class Show {
	
	//FIELDS
	//---------------------------------------------------------------
	private static String myName;
	private static String myInfo;
	private static int myNumOfSeasons;
	private static List<String> myEpisodes;
	private static int mySeason;
	
	//CONSTRUCTORS
	//----------------------------------------------------------------
	public Show(String Name, String Info, int NumOfSeasons, List<String> Episodes, int Season)
	{
		myName = Name;
		myInfo = Info;
		myNumOfSeasons = NumOfSeasons;
		myEpisodes = Episodes;
		mySeason = Season;
		
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
	
	public List<String> getEpisodes(int Season)
	{
		return mySeason;
	}
	
	public List<String> getComments(String username)
	{
		
	}
	
	public void isSeason(int season)
	{
		return mySeason;
	}
	
	public Season getSeason(int num)
	{
		
	}
	
	public static void main(String[] args)
	{
		
	}
}
