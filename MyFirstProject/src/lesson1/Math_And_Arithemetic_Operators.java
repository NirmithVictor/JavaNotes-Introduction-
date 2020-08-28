package lesson1;
import java.util.Scanner;
public class Math_And_Arithemetic_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter X:");
		int x=scan.nextInt();
		System.out.print("Enter Y:");
		int y=scan.nextInt();
		int z=0;
		z=x+y;
		//System.out.println(z);
		z=x-y;
		//System.out.println(z);
		z=x*y;
		//System.out.println(z);
		z=++x;
		//System.out.println(z);	
		double z1=x/y;
		//System.out.print(z1);
		
		//increment and decrement operators
		int x1=0;
		x1=x1+1;
		x1++;
		++x1;
		System.out.println(x1);
		System.out.println(x1);
		
	}

}
