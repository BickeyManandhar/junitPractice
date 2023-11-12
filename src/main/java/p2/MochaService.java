package p2;

public class MochaService {
	
	MathUtil mathUtil = new MathUtil();
	
	public int calc(int input) {
		if(input<0) {
			throw new RuntimeException("Number cannot be negative.");
		}
		else {
			int rand = mathUtil.randomNumberGenerator();
			rand=rand+10+(input*input);
			return rand;
		}
	}

}
