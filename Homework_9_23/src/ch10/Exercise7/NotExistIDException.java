package ch10.Exercise7;

public class NotExistIDException extends Exception{
		public NotExistIDException() {}
		public NotExistIDException(String message) {
			super(message);  //<-�� Exception getMessage �޼ҵ� ����
		}
	}

