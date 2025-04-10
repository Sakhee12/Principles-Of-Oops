package PrinciplesOfOops;

public class QEntry 
{
	private String name;
	String institute = "Qspider";
	private long phno;
	private String course;
	private String batch;
	private double fees;
	private String branch;
	
	
	public QEntry(String name,long phno,String course,String batch,double fees,String branch)
	{
		this.name = name;
		this.phno = phno;
		this.course = course;
		this.batch = batch;
		this.fees = fees;
		this.branch = branch;
		
		System.out.println("Student Registered");
	}
	
	public String getName()
	{
		return name;
	}
	
	public long getPhNo()
	{
		return phno;
	}
	
	public void setPhNo(boolean valid,long newNo)
	{
		if (valid)
		{
			this.phno=newNo;
			System.out.println("No changed Sucessfully");
		}
		else
		{
			System.out.println("Validate No");
		}
	}
	
	public String getCourse()
	{
		return course;
	}
	
	public String getBatch()
	{
		return batch;
	}
	
	public double getFees()
	{
		return fees;
	}
	
	public String getBranch()
	{
		return branch;
	}
	
	public void setBranch(boolean permission,String newBranch)
	{
		if (permission)
		{
			this.branch = newBranch;
			System.out.println("Branch Changed Sucessfully");
		}
		else
			System.out.println("Take Permission");
	}
}


