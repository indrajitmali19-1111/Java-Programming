import java.util.*;

class Exceptions{
	public static void main(String args[]){
	
	int a=10,b=0,c;
	//Arithematic Exceptions
	
	try{
		c=a/b;
		System.out.println("THis Is exception handeling"); //Exception occurs to throw to catch block
		}
	catch(ArithmeticException e){
		System.out.println("This is Arithmatic Exception");
		e.printStackTrace();  //Object block
		}
		
		
	String name=null;
	//Null pointer Exception
	
	try{
		System.out.println(name.length());
	}
	catch(NullPointerException e){
		System.out.println("\n\nThis is String out of Bound exception\n\n");
		e.printStackTrace();
	}
	
	//StringIndexOutOfBoundException
		String name1="Fortune";
		//length is 7
		
		try{
			System.out.println(name1.charAt(9));
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("\n\n\nThis Is StringIndexOutOfBoundsException\n\n");
			e.printStackTrace();
		}
		
		//arrayindex Out of bound exception handle
		
		int arr[]={11,11,11,11,11,11,11,11};
		 try {
			 System.out.println(arr[10]);
		 }
		 catch(ArrayIndexOutOfBoundsException e){
			 System.out.println("\n\n\nThis is array index out of bounds exception\n\n\n");
			 System.out.println("\n\n" + e +"\n\n");
			 e.printStackTrace();
		 }
		Exceptionclass();
		 
		 
}






		static void Exceptionclass(){
			int a=10,b=0,c;
	//Arithematic Exceptions
	
	try{
		c=a/b;
		System.out.println("THis Is exception handeling"); //Exception occurs to throw to catch block
		}
	catch(Exception e){
		System.out.println("This is Arithmatic Exception");
		e.printStackTrace();  //Object block
		}
		
		
	String name=null;
	//Null pointer Exception
	
	try{
		System.out.println(name.length());
	}
	catch(Exception e){
		System.out.println("\n\nThis is String out of Bound exception\n\n");
		e.printStackTrace();
	}
	
	//StringIndexOutOfBoundException
		String name1="Fortune";
		//length is 7
		
		try{
			System.out.println(name1.charAt(9));
		}
		catch(Exception e){
			System.out.println("\n\n\nThis Is StringIndexOutOfBoundsException\n\n");
			e.printStackTrace();
		}
		
		//arrayindex Out of bound exception handle
		
		int arr[]={11,11,11,11,11,11,11,11};
		 try {
			 System.out.println(arr[10]);
		 }
		 catch(Exception e){
			 System.out.println("\n\n\nThis is array index out of bounds exception\n\n\n");
			 System.out.println("\n\n" +e +"\n\n");
			 e.printStackTrace();
		 }
}
}
