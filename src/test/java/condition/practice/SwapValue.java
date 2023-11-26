package condition.practice;

public class SwapValue {
	public static void main(String[] args) {
		int a = 500;
		int b = 700;
		
		System.out.println("A equal : " + a);
		System.out.println("B equal : " + b);
		
		a = a+b; //1200
		b = a-b; //500
		a = a-b; //700
		
		System.out.println("**/**/**/**/**/**/**/**/**/**/**");
		
		System.out.println("A equal : " + a);
		System.out.println("B equal : " + b);
		System.out.println("A equal : " + a);
		
	}	
}
