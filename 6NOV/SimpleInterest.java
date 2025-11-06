class SimpleInterest 
{
    static double calculateSimpleInterest(double principal, double rate, int days)
	{
        double time = days / 365.0d; 
        double interest = (principal * rate * time) / 100.0d;
        return interest;
    }

    public static void main(String[] args)
	{
        double principal = 10000.0d; 
        double rate = 5.0d;          
        int days = 90;            

        SimpleInterest s = new SimpleInterest();
		double Time = s.calculateSimpleInterest(principal,rate,days);
        System.out.println("Simple Interest for " + days + " days = " + Time);
    }
}
