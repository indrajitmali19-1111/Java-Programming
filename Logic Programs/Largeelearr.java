//Find the largest element from the array.

import java.util.*;

class Largeelearr{
	public static void main(String args[]){
		int arr[]={11,4,7,6,5,10};
		int largest=arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				largest=arr[i];
			}
			}
		System.out.println("The Larget element is  "+largest);
		}
		}