class SumFun
{
	public static void main(String[] args)
	{
		int ar[] = {13,26,5,20,13,7};
		SumFun sc = new SumFun();
		System.out.println(sc.sum(ar));
	}
	int sum (int ar[])
	{    
	    int Array = 0;
		for ( int i = 0; i< ar.length; i++ )
		{
			Array = ar[i]+Array;
		}
		return Array;
	}
}