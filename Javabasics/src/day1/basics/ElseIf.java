package day1.basics;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks =100;
		if(marks<35)
		{
			System.out.println("fail");
		}
		else if(marks>35)
		{
			System.out.println("D grade");
		}
		else if(marks>=50)
		{
			System.out.println("C grade");
		}
		else if(marks>60)
		{
			System.out.println("First Class");
		}
		else if(marks>=70)
		{
			System.out.println("A grade");
		}
		else if(marks>=90)
		{
			System.out.println("First class with Distinction with A+ grade");
		}
		else
		{
			System.out.println("grade not present");
		}

	}

}
