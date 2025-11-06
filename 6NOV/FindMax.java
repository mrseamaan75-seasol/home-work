class FindMax
{
	public static void main(String[] args)
	{
		FindMax sc = new FindMax();
		int res = sc.FindMax(50,68);
		System.out.println(res);
	}
	int FindMax(int a,int b)
	{
		int Max = 0;
		if (a<b)
		{
			Max = b;
		}
		else if (a>b)
		{
			Max = a;
		}
		return Max;
	}
}