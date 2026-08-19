import java.util.*;

class Fibonaccis{

	public static void main(String args[]){
		System.out.println("---FibonaCCi Series---");
		
		int num1=0;
		int num2=1;
		int num3=0;
		
		for(int i=1;i<=10;i++){
		
		num3=num1+num2;
		num1=num2;
		num2=num3;
		
		System.out.print(num3+" ");
		}
	}
	
}