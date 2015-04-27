package Database;

import java.util.List;

public class User {

	private static  String name;
	private static  String password;
	private  static List<Show> myShows;
	private static  String email;
	
	public User()
	{
		name = null;
		password = null;
		myShows = null;
		email = null;
	}
	
	public static String addPassword(String password)
	{
		String thing = password;
		//encrypt thing
		return thing;
	}
	
	public static String addUsername(String username)
	{
		String thing = username;
		//encrypt thing
		return thing;
	}
	
	public static  String addUserEmail(String email)
	{
		String thing = email;
		//encrypt email
		//add to text file
		return thing;
	}
	
	public static  String addShow(Show show)
	{
		String thing = show.getName();
		//add show to text file
		return thing;
	}
	
	public static  List<Show> getShows(){
		return myShows;
	}
	
	public static  String getEmail()
	{
		return email;
	}
	
	public static  String getUsername()
	{
		return name;
	}
	
	public static  String getPassword()
	{
		return password;
	}
	
	
	
	
	
}
