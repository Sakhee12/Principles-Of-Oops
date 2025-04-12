package PrinciplesOfOops;

public class EVCharger
{
	String voltageAC;
	float power;
	String current;
	int timeTOFull;
	
	EVCharger(String voltageAC,float power,String current,int timeTOFull)
	{
		this.voltageAC=voltageAC;
		this.power=power;
		this.current=current;
		this.timeTOFull=timeTOFull;
		
		System.out.println("EVCharger Created");
	}
	
	public void displayEVCharger()
	{
		System.out.println(voltageAC);
		System.out.println(power);
		System.out.println(current);
		System.out.println(timeTOFull);
	}
	
}
