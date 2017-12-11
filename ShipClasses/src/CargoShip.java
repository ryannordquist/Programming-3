
public class CargoShip extends Ship
{
	private int cargoCapacity;	// Cargo capacity (in tonnage)
	private String name;		// Name of the cargo ship
	
	/**
	 * The constructor sets the cargo capacity and the name of the cargo ship.
	 * @param cargoCapac The cargo capacity.
	 * @param n The name of the ship.
	 */
	
	public CargoShip(String n, int cargoCapac)
	{
		cargoCapacity = cargoCapac;
		name = n;
	}
	
	/**
	 * The getCargoCapacity method returns the cargo capacity of the ship.
	 * @return The cargo capacity of the ship.
	 */
	
	public int getCargoCapacity()
	{
		return cargoCapacity;
	}
	
	/**
	 * The getName method returns the name of the cargo ship.
	 * @return The name of the cargo ship.
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * This toString method overrides the superclass's toString method.
	 * @return A string representation of the object.
	 */
	
	@Override
	public String toString()
	{
		return "Type: Cargo\nName: " + getName() + "\nCargo Capacity (in tonnage): " + getCargoCapacity();
	}
}
