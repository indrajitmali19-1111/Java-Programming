import java.util.*;

class student{
	int sid;						//this is instance variable in this class
	String sname;
	
	student(int sid, String sname){
		this.sid=sid;			//This keyword use to assign this value for instance variable
		this.sname=sname;
	}
 }

class Thisvariable{

	public static void main(String args[]){
		
		student s1=new student(11,"indra");			//Value pass to method
		
		System.out.println(s1.sid +" "+ s1.sname);
		
	}
}	
