package ch02_priorty;
//�������� �켱����-������ 5, 1�̸� ���� ���� �켱����,10�̸� ���� ���� �켱����
public class ProrityExample {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			Thread thread = new CalcThread("thread"+i);
			System.out.println("������ ������켱����: "+ thread.getPriority());
			if(i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY);//�켱���� ����
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);//�켱���� ����
			}
			thread.start();//������ ����
			System.out.println("������켱����: "+ thread.getPriority());
		}

	}

}
