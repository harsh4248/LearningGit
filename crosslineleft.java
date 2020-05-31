import java.util.*;
class crossline
{
	public static void main(String a[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the height of line");
		int height=in.nextInt();
		for (int i=0;i<=height;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=0;k<1;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.print("harsh dalwadi");
	}
}