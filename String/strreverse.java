import java.util.*;

class strreverse{

	public static void main(String args[]){
	String str1=new String("Fortune");
	String str2=new String ("");
	for(int i=str1.length()-1; i>=0;i--){
	str2=str2+str1.charAt(i);
	}
	
	System.out.println(str2);
	}
	}
	