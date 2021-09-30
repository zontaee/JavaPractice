package ch2;

public class Truck extends Car{
	public String model="Truck";
	@Override
	public void run() {
		System.out.println("트럭이 달립니다");
		super.run();
	}

}
