package ch9;

public class ByteOverFlowExam {

	public static void main(String[] args) {

        //byte�� ǥ�������� -128~127 ���̸� ����Ŭ����.
		for(int i =-128; i<=1000; i++) {
			System.out.println((byte)i);
		}

	}

}
