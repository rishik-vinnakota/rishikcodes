import java.util.*;
class Gr3t
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float a=sc.nextFloat();
float b=sc.nextFloat();
float c=sc.nextFloat();
if(a>b)
{
if(a>c)
{
System.out.println(a+"is the greatest");
}
else
System.out.println(c+"is the greatest");
}
else
{
if(b>c)
{
System.out.println(b+"is the greatest");
}
else
System.out.println(c+"is the greatest");
}
}
}
