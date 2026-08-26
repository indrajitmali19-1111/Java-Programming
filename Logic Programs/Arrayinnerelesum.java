import java.util.*;

class Arrayinnerelesum{

	public static void main(String args[])
	{
		System.out.println("Print The Outer array element");
		
		
		Arrayinnerelesum arr=new Arrayinnerelesum();
		arr.arrayinner();
	}
	
	
	
	
	
	
void arrayinner(){
	int [][] arr ={
					{5,1,4,9},
					{3,7,6,8},
					{2,4,3,1},
					{8,6,9,5}
					};
	int sum=0;
	
	for(int row=0; row<arr.length;row++){
		for(int col=0;col<arr.length;col++){
		
			if(row==0||col==0||row==arr.length-1||col==arr.length-1){
			
			System.out.print(  arr[row][col] + " " );
			sum=sum+arr[row][col];
			}
			else{
			System.out.print("  ");
			}
			
		}
		System.out.println();
	}
	
	System.out.println("THE sum Of array ELement " + sum);
  }
	
}

	
	