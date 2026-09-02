import java.util.*;

class Compiletime{
	
	void man(String home){
			if(home.equals("home"))
			System.out.println("In home its act as a "+ home);
		}
	void man (int id){
		if (id==11)
			System.out.println("In Office");
			
		}
	void man(int id,String name){
		if(id==11 && name.equals("indra"))
		System.out.println("This is Admin Method");
		
	}
}



class Polymorphismcom{
	public static void main(String args[]){
		
	Compiletime obj=new Compiletime();
	
	obj.man(11,"indra");	
	}
}	
		
		
		
		