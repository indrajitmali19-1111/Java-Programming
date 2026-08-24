import java.util.*;

class Strbufmethods{

public static void main(String args[]){

	StringBuffer str=new StringBuffer("Indrajeet");
	
	StringBuffer str2=new StringBuffer("Mru");
	
	
	//For Comparing
	
	StringBuffer compare=new StringBuffer("Indrajeet");
	StringBuffer Compare=new StringBuffer("Indrajeet");

	System.out.println(str);


	//Capacity MEthod
	System.out.println(str.capacity());
	System.out.println(str2.capacity());
	
	//length Method
	
	System.out.println(str.length());
	
	
	// append Method
	
	System.out.println(str.append(" Mru"));
	


	//Reverse Method
	
	//System.out.println(str.reverse());
	
	
	
	//Delete
	
	System.out.println(str.delete(9,13));

	//Insert
	
	System.out.println(str.insert(9," Mru"));
	
	
	//replace
	
	System.out.println(str.replace(10,13,"ind"));	
	
	
	//equals refference compare
	
	System.out.println(compare.equals(Compare));
	
	
	//lastindex
	
	
	System.out.println(str.lastIndexOf("e"));
	
	//Indexof
	System.out.println(str.indexOf("e"));
	
	}
}