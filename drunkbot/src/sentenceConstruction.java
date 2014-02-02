import java.util.*;
public class sentenceConstruction {
	
	public String construct(String verb, String noun) {
		Random rand = new Random();
		int weight = rand.nextInt(10);

		if(weight >= 1 && weight <= 10){ 
			return verb + noun;
		}
		else if(weight > 10 && weight <= 20){ 
			
		}
		else if(weight > 20 && weight <= 30){ 
			
		}
		else if(weight > 30 && weight <= 40){ 
			
		}
		else if(weight > 40 && weight <= 50){ 
			
		}
		else
			return "I... what? What do you mean.....";
		
		return "blank";
	}
}
