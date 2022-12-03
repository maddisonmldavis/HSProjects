
import java.util.Random;
import java.util.Scanner;

public class DiceProbability
{
    public static void main(String[] args)
    {
      
	
        int sumOfDice = 0;
        int sumOfRoll = 0;
        int numSides = 0;
        int numRolls = 0;
        int match = 0; 
        double probability = 0.0;
        Random randNum = new Random();
        Scanner in = new Scanner(System.in);
        

        System.out.print("Please enter the number of sides on a die: ");
        System.out.println();
        numSides = in.nextInt();
        System.out.print("Please enter the number of rolls: ");
        numRolls = in.nextInt();
       
        System.out.print("\n Sum of dice \t Probability \n");

        for( sumOfDice = 1; sumOfDice <= (numSides * 2); sumOfDice++ )
        {
            
            for( int roll  = 0; roll < numRolls; roll++ )
            {
                
                for(int i = 0; i < 2; i++)
                {
                    
                    sumOfRoll = randNum.nextInt(numSides * 2) + 1;
                    
                }
            
                if ( sumOfDice == sumOfRoll )
                {
                    
	 	   
                    match++;
                    
                } 
                
                sumOfRoll = 0;
                
            } 
            //output
            
	    
            System.out.println("    " + sumOfDice + "s: " + "    \t\t" + ((double)match / 1000) * 100);
            
            match = 0;
        } 
       
    } 
}