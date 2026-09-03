//Find the count of even or odd no from the array.

import java.util.*;

class Evenoddcount{
	public static void main(String args[])
	{
		int arr[]={11,10,7,1111,71,70,66,90};
		int even=0;
		int odd=0;
		
		for (int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
			even++;
			
			else
			odd++;
			
			}
		System.out.println("The Count of even Number is  " + even);
		System.out.println("The Count of odd Number is  " + odd);
		
	}
}