package aggregation;

public class Address {
	private String address;
	public Address(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student("Aswathy",14);
		System.out.println(st.getName());
		System.out.println(st.getRollno());
		Address ad=new Address("TVM/14");
		System.out.println(ad.getAddress());
		

	}

}
