// Find the length Without Using predefined length method
// Solution is By convert charr arrray through and substring

import java.util.*;
import java.lang.*;


class Stringlength{
	public static void main(String args[]){
	String str="Indrajeet";
	char strarr[]=str.toCharArray();
	int length=0;
	
	for(int i=0;i<strarr.length;i++){
	char temp=strarr[i];
	length++;
	}
	System.out.println("This is Length" + length);
	}
}

