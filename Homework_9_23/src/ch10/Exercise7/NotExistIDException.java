package ch10.Exercise7;

public class NotExistIDException extends Exception{
		public NotExistIDException() {}
		public NotExistIDException(String message) {
			super(message);  //<-왜 Exception getMessage 메소드 실행
		}
	}

