package PrinciplesOfOops;

public class EVVehicle
{
	double range;
	String brand;
	int speed;
	String mode;
	String model;
	EVCharger c1;
	
	{
		String voltageAC = "200-500v";
		int power=50;
		String current="DC";
	    int	timeTOFull=60;
		
		c1 = new EVCharger(voltageAC,power,current,timeTOFull);
	}
	
	EVVehicle(double range,String brand,int speed,String mode,String model)
	{
		this.range=range;
		this.brand=brand;
		this.speed=speed;
		this.mode=mode;
		this.model=model;
		
	}
	
	public void displayEVVehicle()
	{
		System.out.println(range);
		System.out.println(brand);
		System.out.println(speed);
		System.out.println(mode);
		System.out.println(model);
	}
}
