package ch01;
/* 참조 변수 선언시 선언만하고 객체 생성을 하지 않으면
 * NullPointExceptionExam 예외가 발생

 */
public class NullPointExceptionExam {

	public static void main(String[] args) {
		//컴파일시는 문법적으로 문제가 없으므로 예외 발생하지 않음.
		int[] intArray = null;//객체 참조 변수 선언만 하고 실제 객체는 생성하지 않음.
		//intArray=new int[10]; //배열 객체 생성
		intArray[0] = 10; //프로그램 실행중 예외 발생 -runtime Exception
		
		
		String str = null;//객체 참조 변수 선언만 하고 실제 객체는 생성하지 않음.
		//str="Hello";//hello 라는 문자열 객체 생성
		System.out.println("총 문자수 :"+str.length());//프로그램 실행 중 예외 발생-runtime Exception
	}

}
