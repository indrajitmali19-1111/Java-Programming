import java.util.*;

abstract class parent{
	 abstract void method();
	
	void method1(){
		System.out.println("THis IS method Two");
	}
	
	abstract void method3();
}


class child extends parent{
	void method(){
	System.out.println("This IS Abstract method in Abstract class");
	}
	void method3(){
		System.out.println("THis is Method three");
	}
	
	
}


class Abstractclass1{

	public static void main(String args[]){
		
		child obj= new child();
		obj.method1();
		obj.method();
		obj.method3();
	}
}