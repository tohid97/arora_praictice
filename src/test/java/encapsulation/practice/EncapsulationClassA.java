package encapsulation.practice;

public class EncapsulationClassA {
	
	private String jobTittle = "QA Engineer";
	private int weeklySalary = 1500;
	
	private String getJobTittle() {
		return jobTittle;
	}
	public int getWeeklySalary() {
		int Salary = 150000;
		System.out.println(Salary);
		return weeklySalary;
	}
	
	
	public static void main(String[] args) {
		EncapsulationClassA obj = new EncapsulationClassA();
		
		System.out.println(obj.getJobTittle());
		System.out.println(obj.getWeeklySalary());
		
		
	}
	
	
	
		
	

}
