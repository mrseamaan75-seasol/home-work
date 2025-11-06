public class TemperatureConverter 
{
    public static double convert(double celsius) 
	{
        return (celsius * 9 / 5) + 32;
    }
    public static void main(String[] args)
	{
        double celsius = 25.0; 
		TemperatureConverter T = new TemperatureConverter();
        double fahrenheit = T.convert(celsius);
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }
}
