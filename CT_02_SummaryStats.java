package Chapter03;

import org.apache.commons.math3.stat.descriptive.SummaryStatistics;

public class CT_02_SummaryStats {//요약 통계량 생성
	
	// SummaryStatistics 클래스를 사용해 데이터에 대한 요약 통계를 생성할 수 있다.
	//이 클래스 DescriptiveStatistics 클래스와 레시피가 비슷하지만, 주요 차이점은 
	//SummaryStatistics 클래스는 데이터를 메모리에 저장하지 않는다는 것이다.
	
	public static void main(String[] args){
		double[] values = {32, 39, 14, 98, 45, 44, 45, 34, 89, 67, 0, 15, 0, 56, 88};
		CT_02_SummaryStats summaryStatTest = new CT_02_SummaryStats();
		summaryStatTest.getSummaryStats(values);
	}
	public void getSummaryStats(double[] values){//1.이전 레시피와 똑같이 double 데이터 타입의 배열을 인수로 취하는 메소드를 생성한다.
		
		SummaryStatistics stats = new SummaryStatistics(); //2.SummaryStatistics 클래스의 객체를 생성한다
		
		for( int i = 0; i < values.length; i++) {
		        stats.addValue(values[i]);
		}//3.SummaryStatistics 클래스 객체에 모든 값을 추가한다
		
		double mean = stats.getMean();
		double std = stats.getStandardDeviation();
		System.out.println("요약 통계 평균: "+mean + "\t 요약 통계 표준 편차 : " + std);
		//끝으로 SummaryStatistics클래스에 있는 메소드를 사용해 values에 대한 요약 통계를 생성한다. 마지막에 메소드를 닫아준다
	}
}
