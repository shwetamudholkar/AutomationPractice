package Method;

public class MethodCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PersonalInfo();
PersonalInfo();
PersonalInfo("Pushpa","HDFC BANK");
calling(90110011);
	}
static void PersonalInfo() {
	System.out.println("Hi All, I am Shweta K. Mudholkar");
	System.out.println("I want a job in software MNC\n");
}
	static void PersonalInfo(String name, String profesion) {
	System.out.println("Hi All, I am "+name);
	System.out.println("Iwant a job in "+profesion);
	}
		
	public static void calling(int num) {
		System.out.println("I AM KUNAL");
		System.out.println("CALLING BY NUMBER "+num);
		
	}

}
