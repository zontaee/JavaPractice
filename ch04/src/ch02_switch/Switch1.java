package ch02_switch;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("love의 출력하고싶은 철자번호입력");
		
	      int num = scanner.nextInt();
	      switch(num) {
	      case 1: System.out.print("L");break;
	      case 2: System.out.print("O");break;
	      case 3: System.out.print("V");break;
	      case 4: System.out.print("E");break;
	      default:System.out.println("다시입력");
	      
	      }
	}

}
