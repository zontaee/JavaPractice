package ch03_array;
/* �迭 ��ҵ��� Ÿ���� �⺻Ÿ�� */
public class Ex8Sort {

	public static void main(String[] args) {
		//1���� �迭�� �������� ����
		int abc  = 0; 
		int[] score = {76,45,34,89,100,50,90,92};//34,45,50,76,89,90,92,100
		for(int i = 0; i<score.length; i++) {
			for(int j = i+1; j<score.length; j++) {
			if(score[i]<score[j]) {
			abc  = score[i];
			score[i] = score[j];
			score[j] = abc;//�ӽ������ ���� �ٽ� j�� ����
			}
			
				
		    }
			
		}
		//���ĵ� ���� ���
		for(int k : score) {
			System.out.print(k + " ");
	}
	}
}

