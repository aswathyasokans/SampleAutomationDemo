package abstractpackage;

public class Contractor extends Employee {
	private int wrkhr;
	private int payhr;
	public Contractor(int wrkhr,int payhr)
	{
		this.wrkhr=wrkhr;
		this.payhr=payhr;
	}
	public void calculateSalary()
	{
		System.out.println("Calculate salary="+(payhr*wrkhr));
	}

	

}
