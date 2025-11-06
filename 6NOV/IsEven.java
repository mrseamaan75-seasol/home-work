class IsEven
{
	public static void main(String[] args)
	{
		IsEven sc = new IsEven();
		boolean res = sc.Sum(3);
		System.out.println(res);
	}
	boolean Sum(int a)
	{
		if (a%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}