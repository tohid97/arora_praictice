package abstruction.practice;

public class Abstruction_ClassExecute extends Abstruction_ClassA{

	@Override
	public void getSalary() {
		int Salary = 123456;
		System.out.println(Salary);
		
	}

	@Override
	public void getName() {
		String Name = "ABC";
		System.out.println(Name);
				
	}

	@Override
	public void getLand() {
		
		
	}
	
	public static void main(String[] args) {
		Abstruction_ClassExecute obj = new Abstruction_ClassExecute();
		obj.getSalary();
		obj.getName();
	}

}
