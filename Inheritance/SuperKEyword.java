import java.util.*;

class parent{
	String name="Indra";
	
	void method(){
		System.out.println("THis is Parent Class Method");
	}
	
}


class child extends parent{
	String name="mru";  //Override the variable
	
	void method() {			//Overide the Method
	
		System.out.println("This is Child class method");
		System.out.println(super.name);
		}
}



class SuperKEyword{

	public static void main(String args[]){
		
		child obj=new child();
		
		System.out.println("This IS Child class variable" + obj.name);
		/*System.out.println("This IS Child class variable" + obj.super.name);*/
		
		obj.method();
		
	
}

}
		
		
	
	
	
	