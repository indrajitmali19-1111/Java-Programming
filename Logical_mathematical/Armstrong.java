import java.util.*;

class Armstrong{

	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.out);
		
		System.out.println("----Armstrong Number------");
		int num=153;
		int temp=num;
		int sum=0;
		
		while(num>0){
		
		int digit=num%10;
		sum=sum+(digit*digit*digit);
		num=num/10;
		}
		if(temp==sum){
			System.out.println("The Number Is Armstrong");
			
			}
		else{
			System.out.println("The Number Is Not Armstrong Number");
			}
			
		}
		}