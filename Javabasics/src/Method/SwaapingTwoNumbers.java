package Method;

public class SwaapingTwoNumbers {

	public static void main(String[] args) {
		
		SwappingTwoNumbers(10,20);

	}
	public static void SwappingTwoNumbers(int num1, int num2) {
		System.out.println("number1 is= "+num1);
		System.out.println("number2 is="+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("after Swaping number1 is="+num1);
		System.out.println("after Swaping number2 is="+num2);
	}

}
