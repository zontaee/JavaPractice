package ch04_while;

public class While2 {

	public static void main(String[] args) {
		 int sum=0,i=1;
		    while(i<=10) {
		    	sum+=i;
		    	System.out.println(sum+","+i);
		    	i++;//���� �������� ���� �ݺ� ���� ����ó��
		    }
		    System.out.println("�հ�: "+sum+", i="+i);
	}

}