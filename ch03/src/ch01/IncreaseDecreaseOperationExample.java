package ch01;

public class IncreaseDecreaseOperationExample {

	public static void main(String[] args) {
		/* 단항 연산자 - 증감, ++, -- */		
		 int x = 10;
		 int y = 10;
		 int z;
		 
		 System.out.println("-----------------");
		 x++;//후위연산
		 System.out.println(x);
		 ++x;//전위연산
		 System.out.println(x);
		 System.out.println("-----------------");
		 y--;
		 System.out.println(y);
		 --y;
		 System.out.println(y);
		 System.out.println("-----------------");
      //단독 연산이 아닌 다른연산과 함께 실행되는 경우
		 z=x++;
		 System.out.println(z); //12
		 System.out.println(x); //13
		 z=++x;
		 System.out.println(z); //14
		 System.out.println(x); //14
		 z=y--;
		 System.out.println(z); //14
		 System.out.println(y); //14
		 z=y--;
		 System.out.println(z); //14
		 System.out.println(y); //14
	}

}
