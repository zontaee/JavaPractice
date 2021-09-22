package ch02;

public class ch02 {
/*	      1번문제    자바에서 변수에 대한 설명 중 틀린 것은?
			1.변수는 하나의 값만 저장할 수 있다.
			2.변수는 선언 시에 사용한 타입의 값만 저장할 수 있다.
			3.변수는 변수가 선언된 중괄호({}) ㅇ안에서만 사용 가능하다.
			4.변수는 초기값이 저장되지 않은 상태에서 읽을 수 있다. ->정답
			초기화 되지 않은 변수는 읽을 수 없다.

		  2번문제   변수 이름으로 사용 가능한 것을 모두 선택하세요
			modelName
			class
			6hour
			$value
			age
			int
			첫 번째 글자는 문자이거나 ‘$’, ‘_’ 이어야 하고 숫자로 시작할 수 없다.
            영어 대소문자가 구분된다.
            첫 문자는 영어 소문자로 시작하되, 다른 단어가 붙을 경우 첫 문자를 대문자로 한다.
            문자 수 길이 제한은 없다.
            자바 예약어는 사용할 수 없다.

			3.자바의 기본 타입을 적어보세요
			크기/타입	1byte	2byte	      4byte	   8byte
			정수타입	byte	char, short	   int	    long
			실수타입	 	 	               float    double
			논리타입	boolean	 	 	 
			4.아래 코드에서 타입, 변수 이름, 리터럴에 해당하는 것을 적어보세요
			int age;
			age = 10;
			double price = 3.14;
			
			타입: int, double
			변수 이름: age, price
			리터럴: 10, 3.14

			5.자동 타입 변환에 대한 내용이다. 컴파일 에러가 발생하는 것은?
			byte byteValue = 10;
			char charValue = 'A';
			int intValue = byteValue;
			int intValue = charValue;
			short shortValue = charValue; ->답
			double doubleValue = byteValue;
			char형은 short형으로 자동 형변환이 되지 않는다. (강제 형변환은 가능)

			6.강제 타입 변환에 대한 내용이다. 컴파일 에러가 발생하는 것은?
			int intValue = 10;
			char charValue = 'A';
			double doubleValue = 5.7;
			String strValue = "A";
			double var = (double) intValue;
			byte var = (byte) intValue;
			int var = (int) doubleValue;
			char var = (char) strValue; ->답
			String형은 char형으로 형변환 될 수 없다.

			7.변수를 잘못 초기화 한 것은?
			int var1 = 10;
			long var2 = 10000000000L;
			char var3 = ‘’; ->답
			double var4 = 10;
			float var5 = 10;
			char형은 ‘‘로는 초기화 되지 않는다. ‘ ‘로 띄어쓰기가 중간에 들어가야 한다.

			8.연산식에서 타입 변환 내용이다. 컴파일 에러가 생기는 것은?
			byte byteValue = 10;
			float floatValue = 2.5F;
			double doubleValue= = 2.5;
			byte result = byteValue + byteValue; -> 답
			int result = 5 + byteValue;
			float result = 5 + floatValue;
			double result = 5 + doubleValue;
			byte + byte 형의 계산이라도 정수형 계산은 int형으로 반환되기 때문에 강제 형변환을 해줘야 한다.
 */
}
