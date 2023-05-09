package Blocks;

public class NonStatic2 {
	{
		System.out.println("+++++++++++++MULTIPLE NON STATIC BLOCKS+++++++++++++");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("it is the starting of multiple non static blocks");
		NonStatic2 n1= new NonStatic2();
		System.out.println("ending of multiple non static blocks");
		NonStatic2 n2= new NonStatic2();
		System.out.println("===========================================================");
		System.out.println("################ENDS##################");

	}
	{
		System.out.println("MULTIPLE NON STATIC BLOCKS ARE VERY IMPORTANT");
	}
}
