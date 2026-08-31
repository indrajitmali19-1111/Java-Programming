import java.util.*;

interface Parent{
	void methods();
	
	}
	
interface Parent2{
	void methods1();
	
}
	
class Child implements Parent,Parent2{	
	public void methods(){
	System.out.println("This Is first Program of Interface");
	
	}
	public void methods1(){
		System.out.println("This IS Second Method");
	}
}




class Interface1{
	public static void main(String args[]){
	Child obj=new Child();
	obj.methods();
	obj.methods1();
	
	}
}	