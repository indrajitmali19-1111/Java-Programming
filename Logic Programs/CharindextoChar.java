//Find The particular charatcter through index without using charat() method.

import java.util.*;

class CharindextoChar{
	public static void main(String []args)
	{
		String str="Indrajeet";
		char strarr[]=str.toCharArray();
		int index=2;
		char character;
		for(int i=0;i<strarr.length;i++){
		if(index==i){
			character=strarr[i];
			break;
		}
		}
		System.out.println("The Character is -" + character);
	}
}
		
		