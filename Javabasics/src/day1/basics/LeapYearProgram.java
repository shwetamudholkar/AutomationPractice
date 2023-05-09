package day1.basics;

public class LeapYearProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year =2004;
		if((year%4==0)&&(year%100==0)) 
		{
			System.out.println("LEAP YEAR");
		}
		else
		{
			System.out.println("COMMON YEAR OR NOT A LEAP YEAR");
		}

	}

}
