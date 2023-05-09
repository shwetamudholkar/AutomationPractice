package Method;

public class StaticMethodExamp1 {

	

	public static void main(String[] args) {
		
		StaticMethodExamp1.addtwonumbers(10,20);
        int res=multiplyTwoNumbers(5,3);
       
        //System.out.println("result is="+res);
        
       // int finalValue=res+100;
        //System.out.println("updated value is= "+finalValue);
	}
	
public static void addtwonumbers(int num1, int num2) {
	System.out.println("number1 is: "+num1);
	System.out.println("number2 is: "+num2);
	
}

public static int multiplyTwoNumbers(int num1,int num2) {
	System.out.println("number1 is= "+num1);
	System.out.println("number2 is= "+num2);
    int res = num1*num2;
	 System.out.println("final result is="+res);
	  int finalValue=res+100;
	  System.out.println("updated value is= "+finalValue);
	return 0;
	
}
}
