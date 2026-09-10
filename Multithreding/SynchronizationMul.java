//Synchronization in multithreding

import java.util.*;
import java.lang.*;

class Parent
{
	public synchronized void get(int x)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*x);
		}
	}
}

class Thread1 extends Thread
{
	Parent p1;
	
	public Thread1(Parent p1)
	{
		this.p1=p1;
	}
	
	public void run()
	{
	
		p1.get(2);
	}
}


class Thread2 extends Thread
{
	Parent p2;
	
	public Thread2(Parent p2)
	{
		this.p2=p2;
	}
	
	public void run()
	{
	
		p2.get(7);
	}
}



class Thread3 extends Thread
{
	Parent p3;
	
	public Thread3(Parent p3)
	{
		this.p3=p3;
	}
	
	public void run()
	{
	
		p3.get(4);
	}
}



class Thread4 extends Thread
{
	Parent p4;
	
	public Thread4(Parent p4)
	{
		this.p4=p4;
	}
	
	public void run()
	{
	
		p4.get(11);
	}
}

class SynchronizationMul
{
	public static void main(String args[])
	{
		Parent p1=new Parent();
		
		Thread1 tr1=new Thread1(p1);
		tr1.start();
		
		Thread2 tr2=new Thread2(p1);
		tr2.start();
		
		
		Thread3 tr3=new Thread3(p1);
		tr3.start();
		
		
		Thread4 tr4=new Thread4(p1);
		tr4.start();
	}
}
