
public class Temperature 
{
	public float temperature; //Temperature value
	public String F; //Character for scale
	
	//Constructors - 4 different objects, 1 created by each constructor
	public Temperature(int startTemperature)
	{
		temperature=startTemperature;
		F="celsius";
	}
	public Temperature(String startScale)
	{
		temperature=0;
		F=startScale;
	}
	public Temperature(int startTemperature,String startScale)
	{
		temperature=startTemperature;
		F=startScale;
	}
	public Temperature()
	{
		temperature=0;
		F="celsius";
	}
	
	//Part 1 - Have program convert temperature
	public void convertToFahrenheit() //Method assumes that user inputs degrees in celsius
	{
		temperature=(9*(temperature)/5+32);
		System.out.println(temperature+F);
	}
	public void convertToCelsius() //Method assumes that user inputs degrees in fahrenheit
	{
		temperature=5*(temperature-32)/9;
		System.out.println(temperature+F);
	}
	
	//Part 2 - Have program use all 3 methods
	public void setTemperature(float newValue)
	{
		temperature=newValue;
	}
	public void changeScale(String scaleChange)
	{
		F=scaleChange;
	}
	public void changeTempAndScale(float newValue,String scaleChange)
	{
		temperature=newValue;
		F=scaleChange;
	}
	
	//Part 3 - Have program check all temperature inequalities on Assignment page, will have temperature1 and temperature2
	public boolean equals(Temperature otherTemp)
	{
		return (temperature==(9*(otherTemp.temperature)/5+32)) || temperature==5*(otherTemp.temperature-32)/9;
	}
	public boolean greaterThan(Temperature otherTemp)
	{
		return (temperature>=(9*(otherTemp.temperature)/5+32)) || temperature>=5*(otherTemp.temperature-32)/9;
	}
	public boolean lessThan(Temperature otherTemp)
	{
		return (temperature<=(9*(otherTemp.temperature)/5+32)) || temperature<=5*(otherTemp.temperature-32)/9;
	}
	
	//Part 4
	public String toString()
	{
		return (F);
	}
}