package ch03_array;

public class Ex5 {

	public static void main(String[] args) {
		double[] scores = { 72.5, 32.4, 48.5, 99.8, 55.4};
		//���� for���� �̿��Ͽ�
		//�հ� ��� ���
		double total = 0;
		double avg;
		for(double k : scores) {
		 total += k;
			}
		System.out.println("������ = " + (int)(total*10)/(double)10 );
		avg = (total/scores.length); 
		System.out.println("����� = " + (int)(total/scores.length*10)/(double)10 );
	    //�Ҽ��� ǥ�� ����� �����ϴ�. ���� 
		//�Ҽ��� �ڸ��� printf("%.ǥ���ҼҼ��� �ڸ��� f" ,��);
		System.out.printf("%.1f %n", total );
		System.out.printf("%.1f", avg);
		
	}

	}


