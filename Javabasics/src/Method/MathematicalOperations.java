package Method;

public class MathematicalOperations {

	public static void main(String[] args) {
	
		AddingTwoNumbers(5,3);
		SubstractTwoNumbers(10,5);
		MultiplyTwoNumber(4,4);
		DivideTwoNumbers(36,6);
		ModuleTwoNumbers(36,6);

	}
public static int AddingTwoNumbers(int num1,int num2) {
	System.out.println("Number1 is= "+num1);
	System.out.println("Number2 is= "+num2);
	int result=num1+num2;
	System.out.println("result is: "+result);
	return 0;
}
public static int SubstractTwoNumbers(int num1, int num2) {
	System.out.println("number1 is="+num1);
	System.out.println("number2 is="+num2);
	int result=num1-num2;
	System.out.println("result is: "+result);
	return 0;
}
static int MultiplyTwoNumber(int num1,int num2) {
	System.out.println("number1 is="+num1);
	System.out.println("number2 is="+num2);
	int result=num1*num2;
	System.out.println("result is: "+result);
	return 0;
}
private static int DivideTwoNumbers(int num1, int num2) {
	System.out.println("number1 is: "+num1);
	System.out.println("number2 is: "+num2);
	int result= num1/num2;
	System.out.println("result is: "+result);
	return 0;
}
private static int ModuleTwoNumbers(int num1, int num2) {
	System.out.println("number1 is: "+num1);
	System.out.println("number2 is: "+num2);
	int result= num1%num2;
	System.out.println("result is: "+result);
	return 0;
}
}
