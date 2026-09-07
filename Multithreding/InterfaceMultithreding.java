// multiple thread create by using runnable interface  
//I create threads


import java.util.*;


class Thread1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("To phir aao");
		}
	}
}

class Thread2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Ye mere Dosto");
		}
	}
}

class Thread3 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Makhamali Makhamali");
		}
	}
}

class Thread4 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Om shanti om");
		}
	}
}


class InterfaceMultithreding
{
	public static void main(String args[])
	{
		Thread1 obj1=new Thread1();
		Thread t1=new Thread(obj1);  //Value is passed to constructor in thread class
		t1.start();
		
		Thread2 obj2=new Thread2();
		Thread t2=new Thread(obj2);
		t2.start();
		
		Thread3 obj3=new Thread3();
		Thread t3=new Thread(obj3);
		t3.start();
		
		Thread4 obj4=new Thread4();
		Thread t4=new Thread(obj4);
		t4.start();
		
	
	}
}