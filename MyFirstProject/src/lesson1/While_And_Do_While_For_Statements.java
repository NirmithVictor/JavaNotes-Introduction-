package lesson1;
import java.util.*;
public class While_And_Do_While_For_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		//while(x<10) {
			//System.out.println("I ate "+ ++x +"bananas");
		//}
		System.out.println("---------------------");
		int x1=0;
		do {
			System.out.println("I ate "+x1+"bananas");
			x1++;
		}while(x1<10);
	
		System.out.println("---------------------");
		//System.out.println("---------------------");
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int b=scan.nextInt();
		int a[]= new int[b];
		for(int i=0;i<b;i++) {
			System.out.print("Enter: ");
			a[i]=scan.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		//Or
		for(int element:a) {
			System.out.print(element);
		}
	}

}
