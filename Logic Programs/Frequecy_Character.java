//Find the frequency of each character array {'a' ,'a' , 'a','b','b','c','d','a'}
//a=4 b2 c1 d1

import java.util.*;

class Frequecy_Character
{
	public static void main(String args[])
	{
		char charr[]={'a','a','a','b','b','c','c','d'};
		
		for(int i=0;i<charr.length;i++)
		{
			int count=1;  //Because all character is aleready
			
			boolean isAppeared=false;
			
			//For repeted character present check
		
			for(int k=0;k<i;k++)
			{
				if(charr[k]==charr[i])
				{
					isAppeared=true;
					break;
				}
			}
			
			
			//For Repeted Character Present The skip the loop
			
			if(isAppeared==true)
			{
				continue;
			}
			
			
			
			//Main Logic of counting of character
			
			for(int j=i+1;j<charr.length;j++)
			{
				if(charr[j]==charr[i])
				{
					count++;
				}
			}
		System.out.println("The Character is="+ charr[i] + "  And count is "+ count);
		}
	}
}