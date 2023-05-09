package Method;

public class AsciiValueUsingStatic {

	public static void main(String[] args) {

	swapingtwonumbers(25,5);

	}
static void swapingtwonumbers(int num1, int num2) {
	System.out.println("num1 is: "+num1);
	System.out.println("num2 is: "+num2);
	num1=num1+num2;//30
	num2=num1-num2;//25
	num1=num1-num2;//5
	System.out.println("after swaping num1 is: "+num1);
	System.out.println("after swaping num2 is: "+num2);
}
}

