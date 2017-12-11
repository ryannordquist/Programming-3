/**
 * This program demonstrates the CargoShip, CruiseShip, and Ship classes.
 */

public class ShipDemo 
{
	public static void main(String[] args) 
	{
		Ship[] ships = new Ship[3];
		
		// The first ship is a regular ship with a
		// name of Markar and a year of 100.
		ships[0] = new Ship();
		ships[0].setName("Markar");
		ships[0].setYear("100");
		
		// The second ship is a cruise ship with a
		// name of Baly and a max capacity of 19,247
		ships[1] = new CruiseShip("Baly", 19247);
		
		// The third ship is a cargo ship with a
		// name of TrueHaul and a max cargo capacity
		// of 12458 tonnes.
		ships[2] = new CargoShip("TrueHaul", 12458);
		
		// Display the data
		for (int i = 0; i < ships.length; i++)
		{
			System.out.println("Ship " + (i + 1) + ": \n" + ships[i] + "\n");
//			System.out.println("Ship " + (i + 1) + ": \n" + ships[i].toString() + "\n");
		}

	}

}
