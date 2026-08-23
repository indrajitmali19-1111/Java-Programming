import java.util.*;

class Strvowel{

	public static void main(String [] args){
	String str="Fortune";
	String str1="";
	int count=0;
	int count2=0;
	
	for(int i=0;i<str.length();i++){
	
	str1=str+str.charAt(i);
	
	if(str1.charAt(i)=='a' || str1.charAt(i)=='A' || str1.charAt(i)=='e' ||str1.charAt(i)=='E' ||str1.charAt(i)=='i' || str1.charAt(i)=='I' || str1.charAt(i)=='o' || str1.charAt(i)=='O' ||str1.charAt(i)=='u' || str1.charAt(i)=='U' ){
	count++;
	}
	else{
	count2++;
	}
	}
	
	
	System.out.println("The Total Vowels: "+count);
	System.out.println("The Total Consonent: "+count2);
	
	}
	}