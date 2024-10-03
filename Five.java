import java.util.*;
class Five
{
public static void main (String args[])
{
float a,s=0,d;
Scanner sc=new Scanner(System.in);
for(a=0;a<5;a++)
{
d=sc.nextFloat();
s=s+d;
}
System.out.println("the sum is"+s);
}
}
