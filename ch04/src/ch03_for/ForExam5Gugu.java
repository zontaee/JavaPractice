package ch03_for;

import java.util.Scanner;

public class ForExam5Gugu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.println("���ϴ� ������ �Է�");
		 int num = scanner.nextInt();
		 System.out.println("������ "+num+"��");
		 for(int i=1;i<=9;i++) {
			 System.out.print(num+"*" +i+"="+i*num+"\t");
		 }

	}

}
