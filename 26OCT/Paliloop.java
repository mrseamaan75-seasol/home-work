class Paliloop
{
	public static void main(String [] args)
	{
		int a = 1441;
		int temp = a;
		int rem =0;
		int sum = 0;
		while(a>0)
		{
			rem = a%10;
			sum = rem+(sum*10);
			a = a/10;
		}
		
		if(sum==temp)
		{
			System.out.println("It's a Palindrome Number");
		}
		else
		{
			System.out.println("It's not a Palindrome Number");
		}
	}
}