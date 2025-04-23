package PrinciplesOfOops;

public class MSim 
{
	String serviceProvider;
	String networkType;
	String type;
	long simNo;
	
	MSim(String serviceProvider,String networkType,String type,long simNo)
	{
		this.serviceProvider=serviceProvider;
		this.networkType=networkType;
		this.type=type;
		this.simNo=simNo;
		
		System.out.println("Sim inserted");
	}
	
	public void displaySim()
	{
		System.out.println(serviceProvider);
		System.out.println(networkType);
		System.out.println(type);
		System.out.println(simNo);
	}
}


