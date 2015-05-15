package Database;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class User {

	private   String name;
	private   String password;
	private   List<Show> myShows;
	private   String email;
	private  List<Episode> episodeswatched;
	private  FileWriter fw;
	
	
	
	public User()
	{
		name = null;
		password = null;
		myShows = null;
		email = null;
	}
	
	public  String addPassword(String password)
	{
		String thing = password;
		
		return thing;
	}
	
	public  String addUsername(String username)
	{
		String thing = username;
		
		return thing;
	}
	
	public   String addUserEmail(String email)
	{
		String thing = email;
	
		return thing;
	}
	
	public  void addEpisodeWatched(Episode thing)
	{
		episodeswatched.add(thing);
	}
	
	public   String addShow(Show show)
	{
		String thing = show.getName();
		return thing;
	}
	
	public   List<Show> getShows(){
		
		return myShows;
	}
	
	public   String getEmail()
	{
		
		return email;
	}
	
	public   String getUsername()
	{
		
		return name;
	}
	
	public   String getPassword()
	{
		
		return password;
	}
	
	public  List<Episode> getEpisodesWatched()
	{
		
		return episodeswatched;
	}
	

	
}
