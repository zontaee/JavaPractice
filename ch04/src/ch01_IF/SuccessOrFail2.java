package ch01_IF;

import java.util.Scanner;

public class SuccessOrFail2 {

	public static void main(String[] args) {
		//scanner��ü ����
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("������ �Է��ϼ���-������:");
				
				int score = scanner.nextInt();
				//������ ���̸� ��{}����
				/** 
				if(score>=80) {
					System.out.println("�����մϴ�. �հ��Դϴ�.");
				}else {// score < 80
					System.out.println("�ƽ�����. ���հ��Դϴ�.");
				}
				*/
				if(score>=80)
					System.out.println("�����մϴ�. �հ��Դϴ�.");
				else// score < 80
					System.out.println("�ƽ�����. ���հ��Դϴ�.");
				
				//���׿�������� 
				System.out.println( (score>=80)? "�����մϴ�. �հ��Դϴ�." : "�ƽ�����. ���հ��Դϴ�.");
				
				//�ڿ�����
				scanner.close();
	}

}
