import java.util.*; 
import java.lang.*;

public class Question2 
{ 
public static void main(String[] args) 
{ 
    String player;  
    String computer = "";  
    int computerInt; 


    Scanner scan = new Scanner(System.in); 

    System.out.println("Please enter a move.\n" + "Rock = R, Paper = P, and Scissors = S.");

    System.out.println();
    int winloss=0;
    
	System.out.println(1 +"Round");
    for(int i=2;i<5;i++) {
 
    computerInt = (int)(Math.random()*3); 

    if (computerInt == 1) 
       computer = "R"; 
    else if (computerInt == 2) 
       computer = "P"; 
    else if (computerInt == 3) 
       computer = "S"; 


    System.out.println("Enter your play: "); 
    player = scan.next();

    player = player.toUpperCase(); 

        System.out.println("Computer play is: " + computer);
        
        if (player.equals(computer)) 
            System.out.println("It's a tie!"); 
         else if (player.equals("R")) 
            if (computer.equals("S")) { 
               System.out.println("Rock crushes scissors. You win!!");
        		winloss+=1;}
         else if (computer.equals("P")) 
                 System.out.println("Paper eats rock. You lose!!"); 
         else if (player.equals("P")) 
            if (computer.equals("S")) 
            System.out.println("Scissor cuts paper. You lose!!"); 
         else if (computer.equals("R")) { 
                 System.out.println("Paper eats rock. You win!!");
        		 winloss+=1;}
         else if (player.equals("S")) 
              if (computer.equals("P")) { 
              System.out.println("Scissor cuts paper. You win!!");
        	  winloss+=1;}
         else if (computer.equals("R")) 
                 System.out.println("Rock breaks scissors. You lose!!"); 
         else 
              System.out.println("Invalid user input.");
        if(i<=3) {
    	    System.out.println(i +"Round");
    	}
    }
    
    System.out.println("Final Decision : ");
    if(winloss<=2) {
    	System.out.println("You Lost"); }
    else if(winloss==0) {
    	System.out.println("Tie");
    }
    	else System.out.println("You win");
   
  }
}
