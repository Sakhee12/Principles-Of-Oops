package PrinciplesOfOops;

public class Refill 
{
	String brand;
	String type;
	String color;
	double size;
	
	Refill(String brand,String type,String color,double size)
	{
		this.brand = brand;
	    this.type = type;
		this.color = color;
		this.size = size;
		System.out.println("Refill Created");
	}
	
	public void displayRefill()
	{
		System.out.println(brand);
		System.out.println(type);
		System.out.println(color);
		System.out.println(size);
	}
	
}
