package Database;
import java.util.*;
public class Databases 
{
	//FIELDS TODO
	private String Username;
	private String Password;
	private String name;
	private User user;
	public void Database()
	{
		Username="";
		Password="";
		name="";
	}
	
	public String lookupPassword(String Password)
	{
		return Password;
		
	}
	public String lookupUsername(String Username)
	{
		return Username;

	}
	public User getUser(String Username, String password)
	{
		if(User.getUsername()==Username &&	User.getPassword() ==Password)
		{
			user=new User();
			user.addUsername(Username);
			user.addPassword(password);
			
			return user;
		}
		return null;
	}
	public List<Show> getShow(String name)
	{
		return user.getShows();
	}
	
	
	
	
	
	
}
