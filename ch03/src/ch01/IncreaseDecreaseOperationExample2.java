package ch01;

public class IncreaseDecreaseOperationExample2 {

	public static void main(String[] args) {
		/* 단항 연산자 - 증감, ++, -- */		
		 int x = 10;
		 int y = 10;
		 int z;
		 
		 //단독 연산이 아닌 다른연산과 함께 실행되는 경우
		 z=x++;
		 System.out.println(z);// 10
		 System.out.println(x);// 11
		 
		 //현재 x=11, z=10;
		 z=++x;
		 System.out.println(z);// 12
		 System.out.println(x);// 12
		 
		 
		 z=y--;// y=10, z=12
		 System.out.println(z);// 10
		 System.out.println(y);// 9
		 
		 //현재 y=9, z=10;
		 z=--y;
		 System.out.println(z);// 8
		 System.out.println(y);// 8
		 
		 int family = 50;
		 family++;
		 ++family;
		 System.out.println("우리집 식구는 모두 " + ((family++)+1) + "명이다"); //53명
		 System.out.println(family); //53

}
}