package ch03;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("�̸�, ���� ,���� , ü�� ,���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		//��ĳ��Ÿ�� ���� ���� �� ��ü ����
		String name = scanner.next();
		System.out.println("�̸���" + name + ",");
		
		String city = scanner.next();
		System.out.println("���ô�" + city + ",");
		
		int age = scanner.nextInt();
		System.out.println("���̴�" + age + ",");
		
		double weight = scanner.nextDouble();
		System.out.println("ü����" + weight + ",");
		
		Boolean single = scanner.nextBoolean();
		System.out.println("���ſ���" +  single);
		
		scanner.close();




		

	}

}
