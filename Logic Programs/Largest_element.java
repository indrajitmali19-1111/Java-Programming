import java.util.*;

class Largest_element
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		
		
		int size;
		System.out.println("Enter Array Size");
		size=sc.nextInt();
		String Answer;
		String Answer2;
		int max=0;
		int max2=0;
		int arr[]=new int[size];
		
		
		
		
		
		
		
		System.out.println("Enter Array element");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("---------------------");
		System.out.println("Print array");
		for(int i=0; i<size;i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("----------------------------");
		System.out.println("You are Check The Largest Number In This Array ! Type:Yes/No");
		Answer=sc.next();
		
		if(Answer.equals("yes")){
			for(int i=0;i<size;i++){
				
				if(arr[i]>max){
					max=arr[i];
				}
			}
		System.out.println("THe Largest number in this array is==" + max);
		System.out.println("----------------------------");
		System.out.println("You are Check The Second Largest Number In This Array ! Type:Yes/No");
		Answer2=sc.next();
		
		if(Answer2.equals("yes")){
			for(int i=0;i<size;i++){
				
				if(arr[i]>max2 && arr[i]<max){
					max2=arr[i];
				}
			}
		System.out.println("THe Largest number in this array is==" + max2);
	 }
	}
	}	
}