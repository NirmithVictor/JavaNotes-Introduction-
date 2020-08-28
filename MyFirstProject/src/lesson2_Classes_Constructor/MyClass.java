package lesson2_Classes_Constructor;
import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube a=new Cube();
		Scanner b=new Scanner(System.in);
		int c=2,d=4,e=6;
		a.setLength(c);
		a.setBreadth(d);
		a.setHeight(e);
		System.out.println(a.getCubeVolume());
		
	}

}
