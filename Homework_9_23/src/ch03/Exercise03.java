package ch03;

public class Exercise03 {

	public static void main(String[] args) {
		int score = 85;
		String result = (!(score>90))? "가":"나"; //삼항 연산자로써 앞에 85>80이 f이나 !부정연산자 때문에 트루가 되서 "가" 출력
		System.out.println(result);
	}

}
