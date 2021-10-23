package ch16;

public class Ex0101 {

	public static void main(String[] args) {
	MyInter1 m1 = new MyInter1() {

		@Override
		public void me() {
		System.out.println("10+20 =30");
		
			
		}};
		m1.me();
		m1 = ()->System.out.println("10+20 =30");
	}

}
