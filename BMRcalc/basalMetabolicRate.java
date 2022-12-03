
/**
 * To calculate basal metabolic intake per day between males and females 
 * 
 * @author maddison 
 * @version V1
 */
import java.util.Scanner;
public class basalMetabolicRate
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        //System input assign varibles 
        System.out.println(" Please enter first name: " );
        String name = in.next(); 
        System.out.println();
        
        System.out.println( " Please enter your sex (M or F)"); 
        String mOrF = in.next();
        char male = mOrF.charAt(0);
        
        
        System.out.println(" Please enter age : " );
        double age = in.nextDouble(); 
        System.out.println(); 
        
        System.out.println(" Please enter height in inches : " ); 
        double height = in.nextDouble();
        System.out.println();
        
        System.out.println( " Please enter weight in pounds : " ); 
        double weight = in.nextDouble();
        System.out.println();
        
        //conversion 
        double realWeight = weight / 2.2046; 
        double realHeight = height / 0.39370;
        
        //equation 
        double BMRMale = (10 * realWeight + 6.25 * realHeight - 5 * age) + 5;
        double BMRFemale = (10 * realWeight + 6.25 * realHeight - 5 * age) - 161;
       
        //if-else detriminate 
        

        boolean isMale = male == 'M';
        if(isMale) 
            System.out.println(" Your calorie intake per day should be : " + BMRMale);
        else 
            System.out.println(" Your calorie intake per day should be : " + BMRFemale);
        
    }
}
