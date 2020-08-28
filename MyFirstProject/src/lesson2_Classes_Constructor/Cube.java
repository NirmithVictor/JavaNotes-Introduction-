package lesson2_Classes_Constructor;

public class Cube {
	int length;
	int breadth,height;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getCubeVolume() {
		return length*breadth*height;
	}
	Cube(){
		System.out.println("We are in constructor");
				
		
	}
}
