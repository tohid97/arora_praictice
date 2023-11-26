package multiple.inheritance;

public class RegularClass implements ClassA, ClassB {

	@Override
	public void getEmpInfo() {
		String Status = "US Citizen";
		
		System.out.println("My Status is : " +Status);
		
	}

	@Override
	public void getSalary() {
		int Salary = 1000000;
		
		System.out.println("My Yearly Salary is : " +Salary);
	}

	@Override
	public void getBonus() {
		double Bonus = 5000.99;
		
		System.out.println("My yearly bonus is : " +Bonus);
	}

	@Override
	public void getName(){
		String name = "Tislam";
		
		System.out.println("My Name Is : " +name);
	}

	@Override
	public void getPhone() {
		System.out.println("My phone number is : (123)456-7890");
	}

	@Override
	public void getSSN() {
		System.out.println("My SSN is : 123-56-7890");
		
	}

	@Override
	public void getAddress() {
		System.out.println("My address is : 123 main St");		
	}
	
	public static void main(String[] args) {
		RegularClass a = new RegularClass();
		a.getEmpInfo();
		a.getName();
		a.getSSN();
		a.getPhone();
		a.getAddress();
		a.getSalary();
		a.getBonus();
		
	}

}
