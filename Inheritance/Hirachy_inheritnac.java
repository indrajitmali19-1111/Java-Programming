import java.util.*;


class parent{
	void method_parent(){
		System.out.println("This Is PArent Class Method");
		}
		
	}
	


class child_one extends parent{

	/*void child1(){
		System.out.println("THis IS child class One method");
		
	}*/
}


class child_two extends parent{
	
	/*void child2(){
		System.out.println("This IS child2 method");
	}*/
}


class child_three extends parent{
	/* this is child three they aquire all class property 
		because create like link */
	
	}
	
	
	
class Hirachy_inheritnac{

	public static void main(String args[]){
		
		child_three obj=new child_three(); //This is Child three Object
		child_one obj1=new child_one(); //This is child one object
		child_two obj2=new child_two(); //This is Child two object
		
		
		obj.method_parent();
		obj1.method_parent();
		obj.method_parent();
		
	}
	
}

	
	
	
	
	
	

