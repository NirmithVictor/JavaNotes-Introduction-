package lesson1;

public class Java_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello There";
		System.out.println("Lowercase: "+a.toLowerCase());
		System.out.println("Uppercase: "+a.toUpperCase());
		System.out.println("Length: "+a.length());
		System.out.println("Replace one letter with the other: "+a.replace("e", "e1"));
		System.out.println("Position of e: " + a.indexOf("e"));
	}

}
