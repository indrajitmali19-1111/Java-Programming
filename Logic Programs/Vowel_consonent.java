//Write a program to count vowel and consonent.


import java.util.*;


class Vowel_consonent{
	public static void main(String args[]){
	String str="indrajeet";
	int vowel=0;
	int consonent=0;
	
	
	
	for(int i=0;i<str.length();i++){
		
		char ch=str.charAt(i);
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
		vowel++;}
		
		else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
		consonent++;}
		
	}
	
	System.out.println("The Vowel count is = "+vowel);
	System.out.println("The consonent count is = "+consonent);
	
}
}