package constructor.practice;

public class ConstructorA {
	
	public ConstructorA(String name) {
		System.out.println("Name:"+ name);
	}
	
	public ConstructorA(int salary) {
		System.out.println("Salary:"+ salary);
	}
	
	public ConstructorA() {
		System.out.println("Default Constructor remove to null value");
	}

	public static void main(String[] args) {
		ConstructorA C = new ConstructorA("Tislam");
		ConstructorA C2 = new ConstructorA(50000);
		ConstructorA C3 = new ConstructorA();
		
		
	}
	

}
