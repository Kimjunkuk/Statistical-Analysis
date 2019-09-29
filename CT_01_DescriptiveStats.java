package Chapter03;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class CT_01_DescriptiveStats {//기술 통계량 생성

	//기술 통계는 주로 표본을 요약할 때 사용되며, 일반적으로 확률 이론에 기반해 도출 되지 않는다.
	//반면 추론 통계는 표본으로부터 모집단에 대한 추정을 도출 하는 데 주로 사용된다.
	//이 레시피는 자바를 사용해 작은 표본으로부터 기술 통계량을 도출하는 방법을 보여줄 것이다.
	
	
	// Apache Commons Math 3.6.1 라이브러리 필요
	//http://commons.apache.org/proper/commons-math/download_math.cgi
	//산술 평균과 기하 평균, 분산과 표준 편차, 합계, 곱, 로그 합, 제곱 합, 최솟값, 최댓값, 중앙값, 백분위수 
	//왜도와 첨도
	//1차,2차,3차,4차 모멘트
	//아울러 이라이브러리의 메소드들은 최적화돼 가능한 적은 메모리를 사용한다
	
	public static void main(String[] args){
		double[] values = {32, 39, 14, 98, 45, 44, 45, 34, 89, 67, 0, 15, 0, 56, 88};
		CT_01_DescriptiveStats descStatTest = new CT_01_DescriptiveStats();
		descStatTest.getDescStats(values);
		
	}
	public void getDescStats(double[] values){//1.인수로서 double 데이터 타입의 배열을 취하는 메소드를 생성한다. 이 배열은 기술 통계를 생성하고자 하는 값들을 갖게 된다.
		
		DescriptiveStatistics stats = new DescriptiveStatistics();//2.DescriptiveStatistics 타입의 객체를 생성한다
		
		for( int i = 0; i < values.length; i++) {
		        stats.addValue(values[i]);
		}
		//3.double 타입 배열을 루프로 돌려 모든 값을 DescriptiveStatistics 객체에 추가 한다.
		
		double mean = stats.getMean();
		double std = stats.getStandardDeviation();
		double median = stats.getPercentile(50);
		System.out.println("평균:"+mean + "\t     표준 편차:" + std + "\t 중앙값:" + median);
		//4.Apache Commons Math라이브러리의 DescriptiveStatistics 클래스에는 평균, 표준 편차, 중앙값을 계산해주는 메소드가 있다.
		//이 메소드들을 호출해 values에 들어 이는 데이터에 대한 기술 통계량을 얻는다.
		//마지막으로 메소드를 닫는다.
		
		//**멀티 스레드 환경에서 통계량을 계산하려면 다음과 같이 SynchronizedDescriptiveStatistics 인스턴스를 생성해야 한다.
		// DescriptiveStatistics stats = new SynchronizedDescriptiveStatistics();
	}
}
