public class EvenNumbersForLoop
 {
    public static void main(String[] args) 
	{
        System.out.println("Even numbers from 1 to 30:");

        // Using for loop
        for (int i = 1; i <= 30; i++) 
		{
            if (i % 2 == 0) 
			{
                System.out.println(i + " "+"is the even number");
            }
        }
    }
}
