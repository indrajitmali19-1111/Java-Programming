import java.util.*;

class ExceptionCreate
{
	public static void main(String args[])
	{
		int balance=5000;
		int Withdrawl=10000;
		
		if(balance>Withdrawl)
		{
			System.out.println("Withdrawl THE Amount");
			
		}
		else
		{
			throw new BalanceKamiAahe("Balance Kami Aahe Dada Tuja");
		}
	}
}

class BalanceKamiAahe extends RuntimeException
{
	BalanceKamiAahe(String Exception)
	{
		super(Exception);
	}
}