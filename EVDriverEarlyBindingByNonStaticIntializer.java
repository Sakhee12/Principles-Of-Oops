package PrinciplesOfOops;

public class EVDriverEarlyBindingByNonStaticIntializer
{
	public static void main(String[] args)
	{
		EVVehicle v1 = new EVVehicle(437,"Tata",140,"Eco","Nexon Ev Max");
		v1.displayEVVehicle();
		
		System.out.println("//////////****************////////////");
		
		v1.c1.displayEVCharger();
		
		
	}
}
