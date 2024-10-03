import java.util.*;
class Compare
{
public static void main (String args[])
{
float a,b;
Scanner sc=new Scanner(System.in);
a=sc.nextFloat();
b=sc.nextFloat();
a=a*1000;
b=b*1000;
int c= (int)(a);
int d= (int)(b);
if(c==d)
System.out.println("the numbers are same upto 3 decimal numbers");
else
System.out.println("the numbers are not same upto 3 decimal numbers");
}
}