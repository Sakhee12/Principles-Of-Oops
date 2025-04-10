package PrinciplesOfOops;

public class PenRefillDriverEarlyBindingByConstructor
{
	public static void main(String[] args)
	{
		Pen p1 = new Pen("Trimax",50.0,"Gel Pen","Rrimax","Gel Point","blue",0.5);
		p1.displayPen();
	
		p1.ref.displayRefill();
	}
	
}
