import java.util.*;

abstract class parent{
	 abstract void method();
	
	void method1(){
		System.out.println("THis IS method Two");
	}
	
	abstract static void method3();
}


class child extends parent{
	void method(){
	System.out.println("This IS Abstract method in Abstract class");
	}
	static void method3(){
		System.out.println("THis is Method three");
	}
	
	
}


class Abstractclass1{

	public static void main(String args[]){
		
		child obj= new child();
		obj.method1();
		obj.method();
		method3();
	}
}