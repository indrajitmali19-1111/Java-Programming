//program for string input "aaabbcc" and output "a3b2c2"

import java.util.*;

class String_character_rep
{
	public static void main(String args[])
	{
		String str="aaabbcc";
		String output="";
		int count=1;
		
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				count++;
				
			}
			else
			{
				output=output+str.charAt(i)+count;
				count=1;
			}
		}
		
		output=output+str.charAt(str.length()-1)+count;		//c++=c2
		System.out.println("The Original String  " +str);
		System.out.println("The Output String   " + output);
	}
}