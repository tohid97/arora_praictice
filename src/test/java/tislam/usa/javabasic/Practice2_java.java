package tislam.usa.javabasic;

public class Practice2_java {

	public void getMyName() {
		String Name = "Tohid";
		System.out.println("My Name is : " +Name);

	}

	String getMyInfo() {
		String SSN = "123-50-3344";
		System.out.println("My SSN is : " +SSN);
		return SSN;

	}

	public void getMYAddress(String Address) {
		

		System.out.println("MyAddress is : " +Address);

	}

	public static void main(String[] args) {

		Practice2_java A = new Practice2_java(); // create class object

		A.getMyName();
		A.getMyInfo();
		A.getMYAddress("123 any st");

	}

}
