package ch03;

public class Exercise02 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); //11 + 20 = 31이 나올것이다.
		System.out.println(z);
	}

}
