import java.util.*;

class Maxele{
	public static void main(String args[]){
		int arr[]={111,20,90,55,10,71};
		
		int max=0;
		for(int i=0;i<arr.length;i++){
		if(max<arr[i] ){
		max=arr[i];
		}
		}
		System.out.println("The max element is =  " + max);
	}
}