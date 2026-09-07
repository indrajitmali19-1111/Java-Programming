//Why interface is best way to create thread

import java.util.*;

class Thread1 extends Thread2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Om shanti om");
		}
	}
}


class Thread4
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Om shanti om");
		}
	}
}


class InterfaceMultithredingque
{
	public static void main(String args[])
	{
		Thread1 obj1=new Thread1();
		Thread t1=new Thread(obj1);  //Value is passed to constructor in thread class
		t1.start();
	}
}	
	