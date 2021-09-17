package ch01;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		boolean play = true;
		int i=0;
		while(play) {//true -> false
			i++;//증가
			System.out.println("hello");
			if(i==5) play = !play;//반복문 빠져나가는 조건 사용
		}
		
		System.out.println("종료");


	}

}
