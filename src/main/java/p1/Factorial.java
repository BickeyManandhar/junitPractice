package p1;

public class Factorial {

	public int fact(int num) {
		int result = 1;
		if (num == 0) {
			return 1;
		} else if (num < 0) {
			throw new ArithmeticException();
		} else {
			for (int i = 1; i <= num; i++) {
				result = result * i;
			}
			return result;
		}
	}

}
