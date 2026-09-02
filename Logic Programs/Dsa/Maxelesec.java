import java.util.*;

class Maxelesec{
	public static void main(String args[]){
		int arr[]={111,20,90,55,10,71};
		
		int max=0;
		int sec_max=0;
		
		for(int i=0;i<arr.length;i++){
		if(max<arr[i] ){
		max=arr[i];
		}
		}
		
		System.out.println("The max element is =  " + max + "\n\n\n\n\n");
		
		for(int i=0;i<arr.length;i++){
		if(sec_max<arr[i] && arr[i]!=max ){
		sec_max=arr[i];
		}
		}
		System.out.println("The  Second max element is =  " + sec_max);
		
		
	}
}