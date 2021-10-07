package ch_5_constructor;

public class UserCar {

	public static void main(String[] args) {
		//Car객체 생성
		//new Car(); 호출
	     Car car = new Car();
	     Car car2 = new Car();
	     
	     System.out.println(car == car2 ? "같은객체" : "다른객체");
	//소스코드로 부터 컴파일된 클래스Car클래스파일로 부터 객체 생성
	}

}
