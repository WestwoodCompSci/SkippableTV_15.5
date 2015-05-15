package Database;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Encoder.*;

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
		if(user.getUsername()==Username &&	user.getPassword() ==Password)
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
	
	public void appendtoDatabaseFile(Show myShow,Season mySeason,Episode myEpisode)
	{
		try {
			 
			myEpisode=new Episode();
 
			File file = new File("database.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(myEpisode.getEpisodeName());
			bw.write(myEpisode.getEpisodeInfo());
			bw.write(myEpisode.getSkippability());
			bw.write(myEpisode.getNumEpisode());
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		try {
			 
			mySeason=new Season();
 
			File file = new File("database.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			for(String s : mySeason.getComments(user))
			bw.write(s + "\n");
			for(Episode j : mySeason.getEpisodes()){
				bw.write(j.getEpisodeName());
				bw.write(j.getEpisodeInfo());
				bw.write(j.getSkippability());
				bw.write(j.getNumEpisode());
			}
			
			bw.write(mySeason.getInfo());

			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			 
			myShow=new Show(Password, Password, 0, null, 0, null);
 
			File file = new File("database.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(myShow.getName());
			bw.write(myShow.getInfo());
			bw.write(myShow.getNumOfSeasons());
			for(String j : myShow.getEpisodes())
			bw.write(j + "\n");
			bw.write(myShow.getSeason(0));
			for(String s: myShow.getComments(Username))
			bw.write(s + "/n");
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public static void addUsertoCredentials(String username, String password){
		String filename = "credentials.txt";
		FileWriter fw;
		try {
			fw = new FileWriter(filename, true);
			BufferedWriter bw = new BufferedWriter(fw);
			Encode thing = new Encode(filename);
			bw.write(username + " , ");
			thing.write(password);
			bw.write("\n");
			
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addUsertoUserFile(String username, String email, List<Show> mines, List<Episode> ep) throws IOException{
		String filename = "users.txt";
		FileWriter fw = new FileWriter(filename, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(username + "\n" + email + "\n[Show:");
		for (int i = 0; i < mines.size(); i ++)
		{	
			bw.write("(" + mines.get(i).getName() + ")");
		}
		bw.write("] \n" +  "[EpisodesWatched:");
		for (int j = 0; j< ep.size(); j ++)
		{
			bw.write("(" + ep.get(j).getEpisodeName() + ")");
		}	
	}
	void loadData()
	{
			try {
				FileInputStream in = new FileInputStream("database.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			List<String> info = new ArrayList<String>();
			List<String> episodeSeasons = new ArrayList<String>();
			List<String> skippability = new ArrayList<String>(); 
			try {
			BufferedReader	br = new BufferedReader(new FileReader("database.txt"));
			String strLine;
			try {
				info.add(br.readLine());
				episodeSeasons.add(br.readLine());
				skippability.add(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				

			}
		
			   
		}
	
	
	}
	
	

