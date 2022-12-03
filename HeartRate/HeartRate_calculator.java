
import java.util.Scanner;
public class HeartRate_calculator 
{
    public static void main(String[]args)
    {
        
        Scanner in = new Scanner(System.in); 
        
        //Start
        System.out.println(" Target heart rate calculator ");
        System.out.println();
        
        //User input name and heart rates 
        System.out.println( " Please enter age : " ); 
        int age = in.nextInt();
        System.out.println( " Please enter resting heart rate : " ); 
        int restingRate = in.nextInt();
        
        //calcalations
        int maxRate = 220 - age; 
        int reserveRate = maxRate - restingRate;
        double upperTarget = ( reserveRate * .85 ) + restingRate; 
        double lowerRate = ( reserveRate * .50 ) + restingRate;
        
        // output
        System.out.println( " Your target heart rate is between " + lowerRate + " and " + upperTarget );
        System.out.println();
        
        //exercise
        System.out.println( " Please enter heart rate during exercise : " );
        int workingHeartRate = in.nextInt();
        System.out.println();
        boolean isBelow = upperTarget > upperTarget; 
        boolean isAbove = lowerRate < lowerRate; 
        boolean isBetween = isBelow == isAbove;
        //output
        System.out.println(" Your working heart rate is below the upper target rate : " + isBelow + " and above the lower target heart rate : " + isAbove + "."); 
        
    }
}