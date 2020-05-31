import java.util.*;

class crosslineright
{
	public static void main(String a[])
	{
		System.out.println("Enter the height of line");
		Scanner in = new Scanner(System.in);
		int height= in.nextInt();
		for (int i=0;i<=height;i++)
		{
			for(int j=height;j>=i;j--)
			{
				System.out.print(" ");
				
			}
			for(int k=0;k<1;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}