import java.util.*;

class name{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name:");
String name=sc.nextLine();
System.out.println("Enter Which Time Exucute:");
int num=sc.nextInt();
for(int i=1;i<=num;i++){
System.out.println(i+ " "+name);
}
}
}

