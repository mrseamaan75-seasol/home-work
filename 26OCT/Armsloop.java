class Armsloop
{
	public static void main(String [] args)
	{
		int a = 256;
		int temp = a;
		int rem =0;
		int sum = 0;
		while(a>0)
		{
			rem = a%10;
			sum = sum+(rem*rem*rem);
			a = a/10;
		}
		
		if(sum==temp)
		{
			System.out.println("It's a Armstrong Number");
		}
		else
		{
			System.out.println("It's not a Armstrong Number");
		}
	}
}