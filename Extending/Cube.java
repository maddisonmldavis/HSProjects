public class Cube extends Triangle 
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class box
	 */
	public Cube(int l, int w, int h)
	{
		// call superclass
		super(l, w);
	    // initialise instance variables
		height = h;
	}

	// return the height
	public int getHeight()
	{
		return height;
	}

}