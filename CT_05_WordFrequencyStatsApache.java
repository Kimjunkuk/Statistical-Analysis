package Chapter03;

import org.apache.commons.math3.stat.Frequency;

public class CT_05_WordFrequencyStatsApache {//문자열에서 단어 빈도 계산
	
	//이 코드는 다른 코드들과 다르게 문자열을 다루고 문자열 내의 단어 빈도를 계산한다
	//이 작업을 위해서 Apache Commons Math와 자바8을 사용할 수 있다.
	//이번 코드에서는 외부 라이브러리를 이용하고 다음 레시피에서는 동일한 목적을 위해 자바8을 사용한다.
	
	public static void main(String[] args){
		String str = "Horatio says 'tis but our fantasy, "
				+ "And will not let belief take hold of him "
				+ "Touching this dreaded sight, twice seen of us. "
				+ "Therefore I have entreated him along, 35"
				+ "With us to watch the minutes of this night, "
				+ "That, if again this apparition come, "
				+ "He may approve our eyes and speak to it.";
		String[] words = str.toLowerCase().split("\\W+");
		CT_05_WordFrequencyStatsApache freqTest = new CT_05_WordFrequencyStatsApache();
		freqTest.getFreqStats(words);

	}
	public void getFreqStats(String[] words) {
		//1.String 배열을 인수로 취하는 메소드를 생성한다. 이 배열은 하나의 문자열에 있는 모든 단어를 포함한다.
		
		Frequency freq = new Frequency();//2.Frequency 클래스 객체를 생성한다
		
		for( int i = 0; i < words.length; i++) {
			freq.addValue(words[i].trim());
		}
		//3.Frequency객체에 모든 단어를 추가한다.

		for( int i = 0; i < words.length; i++) {
			System.out.println(words[i] + "=" + freq.getCount(words[i]));
		}
		//4.각 단어에 대해 Frequency 클래스의 getCount() 메소드를 사용해 빈도를 계산한다.
		//빈도 계산이 끝나면 메소드를 닫는다.
	}
}
