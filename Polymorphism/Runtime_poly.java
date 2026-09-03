import java.util.*;
class parent{
	//Method Overriding
	
	void method(){
	System.out.println("This Is Parent class method");
	}
	
	}
	
	
class Child extends Parent{
	void method(){
	System.out.println("This method Child class Override");
	}
}





class Runtime_poly{
	public static void main(String args[]){
	Child obj=new Child();
	obj.method();
	obj.super.method()
	
	}