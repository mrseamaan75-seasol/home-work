class Pattern3
{
	public static void main(String [] args)
	{
		{	
            int i = 1;		
			for(int k = 9; (k-i)>=0;k--)
			{
				System.out.print(" ");
			}
			for(int j = 1; j<=(2*i)-9;j++)
			{
				System.out.print("*");
			}
			
			
			System.out.println();	
		}
	}
}