import java.util.*;

class keyword{

	void  method1(){
	System.out.println("This Method One ");
	this.method2();							//Secon method call by using this keyword and without create object
	}
	
	void method2() {
	
	System.out.println("This Is second method");
	
	System.out.println("This method call by this keyword without object create");
	}
	
}



class Thismethod{
	public static void main(String args[]){
	
	
	keyword keyobj=new keyword();
	keyobj.method1();						//Only Call onee method But use Second method is call With the help of this keyword
	}
}
	