package ch16._3;

public class Ex04 {
	public static void main(String[] args) {
		MyFunctionalInterface fi
		= (MyFunctionalInterface) new MyFunctionalInterface1() {
			@Override
			public int method(int x, int y) {
				return sum(x,y);//�޼ҵ� ȣ��
			}
		};
		//ȣ��
		System.out.println(fi.method(10, 20));
		
		//���ٽ�-�Լ�ȣ�� ��� ����
		fi = (x,y) -> sum(x,y);
		System.out.println(fi.method(10, 20));
	}
	
 public static int sum(int x, int y) {
	 return x+y;
 }

}