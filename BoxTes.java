import java.util.*;
class Box
{
double wid;
double hei;
double dep;
double vol()
{
return wid*hei*dep;
}
void inp()
{
Scanner sc = new Scanner(System.in);
System.out.println("enter w");
wid=sc.nextDouble();
System.out.println("enter h");
hei=sc.nextDouble();
System.out.println("enter d");
dep=sc.nextDouble();
}
}
class BoxTes
{
public static void main(String args[])
{
Box ob=new Box();
ob.inp();
System.out.println("vol="+ob.vol());
Box ob1=new Box();
ob1.inp();
System.out.println("vol="+ob1.vol());
}
}

