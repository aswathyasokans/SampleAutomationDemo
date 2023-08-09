package abstractpackage;

public class FullTimeEmployee {
	public FullTimeEmployee(int payhr)
	{
		super();
	}
	public static void calculateSalary(int payhr)
	{
		
		System.out.println("Calculate salary="+(payhr*8));
	}
	public static void main(String args[])
	{
		Employee emp=new Contractor(10,10);
		emp.calculateSalary();
		FullTimeEmployee .calculateSalary(15);
		
	}

}
