import java.util.*;

class Arr_lar_ele_sec_ele
{

	public static void main(String args[])
	{
	
		int [] arr={107,98,71,92,111};
		int max=0;							//This is store max element
		int second_max=0;					//This is for storing second max number
		
		for(int i=0;i<arr.length;i++){
		
		if(arr[i]>max)						/*array element compare and then condition is true to store the element */
		{
			max=arr[i];					/* In this case Store MAx number in max variable */
			
		}
		else if(arr[i]>second_max && second_max!=max){
			second_max=arr[i];
		}
		}
		System.out.println("The Largest number is=" + max);
		
		/*for(int j=0;j<arr.length;j++){
			if(arr[j]>second_max && second_max!=max)*/				/*first compare sec ele is small then and cond is max is greter than second then store ele*/
			/*{
			second_max=arr[j];
			}
		} */
		
		System.out.println("The second largest element is=" + second_max);
		
		}
	}
		