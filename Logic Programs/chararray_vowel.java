import java.util.*;

class chararray_vowel{

	public static void main(String args[])
	{
		char [] chararr={'f','o','r','t','u','n','e'};
		int count=0;
		
		for(int i=0; i<chararr.length;i++){
			if(chararr[i]=='a' || chararr[i]=='e' || chararr[i]=='i' || chararr[i]=='o'  || chararr[i]=='u'){
				count++;
				System.out.println("The Character IS  "+chararr[i]);
				
			
			}	
		}
		if(count!=0){
			System.out.println("In Array Vowel Is Available");
		}
		else{
			
			System.out.println("In Array Vowel Not Available");
		
		}
		
	}
}