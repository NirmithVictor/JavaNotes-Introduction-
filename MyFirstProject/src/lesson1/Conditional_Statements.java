package lesson1;
import java.util.Scanner;
public class Conditional_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter X:");
		float x=scan.nextFloat();
		System.out.print("Enter Y:");
		float y=scan.nextFloat();	
		if(x<y) {
			System.out.println("X is lesser than Y");
		}
		else if(x>y) {
			System.out.println("X is greater than Y");
		}
		else if(x==y) {
			System.out.println("X is equal to Y");
		}
		else {
			System.out.print("BRUHH");
		}
		
		//logical operators are || ->OR, && ->AND 
	}
}
