import java.util.*;

class Strmethods{

public static void main(String [] args){

String str="Indrajeet";
String str1=new String("_Mru");

String trimstr="        IM       ";


//For Comparing
String compare="Ind";
String compare1="Ind";

String Compare=new String("Indrajeet");
String Compare1=new String("Indrajeet");




//Concat Method
str1=str.concat(str1);
System.out.println(str1);



// Length method

System.out.println(str1.length());




//Uppercase
System.out.println(str1.toUpperCase());



//Lowercase

System.out.println(str1.toLowerCase());





//Charat

System.out.println(str1.charAt(5));




//Index of

System.out.println(str.indexOf('j'));



//Character in Uppercase Rong result

System.out.println(str.indexOf('J'));



//Trim method
System.out.println(trimstr);
//Trim method use
System.out.println(trimstr.trim());




//String Comparing

//==Operator
System.out.println( compare == compare1);
System.out.println(Compare == Compare1);



//By .equal Method

System.out.println(compare.equals(compare1));  
System.out.println(Compare.equals(Compare1));

}
}
