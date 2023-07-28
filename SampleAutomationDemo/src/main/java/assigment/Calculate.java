package assigment;

public class Calculate extends Divisible {
	int temp = 0;
	int sum=0;
	public Calculate(int a,int b)
	{
      super(a,b);
			
	}
	public boolean calculation()
	{
		sum=super.add();
		return sum %10==0;
	}
public void display()
{
	if(sum%10==0)
	
	{
System.out.println("Divisible by 10");
	}
	else
	{
System.out.println("not Divisible by 10");
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate cl=new Calculate(15,25);
		int result=cl.add();
		System.out.println("addition="+result);
		cl.display();

	}

}
