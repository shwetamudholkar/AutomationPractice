package Blocks;

public class NonStaticBlock {
	{
		System.out.println("**********NON STATIC BLOCK************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting of Non static block");
		NonStaticBlock b1= new NonStaticBlock();
		System.out.println("Creating an object for non static block");
		NonStaticBlock b2= new NonStaticBlock();
		System.out.println("Ending of Non Static block");
		NonStaticBlock b3= new NonStaticBlock();
		System.out.println("=====================================================");
		

	}

}
