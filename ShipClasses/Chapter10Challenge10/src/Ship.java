/**
 * A class that holds data about a ship.
 */

public class Ship 
{
	private String name;		// Name of the ship
	private String year;		// Year ship was built
	
	/**
	 * This constructor initializes the ship's name and year built to empty strings.
	 */
	
	public Ship()
	{
		name = "";
		year = "";
	}
	
	/**
	 * The setName method sets the name of the ship.
	 * @param n The name of the ship.
	 */
	
	public void setName(String n)
	{
		name = n;
	}
	
	/**
	 * The getName method returns the name of the ship.
	 * @return The name of the ship.
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * The setYear method sets the year the ship was built.
	 * @param y The year the ship was built.
	 */
	
	public void setYear(String y)
	{
		year = y;
	}
	
	/**
	 * The getYear method returns the year the ship was built.
	 * @return The year the ship was built.
	 */
	
	public String getYear()
	{
		return year;
	}
	
	/**
	 * The toString method returns a string representation of the object.
	 */
	
	public String toString()
	{
		return "Type: Generic\nName: " + name + "\nYear Built: " + year;
	}
}
