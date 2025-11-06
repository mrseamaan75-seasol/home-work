class ArrayValue
{
	public static void main(String[] args)
	{
		int ar[] = {12, 18, -2, -36, 45, -21, 1};
		ArrayValue sc = new ArrayValue();
		sc.sum(ar);
	}
	void sum (int ar[])
	{   
		for ( int i = 0; i< ar.length; i++ )
		{
			if (0<ar[i])
			{
				System.out.println("Postive number is :"+ar[i]);
			}
			else if (ar[i]<0)
			{
				System.out.println("Negative number is :"+ar[i]);	
			}
		}
	}
}