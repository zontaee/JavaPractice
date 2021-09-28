package ch03_array;

public class Ex6 {

	public static void main(String[] args) {
		//1차원 배열의 최대값 최소값 구하기
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
	  System.out.println("최고값은 = "+ max);
	  for(int i=0; i<score.length; i++) {
		  if(min<score[i]) {
			  continue;
		  }
		  else
			  min=score[i];
	  }
	  System.out.println("최소값은 = "+ min);
	  
	  max=0;
	  min=100;
	  int sum= 0;
	  double avg= 0 ; 
	  //향상된 for문으로 수정해서 최대값, 최소값 합계, 평균을 출력하시오.
	  for(int k : score) {
		  if(max<k) {
			  max = k;
		  }
	  }
	  System.out.println("최고값은 = "+ max);
	  for(int k : score) {
		  if(min>k) {
			  min = k;
		  }
	  }
	  System.out.println("최소값은 = "+ min);
	  for(int k : score) {
		 sum += k;
	  }
	  System.out.println("총합은 = "+ sum);
	  System.out.println("평균은 = "+ sum/score.length);
	  
	}
	
	

	}


