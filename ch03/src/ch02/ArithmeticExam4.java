package ch02;

import java.util.Scanner;

public class ArithmeticExam4 {

	public static void main(String[] args) {
		int input;
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 정수를 입력하시오:");

		input = scanner.nextInt();
		
		//
		System.out.println("십의자리수:"+(input / 10));//몫
		System.out.println("1의자리수:"+(input % 10)); //나머지


	}

}
