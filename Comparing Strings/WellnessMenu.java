/**
 * Prompts user to select a category and tests the menu structure.
 * 
 * @author  Maddison Davis 
 * @version 
 */
import java.util.Scanner;
public class WellnessMenu
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("\nSelect a letter corresponding to a menu option.");
        System.out.println(" [A] BMI");
        System.out.println(" [B] Healthy Eating "); 
        System.out.println(" [C] Food Pyramid "); 
        System.out.println(" [D] Fitness Training ");
        System.out.println(" [E] Fast Food ");
        System.out.println( " Please type A, B, C, D, or E for corresponding menu item : " ); 
        String letter = in.nextLine();
        
        if(letter.equals("A")) //condition for choice A goes in the parentheses
        {
            // provide print statement to indicate menu item A was chosen
            System.out.println("You chose A for BMI");
        }
        else if(letter.equals("B")) //condition for choice B goes in the parentheses
        {
            System.out.println("You choose B for Healthy Eating");
            // provide print statement to indicate menu item B was chosen
        }
        else if(letter.equals("C")) //condition for choice C goes in the parentheses
        {
            System.out.println("You choose C for Food Pyramid");// provide print statement to indicate menu item C was chosen
        }
        else if(letter.equals("D")) //condition for choice D goes in the parentheses
        {
            System.out.println("You choose D for Fitness Training"); // provide print statement to indicate menu item D was chosen
        }
        else if(letter.equals("E")) //condition for choice E goes in the parentheses
        {
            System.out.println("You choose E for Fast Food");// provide print statement to indicate menu item E was chosen
        }
        else  //default choice for an invalid entry
        {
            System.out.println("You did not type a valid menu option ");// provide print statement to indicate invalid entry
        }
    }
}

