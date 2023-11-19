import java.util.Random;
import java.util.Scanner;

/* Create a java class game ,which allows a user to play "guess the number"
 
1. constructor togenerate random no
2. take user input () to take a user input of number
3 is correct number to detect whether the number entered the user id true
4. getter and setters  for no  of guesses 
5. use propertied such as number of guesses (int ) etc to get this taskdone
*/
    class Game{
    	int number;
    	int inputNumber;
    	int noOfGuess=0;
    	
    	public int getNoOfGuess() {
    		return noOfGuess;
    	}
    	public void setNoOfGuess(int noOfGuess) {
    		noOfGuess= noOfGuess;
    	}
    	 public Game() {
    		 Random rad=new Random();
    		 number= rad.nextInt(100);
    	 }
    	 public void takeUserInput()  {
    		 System.out.println("Guess the number");
    		 Scanner sc= new Scanner(System.in);
    		 inputNumber=sc.nextInt();
    	 }
    	 boolean isCorrectNumber() {
    		 noOfGuess++;
    		 if(inputNumber==number) {
    			 System.out.format("yes you guessed it right, it was %d\n you guessed it in % attenpts"
    			 		,number ,noOfGuess ); 
    			 return true;
    			 }
    		 else if(inputNumber<number) {
    			 System.out.println("TOO LOW");
    		 }
    		 else if(inputNumber>number) {
    	 
    			System.out.println("TOO HIGH..");
    	 }
    	 return false;
    }
    }
    public class V50_Ch9_Solution {
    	public static void main(String[] args) {
			
    		Game g=new Game();
    		boolean b=false;
    		while(!b) {
    			g.takeUserInput();
    			b=g.isCorrectNumber();
    		}
    		
		}













 




}
