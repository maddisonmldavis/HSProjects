//Converting Between F and C

import java.util.Scanner;

class AnnualClimate2
{
        public static void main (String [ ] args)
    {

       
        Scanner in = new Scanner(System.in);
        String city = "Alpalachcola";
        String state = "Florida";
        double totalTemp = 0;
        double totalPrecip = 0;
        String month [] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double temperature [] = {52.7, 55.3, 60.7, 66.8, 74.1, 80.0, 81.9, 81.7, 79.1, 70.2, 62.0, 55.2};      
        double precipitation [] = {4.9, 3.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2, 3.6, 3.5}; 
        String tempLabel = "F";  
        String precipLabel = "Inches"; 
        
      
        System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        System.out.println();
        String tempChoice = in.next();
        System.out.println();
        System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
        System.out.println();
        String precipChoice = in.next();
        
        
        System.out.printf("\n\n%33s\n" , "Climate Data");
        System.out.printf("%20s%s%s%s\n\n" , "Location: " , city , ", " , state);
 
        if (tempChoice.equalsIgnoreCase("c")){
            
            tempLabel = "C";
   
        }
        
        if (precipChoice.equalsIgnoreCase("c")){
            
            precipChoice = "Centimeters";
            
        }
        
        
        System.out.printf("%5s %18s %s %18s %s","Month","Temperature",tempLabel,"Precipitation",precipLabel);
        System.out.println();
        System.out.printf("***************************************************");
        System.out.println();

        
        if(tempChoice.equalsIgnoreCase("F")){   
            

            tempLabel = "(F)";
            
        
            if (precipChoice.equalsIgnoreCase("i")){
                
                for(int i = 0; i < temperature.length; i++)
                {
                        
                    
                    totalTemp += (double)temperature[i];
                   
                    System.out.printf("%s%18.1f%21.1f\n" , month[i] , (double)temperature[i] , (double)precipitation[i]);
                        
                }
            
            }
            
            if (precipChoice.equalsIgnoreCase("c")){
                
                for( int i = 0; i < temperature.length; i++)
                {
                    
                    totalTemp += (double)(temperature[i] - 32) * (5.0/9.0);
                    System.out.printf("%s%18.1f%21.1f\n" , month[i] , (double)temperature[i] , (double)(precipitation[i] * 2.54));
                
                }
            
            }
            
            totalTemp = totalTemp / temperature.length;

        }
        
        if(tempChoice.equalsIgnoreCase("C")){
            
            tempLabel="(C)";
            
            if (precipChoice.equalsIgnoreCase("i")){
                
                for( int i = 0; i < temperature.length; i++)
                {
                    
                    totalTemp += (double)(temperature[i] - 32) * (5.0/9.0);
                    System.out.printf("%s%18.1f%21.1f\n" , month[i] , ((temperature[i] - 32) * (5.0/9.0)) , (precipitation[i]));
                
                }
                
            }
            
            if (precipChoice.equalsIgnoreCase("c")){
                
                for( int i = 0; i < temperature.length; i++)
                {
                    
                    totalTemp += (double)(temperature[i] - 32) * (5.0/9.0);
                    System.out.printf("%s%18.1f%21.1f\n" , month[i] , (double)(temperature[i] - 32) * (5.0/9.0) , (double)(precipitation[i] * 2.54));
                
                }
            
            }
            
            totalTemp = totalTemp / temperature.length;
            
        }
        
        if (precipChoice.equalsIgnoreCase("i")){
        
            precipLabel = "(in.)";
            
            for(int i = 0; i < precipitation.length; i++){
                
                totalPrecip += (double)precipitation[i];
                
            }
            
        }
        
        if(precipChoice.equalsIgnoreCase("c")){
            
            precipLabel = "(cm)";
            
            for(int i = 0; i < precipitation.length; i++){
                
                totalPrecip += (double)(precipitation[i] * 2.54);
                
            }

        }
        
        //output
        System.out.printf("***************************************************");
        System.out.println();
        System.out.printf(" \n%17s%2.1f%18s%3.1f" , "Average: " , totalTemp , "Annual: " , totalPrecip);
        System.out.println();
        
    }

}