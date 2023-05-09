package day1.basics;

public class LeapYearPro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2022;
		if((year%4==0)&&(year%400==0))
		{
			System.out.println("THIS IS LEAP YEAR");
		}
		else
		{
			System.out.println("THIS IS NOT A LEAP YEAR");
		}

	}

}
