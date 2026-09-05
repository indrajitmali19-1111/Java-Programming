//own Exception Create 

import java.util.*;


class Myexceptions extends RuntimeException
{
	public Myexceptions(String Msg)
	{
		super(Msg);
	}
}


class ThrowExcCreate
{
	public static void main(String args[])
	{
		String name=null;
		
		throw new Myexceptions("This is My Exception");
		
		
		
	}
}