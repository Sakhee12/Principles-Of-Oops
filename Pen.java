package PrinciplesOfOops;

public class Pen 
{
	String Pbrand;
	double price;
	String Ptype;
	Refill ref;
	
	Pen(String pbrand,double price,String ptype,String brand,String type,String color,double size)
	{
		this.Pbrand=pbrand;
		this.price=price;
		this.Ptype=ptype;
		System.out.println("Pen Created");
		ref = new Refill(brand,type,color,size);
		
	}
	
	public void displayPen()
	{
		System.out.println(Pbrand);
		System.out.println(price);
		System.out.println(Ptype);
		
	}
}
