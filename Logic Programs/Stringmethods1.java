import java.util.*;
class Stringmethods1{
static void stringsmethod(){

	//Remove Spaces in String
	String name="M R U I N D R A J E  E E";
	String New_name=name.replaceAll(" ","");
	System.out.println("New Name is " + New_name);
	
	
	//Replace the 'e'
	
	String myname="IndrajeetEEt";
	System.out.println("The String Is=" + myname.replaceAll("e" , "MRU"));
	
	}
	
	public static void main(String args[]){
		stringsmethod();
	}
}	
	
	