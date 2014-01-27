// main file
import java.util.*;
import java.io.*;

public class main {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		
		//greet user
		System.out.println("Heyyy, how you doin' ?");
		
		//get input
		String input = scan.nextLine();
		
		//return output
		//make dictionary of terms and update it
		
		Hashtable<String, String> dictionary = new Hashtable();
		
		fillDictionary(dictionary);
		
		
		while (!input.equals("exit"))
		{
			//parse input to add to dictionary
			
			//respond with value
		}
		//ask again/exit
		
	}
	
	//fill dictionary initially with predefined values
	public static void fillDictionary(Hashtable<String, String> dictionary) throws FileNotFoundException
	{
		FileInputStream in = new FileInputStream("dictionary.txt");
		Scanner fin = new Scanner(in);
		
		
		String key, value;
		//read initial dictionary from file dictionary.txt
		while (fin.hasNext())
		{
			//get values
			key = fin.nextLine();
			value = fin.nextLine();
			fin.nextLine();
			
			dictionary.put(key,  value);
		}
		
	}

}
