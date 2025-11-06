import java.util.Scanner;
class Arrayscan
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Len :");
		int Len = sc.nextInt();
		
		int ar[]= new int[Len];
		
		for (int i=0;i<ar.length;i++)
		{
			System.out.println("Enter the value :");
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("The"+i+"index value of array"+ar[i]);
		}
	}
}