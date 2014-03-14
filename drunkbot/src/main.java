import java.util.*;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.util.InvalidFormatException;

public class main {

	//parts of speech model
	private static POSModel model;

	private static DictSkipList<String, String> dictionary;
	private static boolean soc;
	private DictSkipList<String, String> getDict() {
		return dictionary;
	}

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws InvalidFormatException, IOException, ClassNotFoundException {

		InputStream is = new FileInputStream( "en-pos-maxent.bin" );
		setModel( new POSModel( is ) ); 
		System.out.println("*Act as client using sockets? <yes/no> *");
		
		soc = scan.nextLine().toLowerCase().equals("yes");
		if(soc) {

			//get the localhost IP address, if server is running on some other IP, you need to use that
			System.out.print("Please enter server IP address: ");
			InetAddress host = InetAddress.getByName(scan.nextLine());
			Socket socket = null;
			ObjectOutputStream oos = null;
			ObjectInputStream ois = null;
			System.out.println("Trying to connect to server...");
			//establish socket connection to server
			socket = new Socket(host.getHostName(), 2014);

			//write to socket using ObjectOutputStream
			oos = new ObjectOutputStream(socket.getOutputStream());


			//read the server response message
			ois = new ObjectInputStream(socket.getInputStream());
			//greet client
			System.out.println("-----------------------------------------");
			String greeting = "Heyyy, how you doin'?";
			oos.writeObject(greeting);
			System.out.println("CLIENT: " + greeting);

			//get input
			String input = (String) ois.readObject();
			System.out.println("SERVER: " + input);
			//get dictionary
			dictionary = new DictSkipList<String, String>();

			fillDictionary(dictionary);

			int counter = 0;
			String response;
			while (!input.equals("exit") && counter < 28)
			{
				response = response(input);
				oos.writeObject(response);
				System.out.println("CLIENT: " + response);
				input = (String) ois.readObject();
				System.out.println("SERVER: " + input + "\n");
				counter++;
			}
			response = "I think it is time for me to go."; 
			oos.writeObject(response);
			System.out.println("CLIENT: " + response + "\n");

			input = (String) ois.readObject();
			System.out.println("SERVER: " + input);	  
			response = "Goodbye.\n*Falls off chair*";
			oos.writeObject(response);
			System.out.println("CLIENT: " + response);

		}
		else {
			//greet user
			System.out.println("-----------------------------------------");
			System.out.println("Heyyy, how you doin'?");

			//get input
			String input = scan.nextLine();

			//return output
			//make dictionary of terms and update it

			dictionary = new DictSkipList<String, String>();

			fillDictionary(dictionary);

			int counter = 0;
			while (!input.equals("exit") && counter < 28)
			{
				System.out.println(response(input) + "\n");
				input = scan.nextLine();
				counter++;
			}
			System.out.println("I think it is time for me to go.\n");
			input = scan.nextLine();

			System.out.println("Goodbye.\n*Falls off chair*");

		}


	}

	//fill dictionary initially with predefined values
	public static void fillDictionary(DictSkipList<String, String> dictionary) throws FileNotFoundException {
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

	//generate chatbot response
	public static String response(String input) throws InvalidFormatException, IOException {

		//check for dictionary, no punctuation
		if (dictionary.containsKey(input.toLowerCase()))
		{
			return dictionary.get(input.toLowerCase());
		}

		//generate verb/noun response
		InputStream is = new FileInputStream( "en-pos-maxent.bin" );
		inputParser parse = new inputParser(is);

		String[] verbNoun = parse.getVerbNoun(input);
		String str = construct(verbNoun[0], verbNoun[1], input);
		return str;
	}

	//construct response sentence
	public static String construct(String verb, String noun, String input) {
		Random rand = new Random();
		int weight_max = 1000;
		int weight_min = 1;
		int div_max = 10;
		int div_min = 1;
		int weight = rand.nextInt((weight_max - weight_min) + 1) + weight_min;
		int div = rand.nextInt((div_max - div_min) + 1) + div_min;
		int modulus = weight % div;
		int num = rand.nextInt(8);
		if(verb.isEmpty() && !noun.isEmpty()) 
			return noVerb(noun, input);
		if(!verb.isEmpty() && noun.isEmpty()) 
			return noNoun(verb, input);
		if(verb.isEmpty() && noun.isEmpty())
			return noNounVerb(input);

		if(input.substring(input.length()-1).equals("?") && (modulus % 2) == 0)
			return "Who are you, comrade question?";
		else if(1 == num){ 
			return "I also like to " + verb  + " " + noun + " when I drink.";
		}
		else if(2 == num){ 
			return "Oh yeah, absolutely. What do you think of " + noun + "?";
		}
		else if(3 == num){ 
			return "Such " + noun + ". Very " + verb + ". Wow.";
		}
		else if(4 == num){ 
			return "Maybe next time I'll " + verb + " your mom.... hue hue hue hueeeeeeee.";	
		}
		else if(5 == num){ 
			return "HA! YOU ARE A FUNNY BUGGER AREN'T YOU! HA HA HA HA";
		}
		else if(6 == num){ 
			return "*blank stare*";
		}
		else if(7 == num){ 
			return "Whaaa, what? You talking to me?";
		}
		else
			return "I... what? What do you mean by " + verb + " and " + noun + "?";

	}

	public static String noVerb(String noun, String input) {
		Random rand = new Random();
		int num = rand.nextInt(2);
		if (input.equals("lol")){
			return "Who you laghing at, punk?";
		}
		if (0==num) {
			return noun+"? Gross. I preffer Scotch.";
		}
		else {
			return "I loooooove " + noun + ". I also love this scotch! Scotch is good.";
		}
	}
	public static String noNoun(String verb, String input) {
		Random rand = new Random();
		int num = rand.nextInt(8);
		if(0 == num)
			return "Who are we talking about, you?";
		else if(1 == num)
			return "Of course I am into " + verb + ".";
		else if(2 == num)
			return "Computers don't often " + verb + ", do they?";
		else if(3 == num)
			return "I don't really "+ verb +" anymore... Sorry";
		else if(4 == num)
			return "OMG! "+ verb + " is something I want to get into!";
		else if(5 == num)
			return "Well fine then.";
		else if(6 == num)
			return "Get a life, man";
		else
			return "You really need to try "+ verb+". It goes great with scotch.";
	}
	public static String noNounVerb(String input) {
		if(input.substring(input.length()-1).equals("?"))
			return "Of course not!";
		Random rand = new Random();
		int num = rand.nextInt(4);
		if(0 == num) 
			return "I... what? What do you mean by that?";
		if(1==num)
			return "You aren't making any sense, and I have nooooooo idea what you are saying.";
		if(2==num)
			return "So.. do you have any plans for the weekend?";
		else
			return "I could really use another drink.. or two.";
	}

}
