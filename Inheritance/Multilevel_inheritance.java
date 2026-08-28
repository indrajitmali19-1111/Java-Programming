import java.util.*;


class parent{
	void method_parent(){
		System.out.println("This Is PArent Class Method");
		}
		
	}
	


class child_one extends parent{

	void child1(){
		System.out.println("THis IS child class One method");
		
	}
}


class child_two extends child_one{
	
	void child2(){
		System.out.println("This IS child2 method");
	}
}


class child_three extends child_two{
	/* this is child three they aquire all class property 
		because create like link */
	
	}
	
	
	
class Multilevel_inheritance{

	public static void main(String args[]){
		
		child_three obj=new child_three(); //This is Child three Object
		
		obj.method_parent();
		obj.child1();
		obj.child2();
		
	}
	
}

	
	
	
	
	
	

