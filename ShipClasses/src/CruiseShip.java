public class CruiseShip extends Ship
{
	private String name;		// Name of the ship
	private int maxPassengers;	// Maximum number of passengers
	
	/**
	 * The constructor sets the name of the ship and the maximum number of passengers.
	 */
	
	public CruiseShip(String n, int m)
	{
		name = n;
		maxPassengers = m;
	}
	
	/**
	 * The getName method returns the name of the cruise ship.
	 * @return The name of the cruise ship.
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * The getMaxCapacity method returns the max capacity of the cruise ship.
	 * @return The max capacity of the cruise ship.
	 */
	
	public int getMaxCapacity()
	{
		return maxPassengers;
	}
	
	/**
	 * This toString method overrides the superclass's toString method.
	 * @return A string representation of the object.
	 */
	
	@Override
	public String toString()
	{
		return "Type: Cruise\nName: " + getName() + "\nMax Passengers: " + getMaxCapacity(); 
	}
}
