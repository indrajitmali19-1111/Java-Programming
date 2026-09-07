import java.util.*;


class THreading1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("This is First Process");
			
		}
	}
}


class THreading2 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("This is Second Process");
			
		}
	}
}

 
class THreading3 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("This is Third Process");
			
		}
	}
}


class THreading4 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("This is Fourth Process");
			
		}
	}
}



class Threddingcl
{
	public static void main(String args[])
	{
		THreading1 obj1=new THreading1();
		obj1.start();
		
		THreading2 obj2=new THreading2();
		obj2.start();
		
		THreading3 obj3=new THreading3();
		obj3.start();
		
		
		THreading4 obj4=new THreading4();
		obj4.start();
		
		
	}
}

