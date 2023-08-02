package polymorphism;

public class Student {

	String studname;
	int rollno;
	Address ad;
	public Student(String studname,int rollno ,Address ad)
	{
		this.ad=ad;
		this.studname=studname;
		this.rollno=rollno;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ads=new Address("Aswathy bhavan");
		Student st=new Student("Aswathy",14,ads);
		System.out.println(ads.studaddress);
		System.out.println(st.studname);
		System.out.println(st.rollno);
		

	}

}
