package ch09_Annotation;

public class Service {
@PrintAnnotation
	public void method1() {
	System.out.println("실행내용1");
}
@PrintAnnotation("*")//"-" -> "*"
public void method2() {
	System.out.println("실행내용2");
}
//"-" -> "#", number 15->20
@PrintAnnotation(value="#", number=20 )
public void method3() {
	System.out.println("실행 내용3");
}
}
