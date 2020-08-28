package lesson1;

import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for the user to input a integer
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Some Value:");
		int user_input_number=scan.nextInt();
		
		//to display the input
		System.out.print("Your value is:");
		System.out.println(user_input_number);
		
	}

}
