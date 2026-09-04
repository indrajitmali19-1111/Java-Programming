//revrerse number using recursion

import java.util.*;

class ReverseNumber
{
	static void reverse(int number)
	{
		if(number<10)
		{
			System.out.println(number);
			return;
			
		}
		else
		{
			System.out.print(number%10);
			reverse(number/10);
		}
	}
	
	public static void main(String []args)
	{
		reverse(123456789);
	}
}