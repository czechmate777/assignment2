import java.util.*;
import java.io.*;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.util.InvalidFormatException;

public class main {
	
	//parts of speech model
	private static POSModel model;
	
	private static DictSkipList<String, String> dictionary;
	
	private DictSkipList<String, String> getDict()
	{
		return dictionary;
	}

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		InputStream is = new FileInputStream( "en-pos-maxent.bin" );
		setModel( new POSModel( is ) ); 
		
		//greet user
		System.out.println("Heyyy, how you doin'?");
		
		//get input
		String input = scan.nextLine();
		
		//return output
		//make dictionary of terms and update it
		
		dictionary = new DictSkipList<String, String>();
		
		fillDictionary(dictionary);
		
		while (!input.equals("exit"))
		{
			System.out.println(response(input) + "\n");
			input = scan.nextLine();
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
	  
	  //generate chatbot response
	  public static String response(String input) throws InvalidFormatException, IOException
	  {
		  
		  //check for dictionary, no punctuation
		  if (dictionary.containsKey(input.toLowerCase()))
		  {
			  return dictionary.get(input.toLowerCase());
		  }
		  
		  //generate verb/noun response
		  InputStream is = new FileInputStream( "en-pos-maxent.bin" );
		  inputParser parse = new inputParser(is);

		  String[] verbNoun = parse.getVerbNoun(input);
		  String s = construct(verbNoun[0], verbNoun[1], input);
		  return s;
		  //return "I also like to " + verbNoun[0]  + " " + verbNoun[1] + " when I drink.";
	  }
	  
	  public static String construct(String verb, String noun, String input) {
			Random rand = new Random();
			int weight = rand.nextInt(60);
			if(verb.isEmpty() && !noun.isEmpty()) 
				return "blank";
			if(!verb.isEmpty() && noun.isEmpty()) 
				return "blank";
			if(verb.isEmpty() && noun.isEmpty()) 
				return "blank";
			if(weight >= 1 && weight <= 10){ 
				return "I also like to " + verb  + " " + noun + " when I drink.";
			}
			else if(weight > 10 && weight <= 20){ 
				return "Oh yeah, absolutely. What do you think of " + noun + "?";
			}
			else if(weight > 20 && weight <= 30){ 
				return "Such " + noun + ". Very " + verb + ". Wow.";
			}
			else if(weight > 30 && weight <= 40){ 
				return "I also like to " + verb  + " " + noun + " when I drink.";	
			}
			else if(weight > 40 && weight <= 50){ 
				return "I also like to " + verb  + " " + noun + " when I drink.";
			}
			else
				return "I... what? What do you mean by " + verb + " and " + noun + "?";
		
		}

}
