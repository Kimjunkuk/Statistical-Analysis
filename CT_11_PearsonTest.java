package Chapter03;

import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;

public class CT_11_PearsonTest {//두 데이터셋의 피어슨 상관계수 계산
	public static void main(String[] args){
		double[] x = {43, 21, 25, 42, 57, 59};
		double[] y = {99, 65, 79, 75, 87, 81};
		CT_11_PearsonTest test = new CT_11_PearsonTest();
		test.calculatePearson(x, y);
	}
	public void calculatePearson(double[] x, double[] y){
		PearsonsCorrelation pCorrelation = new PearsonsCorrelation();
		double cor = pCorrelation.correlation(x, y);//take out false too
		System.out.println(cor);
	}
}
