package ch02_switch;

public class SwitchDiceExample {

	public static void main(String[] args) {
        int num;
		
		num = (int)(Math.random()*6)+1;//1,2,3,4,5,6 �߿� �ϳ��� �� ���
		System.out.println(num);
		
		switch(num) {//����
		case 1: System.out.println("1���� ���Խ��ϴ�.");
		case 2:	System.out.println("2���� ���Խ��ϴ�.");
		case 3:	System.out.println("3���� ���Խ��ϴ�.");
		case 4:	System.out.println("4���� ���Խ��ϴ�.");
		case 5:	System.out.println("5���� ���Խ��ϴ�.");
		default: System.out.println("6���� ���Խ��ϴ�.");
		}

	}

}