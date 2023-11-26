package polymorphism.practice;

public class Methods_Overloading {
	
	
public void getName( String name, int salary){
	System.out.println("My name is :: " + name + " &" + " My salary is ::" + salary);
		
		
	}
	public void getName(int salary ,String name){
		System.out.println("My salary is :: " + salary + " & " + "My name is :: " + name) ;
		
	} 
	public void getName( String name){
		System.out.println("My name is :: " + name);
		
		
	}
	public static void main(String[] args) {
		Methods_Overloading obj = new Methods_Overloading();
		obj.getName("abc");
		obj.getName(10, "abc");
		obj.getName("abc", 15);
		
	}
	
}
