//This is Join() method Program

import java.util.*;

class Website extends Thread
{
	public void run()
	{
		System.out.println("Open Irtc Website");
		
			try{
					Thread.sleep(5000);
				}
			catch(Exception e)
			{}
			
		System.out.println("Ticked Booked");
	}
}

class ReachToStation extends Thread
{

	public void run()
	{
		System.out.println("Start from home");
		
		try {
			Thread.sleep(2000);
			}
			
		catch (Exception e)
		{}
		
		System.out.println("Reach to Station");
	}	
}

class Travel extends Thread
{

	public void run()
	{
		System.out.println("Start");
		
		try {
			Thread.sleep(2000);
			}
			
		catch (Exception e)
		{}
		
		System.out.println("End");
	}	
}

class ReachedDestination extends Thread
{

	public void run()
	{
		System.out.println("Reached Destination Start");
		
		try {
			Thread.sleep(2000);
			}
			
		catch (Exception e)
		{}
		
		System.out.println("Reach Destination End");
	}	
}

class JoinMethod
{
	public static void main(String args[]) throws Exception
	{
		Website tr1=new Website();
		tr1.start();
		tr1.join();
		
		
		ReachToStation tr2=new ReachToStation();
		tr2.start();
		tr2.join();
		
		
		Travel tr3=new Travel();
		tr3.start();
		tr3.join();
		
		
		ReachedDestination tr4=new ReachedDestination();
		tr4.start();
		tr4.join();
	}
}