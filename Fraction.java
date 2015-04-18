package package_01;

import nedis.study.interfaces.t2.core.FractionNumber;

public class Fraction implements FractionNumber {

	private int dividend;
	private int divisor;

	public Fraction() {
		this.dividend = 0;
		this.divisor = 1;
	}

	public Fraction(int pDividend, int pDivisor)
			throws IllegalArgumentException {
		this.dividend = pDividend;
		setDivisor(pDivisor);
	}

	@Override
	public String toString() {

		String res;

		Integer c = (int) dividend / divisor;

		if (dividend % divisor == 0)
			res = c.toString();
		else if (c > 0) {
			fractAbb(dividend, divisor);
			res = c + "(" + (dividend - (divisor * c)) + "/" + divisor + ")";
		} else {
			fractAbb(dividend, divisor);
			res = dividend + "/" + divisor;
		}
		return res;
	}

	public int getDividend() {
		return this.dividend;
		// return dividend; //как правильно?
	}

	public int getDivisor() {
		return this.divisor;
	}

	public void setDividend(int arg) {
		this.dividend = arg;
	}

	public void setDivisor(int arg) throws IllegalArgumentException {
		if (arg == 0)
			throw new IllegalArgumentException("Divide by zero");
		this.divisor = arg;
	}

	public double value() {
		return dividend / divisor;
	}

	public void fractAbb(int arg1, int arg2) {

		for (int i = 2; i <= arg1; i++) {
			if (arg1 % i == 0 && arg2 % i == 0) {
				arg1 = arg1 / i;
				arg2 = arg2 / i;			
			}
		}

	}
}
