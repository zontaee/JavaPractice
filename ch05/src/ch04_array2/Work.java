package ch04_array2;

import java.util.Scanner;

/* vctor@naver.com
 * ���� ������� 10/4��(��) 23:59�� ����
 * ��ĳ�ʷ� �Է°� �Է¹ޱ� ����, ����, Ű, ������
 * �ݺ�ó�� �����ϰ� ����� 
 * ��� ���� ����� yes/no���� �޾Ƽ� �����ϵ��� �����ϱ�.
 *  https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=kmovie97&logNo=150186681215
 * */

public class Work {

	public static void main(String[] args) {
		// �����淮 ���ϱ�
				final double ST1 = 1.10;
				final double ST2 = 128;
                boolean run = true;
                String quesion;
                Scanner sc = new Scanner(System.in);
                while(run){
				System.out.println("����(��,��)�� �Է��Ͻÿ�.");
			    String sex = sc.next();
			    System.out.println("������ �Է��Ͻÿ�.");
			    int age = sc.nextInt();
			    System.out.println("�������� �Է��Ͻÿ�.");
				int weight = sc.nextInt();
				System.out.println("Ű�� �Է��Ͻÿ�.");
				int height = sc.nextInt();
				//�����淮
				double result = ST1 * weight - ST2 * 
						        ((weight * weight) /(double)(height * height)); 

				System.out.println(result);

				// ü���淮 ���ϱ�
				double result2 = weight - result;

				System.out.println(result2);

				// ü����� ���ϱ� = ü���淮*100/ü��
				final double ST3 = 100;

				double result3 = result2 * ST3 / weight;

				System.out.println(result3);
				
				System.out.println("���� = " + sex +", ���� = " + age + "��, ������ = " + weight + "kg, Ű = " + height + "cm, ��");
				System.out.printf("�����淮 = %.2f %n"  , result);
				System.out.printf("ü���淮 = %.2f %n" ,  result2);
				System.out.printf("ü����� = %.2f %n"  , result3);
				System.out.println("==========================================");
				System.out.println("�Լ� ����Ͻðڽ��ϱ�?(yes or no)");
				quesion = sc.next();
				if(quesion.equals("no")){
					run = false;
				}
				System.out.println("���α׷� �����մϴ�. �����մϴ�");
	}
	}
}
