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
	private static List<String> myComments;
	
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
	
	public Show getShow( String Name)
	{
		//parses through the text file looking for the name of a show
	}
	
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
	public static void main(String[] args)
	{
		
	}
}
