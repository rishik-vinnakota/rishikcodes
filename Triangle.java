import java.util.*;
class Triangle
{
public static void main (String args[])
{
int a,b,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter no. of rows");
a=sc.nextInt();
for(i=1;i<=a;i++)
{
for(b=1;b<=i;b++)
System.out.print(b);
System.out.println("");
}
}
}