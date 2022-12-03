/**
 * This program demonstrates how to format strings with the printf() method.
 * Use the program in conjunction with the lesson for Week 5 Day 1.
 * 
 * After reading each section of the lesson on formatting strings, remove the
 * comments for the appropriate section of code, then run it to see printf()
 * in action.
 * 
 * ©FLVS 2007
 * @author B. Jordan 
 * @version 04/29/07
 */
public class Test
{
    public static void main(String [] args)
    {
      String[]veggies={"zucchini", "carrot", "spinach", "asparagus"};
      int i =0;
      for(String item:veggies)
      {
          i+=item.indexOf("c");
        }
        

      
    }
}