//write programe to converte the case of characters
// upper case
//lower case


class Str_upr_lw_up
{
	public static void main(String args[]){
	String str="welcome tO JaVa";
	String result="";
	
	for(int i=0;i<str.length();i++){
	
	char ch=str.charAt(i);
	
	if(ch>='A' && ch<='Z'){
	result=result+(char)(ch+32);   //for capital
	}
	else if(ch>='a' && ch<='z'){
	result=result+(char)(ch-32);   //or small
	
	}
	
	else{
	
	result=result+ch;//spaces add
	}
	
	}

	System.out.println("The Original String is  "+ str);
	System.out.println("The Result  String is  "+ result);
	
}
}