package Database;

import java.util.List;

public class User {

	private String name;
	private String password;
	private List<Show> myShows;
	private String email;
	
	public User()
	{
		name = null;
		password = null;
		myShows = null;
		email = null;
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
		//add to text file
		return thing;
	}
	
	public String addShow(Show show)
	{
		String thing = show.getName();
		//add show to text file
		return thing;
	}
	
	public List<Show> getShows(){
		return myShows;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getUsername()
	{
		return name;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	
	
	
	
}
