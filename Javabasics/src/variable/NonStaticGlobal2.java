package variable;

public class NonStaticGlobal2 {
	int employee ;
	double salary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	NonStaticGlobal2 n = new NonStaticGlobal2();
	System.out.println("employee is:"+n.employee);
	System.out.println("salary is:"+n.salary);
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
	
	
	n.employee=1;
	n.salary=300000;
	System.out.println("updated employee is="+n.employee);
	System.out.println("updated salary is="+n.salary);
	System.out.println("========================================================");
	
	NonStaticGlobal2 n2= new NonStaticGlobal2();
	System.out.println("employee with ref n2 is="+n2.employee);
	System.out.println("salary with ref n2 is="+n2.salary);
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	
	n2.employee=25;
	n2.salary=251102;
	System.out.println("updated employee with ref n2="+n2.employee);
	System.out.println("updated salary with ref n2= "+n2.salary);
	System.out.println("###############################################################");
		
	
	
	
	
		
		
		
		
		
		

	}

}
