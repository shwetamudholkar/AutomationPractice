package variable;

public class NonStaticGlobalVar {
	int age;
	double salary;

	public static void main(String[] args) {
		NonStaticGlobalVar n1= new NonStaticGlobalVar();
		System.out.println("Accesing with ref var n1= "+n1.age);
		System.out.println("Accessing with ref var n1= "+n1.salary);
		System.out.println("##########################################################");
		
		 n1.age=33;
		 n1.salary=100000;
		System.out.println("UPDATED age is= "+n1.age);
		System.out.println("UPDATED salary is= "+n1.salary);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		NonStaticGlobalVar n2= new NonStaticGlobalVar();
		System.out.println("New value with new ref n2= "+n2.age);
		System.out.println("New value with new ref n2= "+n2.salary);
		System.out.println("****************************************************************");
		
		NonStaticGlobalVar n3= new NonStaticGlobalVar();
		n3.age=34;
		n3.salary=110000;
		System.out.println("UPDATED VALUE OF AGE IS= "+n3.age);
		System.out.println("UPDATED VALUE OF SALARY IS= "+n3.salary);
		
		
		

	}

}
