package lesson2_Classes_OOP;
//what is static
//static members belong to the class instead of a specific instance 
//For instance heel hee=new heel(); heel can be used to access the static functions in the heel class
public class Static {
	public static void main(String[] args) {
		Static_Example ex=new Static_Example();
		Static_Example ex1=new Static_Example();
		
		System.out.println("Number of morons: "+Static_Example.getNumber());
	}
}
