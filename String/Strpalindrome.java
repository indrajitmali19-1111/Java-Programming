import java.util.*;

class Strpalindrome{

	public static void main(String [] args){
	
	String Name="Fortune";
	String temp=Name;
	String Reverse="";
	
	for(int i=Name.length()-1;i>=0;i--){
	Reverse=Reverse+Name.charAt(i);
	}
	
	System.out.println(Reverse);
	
	if(temp==Reverse){
	System.out.println("The String Is Palindrome");
	}
	else{
	System.out.println("The String Is Not Palindrome");
	}
	
  }
}
