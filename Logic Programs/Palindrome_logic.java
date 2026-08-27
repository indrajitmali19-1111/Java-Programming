import java.util.*;

class Palindrome_logic{

	public static void main(String args[]){
	
	int num=111;
	int temp=num;
	int digit=0;         //Used for storing next Digit
	int reverse_ele=0;
	
	
	while(num!=0){
	
		digit=num%10;  					//Reminder Store
		reverse_ele=reverse_ele*10+digit;                 /*for Storing Reverse element multiply 10 because 9*10=90 and 90+1=91 next element storing that reasson*/
		num=num/10;                    /*This is logic for Remove the element*/
		
		}
		
		
	if(temp==reverse_ele){
		System.out.println("The Num IS Pallindrome Number "+ reverse_ele + " " + " element is  "+temp);
		}
	else{
		System.out.println("The number Is Not Pallindrome");
		}
		
		}
	}
		
		