package ch04;

public class Exercise4 {
	public static void main(String[] args){
		int a;
		int b;

		while(true){
			a = (int) (Math.random()*6 + 1);
			b = (int) (Math.random()*6 + 1);
			System.out.println("("+a+","+b+")");
			if (a + b == 5) {
				break;
			}
				
			
		}
	}
}