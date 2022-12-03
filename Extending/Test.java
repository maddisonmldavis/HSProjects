public class Test
{
	public static void main (String []args)
	{
	    Triangle one = new Triangle(2, 4);
	    Cube two = new Cube(4,10,4);
	    
	    System.out.println("For Rectangle:" );
	    System.out.println("The length is  " + one.getLength() );
	    System.out.println("The width is " + one.getWidth()); 
	    System.out.println("For Box : ");
	    System.out.println("The length is  " + two.getLength() );
	    System.out.println("The width is " + two.getWidth()); 
	    
	    
	}
	
}