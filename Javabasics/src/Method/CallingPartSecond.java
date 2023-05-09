package Method;

public class CallingPartSecond {

	public static void main(String[] args) {
		personaldetails();
		personaldetails("Pushpa","Bajrang chowk,wadhona,Dist-Huzur Sahib Nanded");
		int i=1234;
        calling(i);
        
	}
static void personaldetails() {
	System.out.println("Shweta");
	System.out.println("Shivaji chowk, himayatnagar,Dist-Nanded\n");
}
static void personaldetails(String name, String Address) {
	System.out.println("name:-"+name);
	System.out.println("address:-"+Address);
}
static void calling(int num) {
	System.out.println("pincode is:"+num);
}
}
