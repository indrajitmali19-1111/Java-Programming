//yield method in exception handaling

import java.util.*;

class Childthr extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("This Is Child Method");
			
		}
	}
}

class YieldMethod
{
	public static void main(String args[])
	{
		
		Childthr tr1=new Childthr();
		tr1.start();
		
		
		Thread.yield();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Method");
		}
	}
}