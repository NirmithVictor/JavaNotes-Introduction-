package Public_Private_Protected;
/*
 Final keyword has a numerous way of use:
 It cannot be sub-classed
 It cannot be over-ridden by subclasses
 It can only be initialized ONCE
 
 
 */
public class final_keyword extends final_main{
	public int getNumber() {
		return number;
	}
	private final int number;
	final_keyword(){
		number=12;
	}
	
	
}
