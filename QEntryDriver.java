package PrinciplesOfOops;

public class QEntryDriver 
{
	public static void main(String[] args)
	{
		QEntry q1 = new QEntry("Sakhee",8080103971l,"Java Full Stack","E8",36697.0,"Deccan");
		System.out.println(q1.getBranch());
		q1.setBranch(true, "Hadapsar");
		System.out.println(q1.getBatch());
		System.out.println(q1.getPhNo());
		q1.setPhNo(true, 80041247955l);
	}
}
