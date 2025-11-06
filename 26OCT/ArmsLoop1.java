class ArmsLoop1
{
	public static void main(String[] args)
	{
		int a = 1551;
		int temp = a;
		int rem = 0;
		int sum = 0;
		while (a>0)
		{
			rem = a%10;
			sum = rem+(sum*10);
			a = a/10;
		}
		if(sum==temp)
		{
			System.out.println("Its a palindrone number");
		}
		else 
		{
			System.out.println("Its not a palindrone number");
		}
	}
}