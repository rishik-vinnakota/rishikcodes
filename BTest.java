class B
{
int a;
int b;
void f1()
{
System.out.println("a="+a+"b="+b);
}
}
class BTest
{
public static void main(String args[])
{
B obj1=new B();
obj1.a=10;
obj1.b=20;
System.out.println("a="+obj1.a+"b="+obj1.b);
B obj2=new B();
obj2.a=20;
obj2.b=30;
System.out.println("a="+obj2.a+"b="+obj2.b);
obj1.f1();
obj2.f1();
}
}
