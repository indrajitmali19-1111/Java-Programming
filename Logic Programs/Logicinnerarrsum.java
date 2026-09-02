import java.util.*;

class Logicinnerarrsum{

	public static void main(String args[]){
		
		int arr [][]={{10,20,30,40},{50,60,70,80},{30,50,70,90},{20,40,60,80}};
		int sum=0;
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr.length;col++){
				if(arr[1][1]==arr[row][col] && arr[2][2]==arr[row][col]){
				System.out.print(arr[row][col]);
				sum=sum+arr[row][col];
				}
				else{
				System.out.print(" ");
				}
				
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
			System.out.println("The Addition is"+ sum);
			
		}
	}
	