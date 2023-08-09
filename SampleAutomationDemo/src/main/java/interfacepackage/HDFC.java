package interfacepackage;

public class HDFC implements RBI{
	public double recurringDeposit(double amt,int duration)
	{
		double inamt=amt*inrate*duration;
		double totalamt=amt+inrate;
		return totalamt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC hd=new HDFC();
		System.out.println(hd.recurringDeposit(2500,15));
	}

}
