package a3;

public class FizzBuzz {

	public static Object convertNumber(int number) {
		if(number%5 == 0 && number%7 != 0)
		{
			return "Fizz";
		}
		if(number%5 != 0 && number%7 == 0)
		{
			return "Buzz";
		}
		if(number%5 == 0 && number%7 == 0)
		{
			return "FizzBuzz";
		}
		return null;
	}

}
