package ch01;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		boolean play = true;
		int i=0;
		while(play) {//true -> false
			i++;//����
			System.out.println("hello");
			if(i==5) play = !play;//�ݺ��� ���������� ���� ���
		}
		
		System.out.println("����");


	}

}
