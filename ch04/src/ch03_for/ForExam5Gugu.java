package ch03_for;

import java.util.Scanner;

public class ForExam5Gugu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.println("원하는 구구단 입력");
		 int num = scanner.nextInt();
		 System.out.println("구구단 "+num+"은");
		 for(int i=1;i<=9;i++) {
			 System.out.print(num+"*" +i+"="+i*num+"\t");
		 }

	}

}
