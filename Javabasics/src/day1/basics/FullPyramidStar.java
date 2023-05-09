package day1.basics;

public class FullPyramidStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=6; i++)
		{
			for(int j=6; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			
		}for(int i=1; i<=6; i++)
		{
			for(int j=6; j>=i; j--)
			{
				System.out.print("* ");
			}
		
		
		System.out.println();
		}
	}

}
