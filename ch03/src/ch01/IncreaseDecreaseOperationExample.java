package ch01;

public class IncreaseDecreaseOperationExample {

	public static void main(String[] args) {
		/* ���� ������ - ����, ++, -- */		
		 int x = 10;
		 int y = 10;
		 int z;
		 
		 System.out.println("-----------------");
		 x++;//��������
		 System.out.println(x);
		 ++x;//��������
		 System.out.println(x);
		 System.out.println("-----------------");
		 y--;
		 System.out.println(y);
		 --y;
		 System.out.println(y);
		 System.out.println("-----------------");
      //�ܵ� ������ �ƴ� �ٸ������ �Բ� ����Ǵ� ���
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
