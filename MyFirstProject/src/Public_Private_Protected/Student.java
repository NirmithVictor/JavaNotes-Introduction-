package Public_Private_Protected;
/*
 Access Levels
 Modifier        Class		Package	Subclass	World
 public				   Y			Y				  Y			Y
 protected		   Y			Y				  Y			N
 no modifier	   Y			Y				  N			N
 private	   		   Y			N				  N			N
  */

public class Student {
	//String name;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
	
}
