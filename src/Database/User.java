package Database;

import java.util.List;

public class User {

	private String name;
	private String password;
	private List<Show> myShows;
	private String email;
	
	public User()
	{
		
	}
	
	public String addPassword(String password)
	{
		String thing = password;
		//encrypt thing
		return thing;
		
	}
	
	public String addUsername(String username)
	{
		String thing = username;
		//encrypt thing
		return thing;
	}
	
	public String addUserEmail(String email)
	{
		String thing = email;
		//encrypt email
		return thing;
	}
	
	public String addShow(Show show)
	{
		
	}
	
	
}
