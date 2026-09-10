//Sleep method in multithreading

import java.util.*;

class Thread1 extends Thread
{
	public void run()
	{
	for(int i=0;i<=10;i++)
	{
		try{
		Thread.sleep(1000);
		}
		catch(Exception e)
		{}
		
		
		System.out.println("Good Morning");
	}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<=60;i++)
		{ 
		try{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{}
			System.out.println(i + " Second");
			
		}
	}
}

class Sleepmethod
{
	public static void main(String args[]) throws Exception
	{
		Thread tr1=new Thread1();
	
		tr1.start();
		
		Thread2 tr2 = new Thread2();
		tr2.start();
		
	}
}