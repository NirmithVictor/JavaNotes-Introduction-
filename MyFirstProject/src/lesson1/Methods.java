package lesson1;
//methods aka functions
import java.util.*;
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myFirstMethod();
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		mysecondmethod(a);
		String b=mythirdmethod(a);
		System.out.print(b);
		
	}
	public static void myFirstMethod() {
		System.out.print("Hi");
	}
	public static void mysecondmethod(int a) {
		for(int i=0;i<a;i++) {
			System.out.println("Hello");
	}
	}
	public static String mythirdmethod(int b) {
		String a="UWU";
		return a;
	}
}
