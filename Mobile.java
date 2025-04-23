package PrinciplesOfOops;

public class Mobile
{
	String brand;
	String type;
	double price;
	String name;
	int ram;
	MSim s;
	
	Mobile(String brand,String type,double price,String name,int ram)
	{
		this.brand=brand;
		this.name=name;
		this.price=price;
		this.ram=ram;
		this.type=type;
		
		System.out.println("Mobile Done");
		
	}
	
	public void insertSim(String serviceProvider,String networkType,String type,long simNo)
	{
		s=new MSim(serviceProvider,networkType,type,simNo);
	}
	
	public void displayMobile()
	{
		System.out.println(name);
		System.out.println(brand);
		System.out.println(type);
		System.out.println(price);
		System.out.println(ram);
	}
}
