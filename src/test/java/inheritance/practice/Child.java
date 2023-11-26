package inheritance.practice;

public class Child extends Parent {
	
	
	public static void main(String[] args) {
		
		Parent obj = new Parent();
		obj.getLand();
		obj.gethouse();
		obj.getMoney();
		
		System.out.println(obj.getCar("BMW"));
		
		
	
	}
	

}
