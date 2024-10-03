import java.util.*;
class Table
{
public static void main (String args[])
{
int a,b;
Scanner sc =new Scanner(System.in);
System.out.println("enter the req table");
a=sc.nextInt();
System.out.println("the table is");
for(b=0;b<=20;b++)
{
System.out.println(a+"*"+b+"="+(a*b));
}
}
}
