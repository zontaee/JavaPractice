package ch02;

public class BitwiserOperationExam01 {

	public static void main(String[] args) {
		// << ���� shift���� �� ������ ������ 0���� ä��.
		byte a =5;
		byte b =(byte)(a<<2);//byte,short,char�� ����� int�� ��ȯ �� ���꿡 ������.
		
		//������ shift(>>)�� �ֻ��� ��Ʈ�� ä��.
		//intŸ���� ���� ����̸� �ֻ��� ��Ʈ�� 0,
		//�����̸� �ֻ��� ��Ʈ�� 1��.
	    System.out.println(b);
	     a =20;
		 b =(byte)(a<<2);//byte,short,char�� ����� int�� ��ȯ �� ���꿡 ������.
		
	    System.out.println(b);
	    
	    byte c = (byte)0xf8; // -8
	    byte d = (byte)(c>>2); // -2
	    System.out.println(c);//shift������ ��
	    System.out.println(d);//shift������ ��
		
	    //������ shift(>>>) 3��¥���� ����� ���ʿ� ������ 0���� ä��.
	    
	    byte e = 20;
	    byte f = (byte)(e>>>2); //5
	    System.out.println(f);
	    

	}

}
