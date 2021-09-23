package ch02;

public class BitwiserOperationExam01 {

	public static void main(String[] args) {
		// << 왼쪽 shift연산 후 오른쪽 공백은 0으로 채움.
		byte a =5;
		byte b =(byte)(a<<2);//byte,short,char는 연산시 int로 변환 후 연산에 참여함.
		
		//오른쪽 shift(>>)는 최상위 비트를 채움.
		//int타입의 값은 양수이면 최상위 비트가 0,
		//음수이면 최상위 비트가 1임.
	    System.out.println(b);
	     a =20;
		 b =(byte)(a<<2);//byte,short,char는 연산시 int로 변환 후 연산에 참여함.
		
	    System.out.println(b);
	    
	    byte c = (byte)0xf8; // -8
	    byte d = (byte)(c>>2); // -2
	    System.out.println(c);//shift이전의 값
	    System.out.println(d);//shift이후의 값
		
	    //오른쪽 shift(>>>) 3개짜리는 연산시 왼쪽에 무조건 0으로 채움.
	    
	    byte e = 20;
	    byte f = (byte)(e>>>2); //5
	    System.out.println(f);
	    

	}

}
