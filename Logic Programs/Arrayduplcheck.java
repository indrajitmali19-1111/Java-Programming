import java.util.*;

class Arrayduplcheck{

	public static void main(String args[])
	{
		System.out.println("Print The duplicate element in array");
		System.out.println("Print The Count of Duplicate element");
		System.out.println("Print The duplicate element Present or Not");
		System.out.println("-----------------------------------------");
		
		
		Arrayduplcheck arr=new Arrayduplcheck();
		arr.arraycheck();
	}
	
void arraycheck(){
	int [] arr ={90,45,61,28,45,78,28};
	int count=0;
	
	for(int i=0; i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
		
			if(arr[i]==arr[j]){
			count++;
			System.out.println("The Duplicate num is " + arr[i]);
			}
		}
	}
	
	if(count!=0){
	System.out.println("The Duplicate element is Present ");
	System.out.println("The Duplicate element Count is " + count);
	}
	else{
	System.out.println("The Duplicate element is Not Present ");
    }
}	
}			