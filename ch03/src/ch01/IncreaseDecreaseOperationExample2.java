package ch01;

public class IncreaseDecreaseOperationExample2 {

	public static void main(String[] args) {
		/* ���� ������ - ����, ++, -- */		
		 int x = 10;
		 int y = 10;
		 int z;
		 
		 //�ܵ� ������ �ƴ� �ٸ������ �Բ� ����Ǵ� ���
		 z=x++;
		 System.out.println(z);// 10
		 System.out.println(x);// 11
		 
		 //���� x=11, z=10;
		 z=++x;
		 System.out.println(z);// 12
		 System.out.println(x);// 12
		 
		 
		 z=y--;// y=10, z=12
		 System.out.println(z);// 10
		 System.out.println(y);// 9
		 
		 //���� y=9, z=10;
		 z=--y;
		 System.out.println(z);// 8
		 System.out.println(y);// 8
		 
		 int family = 50;
		 family++;
		 ++family;
		 System.out.println("�츮�� �ı��� ��� " + ((family++)+1) + "���̴�"); //53��
		 System.out.println(family); //53

}
}