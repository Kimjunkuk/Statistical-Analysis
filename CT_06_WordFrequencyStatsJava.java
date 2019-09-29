package Chapter03;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CT_06_WordFrequencyStatsJava {//자바8을 사용해 문자열의 단어 빈도 계산
	
	//주어진 문자열 내의 단어 빈도를 계산하기 위해 Apache Commons Math라이브러리를 사용하지 않는다
	//대신에 기본적으로 제공되는 자바8 라이브러리와 메커니즘을 사용한다.
	
	public static void main(String[] args){
		String str = "Horatio says 'tis but our fantasy, "
				+ "And will not let belief take hold of him "
				+ "Touching this dreaded sight, twice seen of us. "
				+ "Therefore I have entreated him along, 35"
				+ "With us to watch the minutes of this night, "
				+ "That, if again this apparition come, "
				+ "He may approve our eyes and speak to it.";
		
		CT_06_WordFrequencyStatsJava freqTest = new CT_06_WordFrequencyStatsJava();
		freqTest.getFreqStats(str);
	}
	
	public void getFreqStats(String str){//1.문자열 인수를 취하는 메소드를 생성한다. 이문자열에 포함된 단어들의 빈도를 계산할 것이다.
		
		Stream<String> stream = Stream.of(str.toLowerCase().split("\\W+")).parallel();
		//2.주어진 문자열로 부터 Stream을 생성한다. 이 경우에는 문자열을 모두 소문자로 바꾸고 정규 표현식 
		//\W+(white space, 측 공란을 의미)를 기준으로 단어를 식별한다.
		//문자열을 스트림으로 변환하는 프로세스는 병렬로 처리할 수 있다.
		
		Map<String, Long> wordFreq = stream
				.collect(Collectors.groupingBy(String::toString,Collectors.counting()));
		//3.Stream클래스의 collect() 메소드를 사용해 단어와 그 단어의 빈도를 수집한다.
		//수집한 값은 String과 Long타입의 변수를 제네릭으로 갖는 Map객체로 보내진다.
		//String은 단어를 포함하고 Long은 해당 단어의 빈도를 갖는다.
		
		wordFreq.forEach((k,v)->System.out.println(k + "=" + v));
		//4.끝으로 forEach를 사용해 Map에 담긴 내용을 출력한 다음 메소드를 닫는다
	}
}
