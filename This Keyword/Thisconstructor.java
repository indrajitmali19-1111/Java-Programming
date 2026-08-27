import java.util.*;

class Construct{

	Construct(int i){
	System.out.println("This Is first Constructor parameterized");   //parameterized constructor
	this();
	}
	
	Construct(){
	System.out.println("This Is second Constructor Default");
	}
	
	}
	
	
class Thisconstructor{

	public static void main(String args[]){
	
		construct conobj=new construct(11); //Constructor is automatically called when crate object
		
	}
}