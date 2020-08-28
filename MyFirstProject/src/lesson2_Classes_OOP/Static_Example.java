package lesson2_Classes_OOP;

public class Static_Example {
	int id;
	static int number=0;
	Static_Example(){
	number++;
	}
	public static int getNumber() {
		return number;
	}
	public static void setNumber(int number) {
		Static_Example.number = number;
	}
	
}
