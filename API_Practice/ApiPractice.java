  /**
  * The point of this is  to demonstrate a varity of methods 
 *@Maddision Davis 
 *@2/12/2016
 */
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

        public class ApiPractice {
  /**
  * Finds the hypotenuse of a right triangle given sides a and b.
  * @param a Length of side a.
  * @param b Length of side b.
  * @return Length of hypotenuse.
  */
 
 public static double hypotenuse(double a, double b)
 {
     
     return Math.sqrt(a*a + b*b);
  
 }
 
 /**
  * Returns the greater of two values. If the values are exactly the same,
  * it returns one of them.
  * @param a First value.
  * @param b Second value.
  * @return Largest value.
  */
 public static double max(double a, double b) 
    {
        double max = 0; 
        if (a>b) 
          max = a; 
        else 
            max = b; 
        if (a == b) 
          max = b; 
          
        return max; 
 }
     /**
  * Returns the smaller of two values. If the values are exactly the same,
  * it returns one of them.
  * @param a First value.
  * @param b Second value.
  * @return Smallest value.
  */
 public static double min(double a, double b)
 {
    double min = 0;
    if (a < b)
        min = a;
    else 
       min = b; 
    if (a==b)
        min = a; 
    return min;
 }

 /**
  * Returns the lexicographically greater of two strings. If the values are
  * exactly the same, it returns one of them.
  * @param a First string.
  * @param b Second string.
  * @return Lexicographically greatest string.
  */
 public static String max(String a, String b)
 {
  int compare = a.compareTo(b);
  String max = a;
  if (compare > 0) 
  { 
      max = a;
    }
    else
    max = b; 
  { 
   if (compare < 0)
        max = b;  
    }
  
   return max; 
 }
 
 /**
  * Returns the lexicographically lesser of two strings. If the values are
  * exactly the same, it returns one of them.
  * @param a First string.
  * @param b Second string.
  * @return Lexicographically lesser string.
  */
 public static String min(String a, String b)
 {
  int compare = a.compareTo(b);
  String min = a;
  if (compare < 0) 
  { 
      min = a;
    }
    else
    min = b; 
  { 
   if (compare > 0)
        min = b;  
    }
  
  return min; 
 }

  /**
  * Compares two strings to see if they contain the same text.
  * @param a First string.
  * @param b Second string.
  * @return <code>true</code> if the strings contain the same text,
  * <code>false</code> otherwise.
  */
  public static boolean isSameText(String a, String b) 
 {
 
  if (a.compareTo(b) == 0)
    return true;
    
  else 
    return false;
 }
 
 /**
  * Returns the longest string (the string with the greatest number of
  * characters) out of three strings. If two or more strings have the same
  * number of characters, it returns the first one.
  * @param a First string.
  * @param b Second string.
  * @param c Third string.
  * @return String with the fewest characters.
  */
 public static String getLongestString(String a, String b, String c)
 {
    String bigstring=null;
    int maxlength=0;
    String[] big={a, b, c};
    for(String max: big)
        {
            if(maxlength<max.length())
            {
                maxlength=max.length();
                bigstring=max;
            }
        }
    return bigstring; 
}
 
 /**
  * Returns the shortest string (the string with the lowest number of 
  * characters) from a list of strings. If two or more strings have the
  * same number of characters, it returns the first one.
  * 
  * If the incoming list is <code>null</code> or contains zero strings, 
  * this method returns <code>null</code>.
  * 
  * @param list List of incoming strings.
  * @return String with the fewest characters.
  */

 public static String getShortestString(List<String> list)
 {
      int[] lengths = new int[list.size()];
      int min = Integer.MAX_VALUE;
      int index = 0;
      for(int i = 0; i < list.size(); i++)
      {
          lengths[i] = list.get(i).length();
          if(lengths[i] < min)
          {
              min = lengths[i];
              index = i;
          }
      }
      if(list.size() > 0)
         return list.get(index);
      else
         return null;
  }
 /**
  * 
  * Returns a substring of the incoming string that contains all of the 
  * characters leading up to, but not including, the comma found
  * in the string.
  * @param s A string with a comma somewhere inside of it.
  * @return The substring leading up to the comma.
  */
 public static String getStringBeforeComma(String s)
 {
  String output = s.substring(0, s.indexOf(','));
  return output;
}
 
 /**
  * Returns a substring of the incoming string that contains all of the 
  * characters after the comma found inside the string.
  * @param s A string with a comma somewhere inside of it.
  * @return The substring after the comma.
  */
 public static String getStringAfterComma(String s)
 {
  String output = s.substring(s.indexOf(",")+1);
  return output;
 }
}
