class FindSquare
{
	public static void main(String[] args)
	{
		FindSquare sc = new FindSquare();
		int res = sc.FindSquare(40);
		System.out.println(res);
	}
	int FindSquare(int a)
	{
		int sum = a*a;
		return sum;
	}
}