//program to count spaces from a string.

//string str = "a  b  c  d  "
//space count=5

import java.util.*;

class String_space_count
{
	public static void main(String args[])
	{
		String str="I n d r a j e e t";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ' ')
			{
				count++;
			}
		}
	
		System.out.println("The Spaces Count IS  "+count);
	}
	
	
	
}

