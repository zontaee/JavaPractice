package ch07_staticVsnotStatic;

public class Ex11 {

	public static void main(String[] args) {
		//크래스명.메소드()
		  C3.method2();
		  
		  //객체 생성
		  C3 c=new C3();
		  //참조변수.메소드
		  c.method1();
		  //참조변수.메소드
		  c.method2();

	}

}
class C3{
	void method1() {//non-static멤버
		System.out.println("난 인스턴스 메소드");
	}
	static void method2() {//statick멤버
		System.out.println("난 static 메소드");
	}
}