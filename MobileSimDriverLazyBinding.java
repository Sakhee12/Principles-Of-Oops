package PrinciplesOfOops;

public class MobileSimDriverLazyBinding 
{
	public static void main(String[] args)
	{
		Mobile m1=new Mobile("Samsung","5G",35999.0,"S25",516);
		m1.displayMobile();
		
		System.out.println("//////////*************/////////////");
		m1.insertSim("jio","5G","PrePaid",587889512);
		m1.s.displaySim();
	}
}
