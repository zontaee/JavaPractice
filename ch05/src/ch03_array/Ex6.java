package ch03_array;

public class Ex6 {

	public static void main(String[] args) {
		//1���� �迭�� �ִ밪 �ּҰ� ���ϱ�
		int max=0;
		int min=100;
		int[] score = { 76,45,34,89,100,50,90,92};
	  for(int i=0; i<score.length; i++) {
		  if(max>score[i]) {
			  continue;
		  }
		  else
			  max=score[i];
	  }
	  System.out.println("�ְ��� = "+ max);
	  for(int i=0; i<score.length; i++) {
		  if(min<score[i]) {
			  continue;
		  }
		  else
			  min=score[i];
	  }
	  System.out.println("�ּҰ��� = "+ min);
	  
	  max=0;
	  min=100;
	  int sum= 0;
	  double avg= 0 ; 
	  //���� for������ �����ؼ� �ִ밪, �ּҰ� �հ�, ����� ����Ͻÿ�.
	  for(int k : score) {
		  if(max<k) {
			  max = k;
		  }
	  }
	  System.out.println("�ְ��� = "+ max);
	  for(int k : score) {
		  if(min>k) {
			  min = k;
		  }
	  }
	  System.out.println("�ּҰ��� = "+ min);
	  for(int k : score) {
		 sum += k;
	  }
	  System.out.println("������ = "+ sum);
	  System.out.println("����� = "+ sum/score.length);
	  
	}
	
	

	}


