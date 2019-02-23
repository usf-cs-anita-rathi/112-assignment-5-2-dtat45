
public class Odometer 
{
	public float fuelUsed;
	public float mileage;
	private float fuelEfficiency;
	private int totalMileage;
	private int totalFuel;
	
	public void resetOdometer()
	{
		mileage=0;
		fuelUsed=0;
	}
	
	public void addMileage()
	{
		totalMileage+=mileage;
		System.out.println("Total Mileage: "+totalMileage+" Miles");
	}
	
	public void fuelEfficiency()
	{
		fuelEfficiency=mileage/fuelUsed;
		System.out.println("Fuel Efficiency: "+fuelEfficiency+" Miles per Gallon");
	}
	
	public void totalFuelUsed()
	{
		totalFuel+=fuelUsed;
		System.out.println("Total Fuel Used: "+totalFuel+" gallons");
	}
	
}
