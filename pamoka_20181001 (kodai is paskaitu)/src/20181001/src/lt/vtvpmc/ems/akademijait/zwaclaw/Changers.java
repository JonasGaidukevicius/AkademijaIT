package lt.vtvpmc.ems.akademijait.zwaclaw;

public class Changers {
	public static void main (String [] args) {
		changeTwoNumbersVersionTwo(10.0, 20.0);
		printBinaryDouble(10.5);
	}
	
	public static double changeTwoNumbers(double numberOne, double numberTwo) {
		double tmp = numberOne;
		numberOne = numberTwo;
		numberTwo = tmp;
		return numberOne;
	}
	
	public static double changeTwoNumbersVersionTwo(double numberOne, double numberTwo) {
		numberOne = numberOne + numberTwo;
		numberTwo = numberOne - numberTwo;
		numberOne = numberOne - numberTwo;
		return numberOne;
	}
	
	public static int changeTwoNumbersVersionThree(int numberOne, int numberTwo) {
		numberOne = numberOne ^ numberTwo;
		numberTwo = numberOne ^ numberTwo;
		numberOne = numberOne ^ numberTwo;
		return numberOne;
	}
	
	public static void printBinaryDouble(double number) {
		long bits = Double.doubleToLongBits(number);
		for (int i = 31; i >= 0; --i) {
			System.out.print((bits & (1 << i)) == 0 ? "0" : "1");
		}
	}
}









