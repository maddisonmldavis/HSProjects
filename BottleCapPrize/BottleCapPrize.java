import java.util.Scanner;
import java.io.IOException; 
import java.io.PrintWriter; 
import java.io.File; 

public class BottleCapPrize
{   
    public static void main(String[] args) throws IOException 
    {
        
       
       int oneToFive = 0;
       int done = 0;
       int count = 0;
       int stopLoop = 0;
       double intTotalData = 0;
       String totalData = "";
       
       //got scanner set to input
       Scanner input = new Scanner(System.in);
       
       //asking user the amount of trials it would liket to attempt (1000 is required)
       System.out.print("How many trials : ");
       int trials = input.nextInt();
       
       
       PrintWriter outFile = new PrintWriter (new File("test.txt")); 
	
       
       for (int i = 1; i <= trials; i++) {
         
	   
           while (done != 1){ 
             
	       
               oneToFive = 0 + (int)(Math.random() * 5); 
               
	       
	             count++;
               
	       
               if (oneToFive == 1){
                       
                   outFile.println(count); 
                   count = 0;
                   done = 1;
                       
                }
            
            }
            
	    //reset done out side while loop so we don't get stuck in it (might have done that :D )
            done = 0; 
            
       } 
       
  
       outFile.close ();
        
       
       File data = new File("test.txt");
       Scanner inFile = new Scanner(data);
            	
       
       while (inFile.hasNext()){
    
           intTotalData += Integer.parseInt(inFile.next( ));
                 
       }
         
       
       System.out.println(intTotalData / trials);
    
    }
    
}