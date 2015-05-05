package Encoder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;

public class Encode {
	
	private FileWriter writer;
	private String name;
	
	public Encode (String filename) {
		name = filename;
	}
	
	public void write (String plaintext) {
		
		byte[] encrypted = Base64.getEncoder().encode(plaintext.getBytes());
		
		try {
			writer = new FileWriter(name, true);
			
			String s = "";
			for (byte b : encrypted) {
				s += (char) b;
			}
						
			writer.write(s + "\n");
			writer.close();
			
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<String> read() {
		Scanner scan = null;
		List<String> messages = new ArrayList<String>();
		try {
			
			scan = new Scanner(new File(name));
			while(scan.hasNextLine()){
				String encrypt = scan.nextLine();
				byte[] decrypted = Base64.getDecoder().decode(encrypt.getBytes());
				String s = "";
				for (byte b : decrypted) {
					s += (char) b;
				} 
				messages.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		scan.close();
		return messages;
	}
	
}