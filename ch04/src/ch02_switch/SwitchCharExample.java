package ch02_switch;

public class SwitchCharExample {
	/* �ڹ� 6����  siwth()�� �ȿ� - byte, char, short, int, long ������ �������� �����ϴ� ����ĸ� �ü� ����.*/
	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
		case 'A':
		case 'a':
			 System.out.println("��� ȸ���Դϴ�.");
			 break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		default:
			System.out.println("�մ��Դϴ�.");

	}

}
}