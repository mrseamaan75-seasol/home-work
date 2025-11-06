class AddNumber
{
	public static void main(String[] args)
	{
		AddNumber sc = new AddNumber();
		int res = sc.AddNumber(44,50);
		System.out.println(res);
	}
	int AddNumber(int a,int b)
	{
		int sum = a+b;
		return sum; 
	}
}