// main file
import java.util.*;
import java.io.*;

import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.util.InvalidFormatException;
 

public class main {
	
	//parts of speech model
	private static POSModel model;

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		InputStream is = new FileInputStream( "en-pos-maxent.bin" );
		setModel( new POSModel( is ) ); 
		
		//greet user
		System.out.println("Heyyy, how you doin' ?");
		
		//get input
		String input = scan.nextLine();
		
		//return output
		//make dictionary of terms and update it
		
		DictSkipList<String, String> dictionary = new DictSkipList<String, String>();
		
		fillDictionary(dictionary);
		
		
		while (!input.equals("exit"))
		{
			input = scan.nextLine();
			run(input);
		}
		//ask again/exit
		
	}
	
	//fill dictionary initially with predefined values
	public static void fillDictionary(DictSkipList<String, String> dictionary) throws FileNotFoundException
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
			
			//add key & value to dictionary in lower case
			dictionary.put(key.toLowerCase(), value.toLowerCase());
		}
		
	}
	
	 private static void setModel( POSModel m ) {
		    model = m;
	  }
	  private static POSModel getModel() {
		    return model;
	  }
	  
	  //from HelloWorld for reference
	  public static void run( String sentence ) {
		    POSTaggerME tagger = new POSTaggerME( getModel() );
		    String[] words = sentence.split( "\\s+" );
		    String[] tags = tagger.tag( words );
		    double[] probs = tagger.probs();
		 
		    for( int i = 0; i < tags.length; i++ ) {
		      System.out.println( words[i] + " => " + tags[i] + " @ " + probs[i] );
		    }
	  }
	  

}
