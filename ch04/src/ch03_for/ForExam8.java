package ch03_for;

public class ForExam8 {

	public static void main(String[] args) {
		  // 초기화 부분이나 증감부분에 ,로 명령문을 나열할수 있음.
		  for(int i=1, y=1; i < 10 ;i++ , System.out.println(y) ) {//
			  System.out.println("hello");
			  //for블럭을 빠져나가는 조건을 블럭내에서 처리{}
			  if(i==10) break;//블럭을 빠져나가는 명령문 break;
			  y++;
		  }
		     System.out.println("종료");
	}

}
