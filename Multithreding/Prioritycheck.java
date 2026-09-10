//Main method Default priority check and child thread priority check

import java.util.*;

class Prioritycheck 
{
	public static void  main(String args[]) 
	{
		System.out.println(Thread.currentThread().getPriority());
		Childs obj=new Childs();
		obj.start();
		
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		
	}
}

class Childs extends Thread
{
	
		public void run()
		{
			System.out.println(Thread.currentThread().getPriority());
		}
}