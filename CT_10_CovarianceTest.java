package Chapter03;

import org.apache.commons.math3.stat.correlation.Covariance;

public class CT_10_CovarianceTest {//두 데이터셋의 공분산 계산
	public static void main(String[] args){
		double[] x = {43, 21, 25, 42, 57, 59};
		double[] y = {99, 65, 79, 75, 87, 81};
		CT_10_CovarianceTest test = new CT_10_CovarianceTest();
		test.calculateCov(x, y);
	}
	public void calculateCov(double[] x, double[] y){
		double covariance = new Covariance().covariance(x, y, false);//take out false too
		System.out.println(covariance);
	}
}
