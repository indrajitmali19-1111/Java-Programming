//Find the character index Without using indexof() method.
//Find same character then next character index find
//Find Character same two times to last character index find
import java.util.*;

class String_index_find{
	public static void main(String args[]){
		
		String name="Indrajeet";
		char strarr[]=name.toCharArray();
		
		char character='j';
		int index=0;
		int next_index=0;
		
		for(int i=0;i<strarr.length;i++){
			
			if(character==strarr[i]){
			
			index=i;
			}
			for(i=index;i<strarr.length;i++){
				if(character==strarr[i] ){
					next_index=i;
					break;
					}
				}
		}
		
			
		System.out.println("Index Of THis Character is=" + index);
		System.out.println("Index Of THis next Character is=" + next_index);
	}
}