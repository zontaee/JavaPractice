package ch03_array;

public class Ex4 {

	public static void main(String[] args) {
		int [] score = { 1,2,3,4,5,6,7,8,9};
		//����
		int total=0;
		for(int i=0; i<score.length; i++) {
		 total += score[i];	
		}
		System.out.println("������ ������?= "+ total);
		double average = total/(double)score.length;
		System.out.println("������ �����?= "+ average);
		
		//���� for���� ���� ���ϱ�
		for( int k : score) {
			total += k;
		}
		System.out.println("������ ������ 2���?= "+ total);
		
	
	}

	}


