class A
{
int a;
int b;
void f1()
{
System.out.println("a="+a+"b="+b);
}
public static void main(String args[])
{
A obj1=new A();
obj1.a=10;
obj1.b=20;
System.out.println("a="+obj1.a+"b="+obj1.b);
A obj2=new A();
obj2.a=20;
obj2.b=30;
System.out.println("a="+obj2.a+"b="+obj2.b);
obj1.f1();
obj2.f1();
}
}
