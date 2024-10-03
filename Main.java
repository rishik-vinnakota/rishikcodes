import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();
		String c[]=new String[10];
		int i,j;
		for(i=0;i<a;i++)
		{
			c[i]=sc.nextLine();
		}
		int t;
		String temp;
		for(i=0;i<a;i++)
		{
			t=i;
			for(j=i+1;j<a;j++)
			{
				if(c[t].charAt(0)>c[j].charAt(0))
				{
					t=j;
				}
			}
			temp=c[t];
			c[t]=c[i];
			c[i]=temp;
		}
		for(i=0;i<a;i++)
		{
			System.out.println(c[i]);
		}
	}
}