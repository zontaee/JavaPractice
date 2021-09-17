package ch02;

public class ConditionOpertatorExam {

	public static void main(String[] args) {
	 int x=5;
	 int y=3;
	 
	 int s;
	 if(x>y) s=1;
	 else s=-1;
	 System.out.println(s);
	 //삼항식을 이용한 처리
	 s= x>y ? 1 :-1;
	 System.out.println(s);
	 
	}

}
