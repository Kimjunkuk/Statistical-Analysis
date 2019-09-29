package Chapter03;

import org.apache.commons.math3.stat.inference.TestUtils;

public class CT_13_ChiSquareTest {//카이 제곱 테스트
	public static void main(String[] args){
		long[] observed = {43, 21, 25, 42, 57, 59};
		double[] expected = {99, 65, 79, 75, 87, 81};
		CT_13_ChiSquareTest test = new CT_13_ChiSquareTest();
		test.getChiSquare(observed, expected);
	}
	public void getChiSquare(long[] observed, double[] expected){
		System.out.println(TestUtils.chiSquare(expected, observed));//t statistics
		System.out.println(TestUtils.chiSquareTest(expected, observed));//p value
		System.out.println(TestUtils.chiSquareTest(expected, observed, 0.05));
	}
}
