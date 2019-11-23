import java.util.*;
public class window 
{
	int[] a;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter the window size");
		int ws=sc.nextInt();
		if(ws>size)
		{
			System.out.println("Wrong");
		}
		else
		{
			System.out.println("Enter the array values");
			for(int i=0;i<size;i++)
			{
				a[i]=sc.nextInt();
			}
			int max=0;
			for(int i=0;i<=size-ws;i++)
			{
				for(int j=i;j<i+ws;j++)
				{
					if(a[j]>max)
					{
						max=a[j];
					}
				}
				System.out.print(max+" ");
			}
		}
		
	}
	public static void main(String args[])
	{
		window w=new window();
		w.input();
	}

}