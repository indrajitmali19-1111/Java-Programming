import java.io.*;
import java.lang.*;


class parent{    //Single leval inheritance

	int parentvariable=11;
	
	void parentmethod(){
		System.out.println("This Is parent Class MEthod");
		}
		
	void parentmethod_second(){
		System.out.println("This Is second method of Parent class");
	}
}




class child extends parent{
  
  String name="My name"

	/*Only extend and create objec of this class in a main method*/
}





class Single_Inheritance{
	public static void main(String argss[]){
	
	
		child cobj=new child();  /*This IS child class Object*/
		
		cobj.parentmethod();  //Methods Are  present in parent
		cobj.parentmethod_second();
		
		System.out.println(cobj.parentvariable);
		System.out.println(cobj.name);
		

	}
	
}