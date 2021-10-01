package ch2;

public class Shape {
String name = "다각형";
//삼각형 사각형 오각형

}
//shape클래스를 상속받은 도형들 클래스
class Circle extends Shape{
	 String name = "circle"; //다형성
}
class Square extends Shape{
	 String name = "square"; 
}
class Triangle extends Shape{
	 String name = "triangle"; 
}

