package package_01;

import nedis.study.interfaces.t2.core.FractionNumber;
import nedis.study.interfaces.t2.core.FractionNumberOperation;

public class FractionOperation implements FractionNumberOperation {

	public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
		int divident;
		int divisor;

		try {
			divident = a.getDividend() * b.getDivisor() + b.getDividend()
					* a.getDivisor();
		} catch (NullPointerException npe) {
			throw npe;
		}

		try {
			divisor = a.getDivisor() * b.getDivisor();
		} catch (NullPointerException npe) {
			throw npe;
		}

		return new Fraction(divident, divisor);
	}

	public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException {
		int divident;
		int divisor;

		try {
			divident = a.getDividend() * b.getDivisor();
		} catch (NullPointerException npe) {
			throw npe;
		}

		try {
			divisor = a.getDivisor() * b.getDividend();
		} catch (NullPointerException npe) {
			throw npe;
		}

		return new Fraction(divident, divisor);
	}

	public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {

		int divident;
		int divisor;

		try {
			divident = a.getDividend() * b.getDividend();
		} catch (NullPointerException npe) {
			throw npe;
		}

		try {
			divisor = a.getDivisor() * b.getDivisor();
		} catch (NullPointerException npe) {
			throw npe;
		}

		return new Fraction(divident, divisor);
	}

	public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {

		int divident;
		int divisor;

		try {
			divident = a.getDividend() * b.getDivisor() - b.getDividend()
					* a.getDivisor();
		} catch (NullPointerException npe) {
			throw npe;
		}

		try {
			divisor = a.getDivisor() * b.getDivisor();
		} catch (NullPointerException npe) {
			throw npe;
		}

		return new Fraction(divident, divisor);
	}

	
}
