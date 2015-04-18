package package_01;

public class TestMainFraction {

	public static void main(String[] args) {
		
		Fraction fr1 = new Fraction(9, 2);
		Fraction fr2 = new Fraction(1, 2);
		
		FractionOperation operation = new FractionOperation();
		
		System.out.println(operation.mul(fr1, fr2));
	}

}
