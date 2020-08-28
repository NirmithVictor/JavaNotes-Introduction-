package lesson2_Classes_OOP;
//classes are datastructure or type which you can define some variables(member) or methods(member)
//create instance or object of a class
public class Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student mark=new Student();
		mark.setId(2);
		mark.setName("Mark");
		mark.setAge(19);
		System.out.println(mark.getName()+" is "+mark.getAge()+" years old");
		System.out.print(mark.math());
		
	}
	
}
