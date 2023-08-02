package methodoverriding;

public class Offseason  extends Onseason{
	void discount()
	{
		System.out.println("Discount for Offseason is 15%");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Onseason ons=new  Onseason();
		 Onseason ofsn=new Offseason();
		 ons.discount();
		 ofsn.discount();

	}

}
