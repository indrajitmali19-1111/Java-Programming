import java.util.*;

class Throwskeyword
{
	public static void main(String args[])
	{
		Throwing obj=new Throwing();
		
		try
		{
		obj.throwi(null);
		}
		catch(NullPointerException e)
		{
			System.out.println("This IS THrows KEyword through throw exception");
		}
	}
}

class Throwing
{
	void throwi(String name) throws NullPointerException
	{
		System.out.println( name.length());
	}

}