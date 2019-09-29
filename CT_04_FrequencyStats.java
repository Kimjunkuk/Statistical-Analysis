package Chapter03;

import org.apache.commons.math3.stat.Frequency;

public class CT_04_FrequencyStats {// 빈도 분포 계산
	
	//Frequency 클래스는 한 묶음의 데이터에서 데이터 인스턴스의 수를 세거나, 데이터 인스턴스의 고유한 수를 세는 메소드를 가지고 있다.
	//Frequency 클래스의 인터페이스는 매우 단순하고, 대부분의 경우 원하는 계산 결과를 얻기 위해 몇 줄의 코드만으로 충분하다.
	//데이터 타입은 string, integer, long, char 모두 지원된다.
	
	//** 자연적인 순서 (Natural ordering)가 누적 빈도의 기본적인 정렬 순서 이지만 생성자에 Comparator를 적용해 오버라이드 할 수 있다. 
	
	public static void main(String[] args){
		double[] values = {32, 39, 14, 98, 45, 44, 45, 34, 89, 67, 0, 15, 0, 56, 88};
		CT_04_FrequencyStats freqTest = new CT_04_FrequencyStats();
		freqTest.getFreqStats(values);

	}
	public void getFreqStats(double[] values){
		//double 타입의 배열을 인수로 취하는 메소드를 생성한다.
		//이 배열에 들어 있는 값들에 대해 빈도 분포를 계산할 것이다.
		
		Frequency freq = new Frequency();//Frequency 클래스의 객체를 생성한다.
		
		for( int i = 0; i < values.length; i++) {
			freq.addValue(values[i]);
		}
		//double 타입 배열에 들어 있는 값들을 이 객체에 추가한다.

		for( int i = 0; i < values.length; i++) {
			System.out.println(freq.getCount(values[i]));
		}
		//배열에 있는 값들에 대한 빈도를 생성한다
	}
}
