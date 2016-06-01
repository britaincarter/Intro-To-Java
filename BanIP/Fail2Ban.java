import java.io.*;
import java.util.*;

/**
 * @author Britain
 *  Class reads in a file (bin/logs_processed) and will keep track of how many
 *  times a user of a certain ip address has attempted to login. After a certain
 *  amount of attempts (3) the user will be banned. With the ip address being 
 *  exported to ban.txt.
 */
public class Fail2Ban {
			
	public static void main(String[] args) throws IOException {
		
		//create arraylist to place all invalid ips in
		ArrayList<String> invalid = new ArrayList<String>();
		//location to export
		
			/*
			 * catch error if no file is found
			 */
		try{
			
			/*
			 * Read in file
			 */
			File file = new File("bin/logs_processed");
			Scanner in = new Scanner(file);
			FileReader s = new FileReader(file);
			BufferedReader br = new BufferedReader(s);		
			
			String strLine;
			
			/*
			 * parse lines of file
			 */
			while((strLine = br.readLine()) != null) {						
				
				/*
				 * Establish delimiters
				 */			
				String delimiters = "[ ]+";
				String[] tokens = strLine.split(delimiters);
				
				/*
				 * Seperate words
				 */					
				
				for(int i = 0; i<tokens.length; i++){
					String z = in.next();
					
					if(z.equals("Accepted")){						
						
						
					}else if(z.equals("Invalid")){
						
						boolean found = false;
						/*
						 * Adding all the invalid ips into the ArrayList
						 */								
						while(!found){
						String IP = in.next();
							if(IP.equals("from")){
								
								IP = in.next();
								invalid.add(IP);
								found = true;
							}		
						}
						
					}
				}
			}	
			in.close();
			br.close();
		}catch(Exception f){
			if (f instanceof IOException){
				System.out.println("Error - cannot find file");
			}
		}
		
			
		//Sort the array
		Collections.sort(invalid);
		
		//Get one copy of each ip address that is invalid
		Set<String> hs = new HashSet<>();
		hs.addAll(invalid);
		//arraylist with only one ip address instead of copies. 
		ArrayList<String> uniqueIPs = new ArrayList<String>();		
		uniqueIPs.addAll(hs);
		
		/*
		 * iterate through each array seeing if the strings are equal
		 * in different arrays. (uniqueIPs and bannedIPs) then increment 
		 * x if strings are equal. If x is greater than 3 ban that ip.
		 */
		try{
			PrintWriter out = new PrintWriter(new FileWriter("ban.txt"));
			for(int i = 0; i<uniqueIPs.size();i++){
				
				int x = 0;	
				String str = uniqueIPs.get(i);
				
				for(int z = 0; z<invalid.size();z++){
				
					String tmp = invalid.get(z);
					if(str.equals(tmp)){
						x++;
					}			
				}
				
				
				//Export the designated ip address that will be banned
				if(x >= 3){
					out.println(str);
					System.out.println("IP banned to ban.txt: "+str);
				}	
				
			}	
			out.close();
		}catch(Exception f){
			if (f instanceof IOException){
				System.out.println("Error - cannot find file");
			}
		}
	}	
}