package a1;


public class Calculator {

		public static int add(int valueOne, int valueTwo) {
			return valueOne + valueTwo;
		}

		public static int sub(int valueOne, int valueTwo) {
			return valueOne - valueTwo;
		}

		public static int multiply(int valueOne, int valueTwo) {
			return valueOne * valueTwo;
		}

		public static float divide(int numerator, int denominator) {
			if (denominator == 0)
				throw new ArithmeticException("ZeroDivisionError");

			return (float) numerator / denominator;
		}
}

