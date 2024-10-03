import java.util.*;
class Quad
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float a=sc.nextFloat();
float b=sc.nextFloat();
float c=sc.nextFloat();
float d=(b*b)-(4*a*c);
if(d>0)
System.out.println("the eq is real and consistent");
else if(d==0)
System.out.println("the eq is real and equal");
else
System.out.println("the eq is imaginary");
}
}