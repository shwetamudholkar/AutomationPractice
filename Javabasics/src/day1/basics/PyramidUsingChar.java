package day1.basics;

public class PyramidUsingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		for(int i=1; i<=5; i++)
		{
			
			for(int j=i; j<=i ; j++)
			{
				System.out.print(ch+" ");
			}
             System.out.println();	
             ch++;
		}

	    
	}

}
