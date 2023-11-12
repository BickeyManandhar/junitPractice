package p2;

import java.util.Random;

public class MathUtil {
	
	public int randomNumberGenerator() {
		return new Random().nextInt(1000)-3; // number between 0-996
	}

}
