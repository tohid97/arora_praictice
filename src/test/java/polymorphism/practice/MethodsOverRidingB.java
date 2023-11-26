package polymorphism.practice;

public class MethodsOverRidingB extends MethodsOverRidingA {
	public void getName(int salary,short bonus) {
		
	}
		public static void main(String[] args) {
			MethodsOverRidingB obj = new MethodsOverRidingB();
			obj.getName("Tohid");
			obj.getName(100000, "tohid");
			obj.getName("islam", 100000);
		}
}
