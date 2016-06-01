//This class runs a simulation of the game rock paper scissors

import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		//Ask for player to enter their choice
		Scanner s = new Scanner(System.in);
		System.out.println("Lets play Rock Paper Scissors!");
		System.out.println("Enter 0 for rock, 1 for paper, or 2 for scissors:");
		int choice = s.nextInt();
		
		//initialize variables
		int tie = 0;
		int win = 0;
		int loss = 0;
		int cwin = 0;
		int totalwins = 0;
			
			//protecting malicious user
			if(choice != 0 && choice != 1 && choice != 2){
				System.out.println("Error, please pick a number from 0-2.");
				System.out.println("Enter 0 for rock, 1 for paper, or 2 for scissors:");
				choice = s.nextInt();				
			}
			
			//Tell user what they picked: 0, 1, 2 are rock, paper scissors respectively.
			//For both the computer and the user.
			else if (choice == 0){
				System.out.println("You chose rock!");
				
			}
			else if (choice == 1){
				System.out.println("You chose paper!");
			}
			else if (choice == 2){
				System.out.println("You chose scissors!");
			}
		
		//All the if statements below in while loop are possibilities of what could happen in a game.
			//must reach 10 total wins between human and computer before simulation ends
		while(totalwins < 10){
			
			//The computer's choice
			double r = (3 * Math.random());
			int computerChoice = (int) (r); 
			if(computerChoice == choice){
				System.out.println("And it ends in Tie!");
				tie++;					
			}
			else if(computerChoice == 0 && choice == 1){
				System.out.println("You won! Computer chose rock.");
				win++;
				totalwins++;
			}
			else if(computerChoice == 0 && choice == 2){
				System.out.println("You lost... Computer chose rock.");
				loss++;
				cwin++;
				totalwins++;
			}
			else if(computerChoice == 1 && choice == 0){
				System.out.println("You lost... Computer chose paper.");
				loss++;
				cwin++;
				totalwins++;
			}
			else if(computerChoice == 1 && choice == 2){
				System.out.println("You won! Computer chose paper");
				win++;
				totalwins++;
			}
			else if(computerChoice == 2 && choice == 1){
				System.out.println("You lost... Computer chose scissors.");
				loss++;
				cwin++;
				totalwins++;
			}
			else if(computerChoice == 2 && choice == 0){
				System.out.println("You won! Computer chose scissors.");
				win++;
				totalwins++;
			}
				//protect malicious user
			if(choice != 0 && choice != 1 && choice != 2){
				System.out.println("Error, please pick a number from 0-2.");
				System.out.println("Enter 0 for rock, 1 for paper, or 2 for scissors:");
				choice = s.nextInt();
				
			}
			
			//Output the score for every round, and ask for another input.
			System.out.println("The score is: " + win + "-" + cwin );
			System.out.println("Lets try again! Choose another:");
			choice = s.nextInt();
		}	
		
		//final output of who won the match.
		System.out.println("The score is: " + win + "-" + cwin );
		
		if(win<cwin){
			System.out.println("You lost the match.");
			}
		if(win>cwin){
			System.out.println("You won the match!");
			}	
		if(win==cwin){
			System.out.println("You tied... guess you gotta try again.");
			}
		
		System.out.println("You had this many wins: " + win); 
		System.out.println("You had this many losses: " + loss); 
		System.out.println("You had this many ties: " + tie); 
	}
	
}
