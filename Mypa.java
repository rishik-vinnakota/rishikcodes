package my;
class Mypa
{
void check(int ba)
{
try
{
if(ba<2)
int x=10/0;
else
System.out.println("safe");
}
catch(Arithmeticexception e)
{
System.out.println("not safe");
}
}


