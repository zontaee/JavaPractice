package ch16;

public class Ex0202 {

	public static void main(String[] args) {
	MyInter2 m2 = new MyInter2() {

		@Override
		public void me2(int x, int y) {
System.out.println(x  + y);
			
		}

};
m2.me2(1, 1);
m2 = (int x ,int y)->System.out.println(x+ x + y);
m2.me2(2, 2);
}
}