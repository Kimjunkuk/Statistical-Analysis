package Chapter03;

import org.apache.commons.math3.stat.regression.SimpleRegression;

public class CT_07_RegressionTest {//단순 회귀
	
	//SimpleRegresstion 클래스는 하나의 독립 변수 x를 갖는 초소 자승 회귀(OLS, Ordinary Least squares regression)를 지원한다.
	//y=intercept+slope*x, 여기서 slope는 회귀선의 기울기이며, 선택적 계수인 intercept는 y축의 절편이다. 
	//이 클래스는 절편에 대한 표준 오차(Standard error)도 제공한다.
	//관측치의(x,y)쌍은 한 번에 하나씩 모델에 추가되거나 또는 2차원 배열로 제공될 수 있다.
	//이 레시피에서는 데이터 포인트를 한 번에 하나씩 추가한다
	
	//관측치는 메모리에 저장되지 않기 때문에 모델에 추가할 수 있는 관측치 수는 제한이 없다.
	
	public static void main(String[] args){
		double[][] data = { { 1, 3 }, {2, 5 }, {3, 7 }, {4, 14 }, {5, 11 }};
		CT_07_RegressionTest test = new CT_07_RegressionTest();
		test.calculateRegression(data);
	}
	public void calculateRegression(double[][] data){//1.단순 회귀를 계산하기 위해 double데이터 타입의 2차원 배열을 인수로 취하는 메소드를 생성한다. 배열은 (x,y)쌍의 값을 나타 낸다.
		
		SimpleRegression regression = new SimpleRegression();
		regression.addData(data);
		//2.SimpleRegression 객체를 생성한 후에 데이터를 추가한다
		//**절편이 없거나 계산에서 절편을 제거하길 원한다면 다음과 같이 다른 생성자를 사용해 Simple Regression객체를 생성해야 한다. 
		//SimpleRegression regression = new SimpleRegression(false);
		
		System.out.println(regression.getIntercept());
		System.out.println(regression.getSlope());
		System.out.println(regression.getSlopeStdErr());
		//3.절편,기울기,절편의 표준 오차를 계산한다. 마지막으로 메소드를 닫는다.
	}
}
