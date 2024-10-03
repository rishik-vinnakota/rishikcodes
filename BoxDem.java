import java.util.*;
class Box
{
int a,b,c;
//constructor
Box()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the values");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
}
void vol()
{
int vol=a*b*c;
System.out.println(vol);
}
}
class BoxDem
{
public static void main(String args[]){
Box obj=new Box();
obj.vol();
}
}