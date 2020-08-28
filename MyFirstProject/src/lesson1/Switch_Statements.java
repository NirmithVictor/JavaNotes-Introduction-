package lesson1;

public class Switch_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=9;
		//byte, car,short or int
		switch(score) {
		case 90: 
			System.out.print("It is a 90");
			break;
		case 89:
			System.out.print("It is a 89");
			break;
		default:
			System.out.print("Grades are not defined");
			break;
		}
	}

}
