package ch03_array;

public class Ex4 {

	public static void main(String[] args) {
		int [] score = { 1,2,3,4,5,6,7,8,9};
		//총점
		int total=0;
		for(int i=0; i<score.length; i++) {
		 total += score[i];	
		}
		System.out.println("점수의 총점은?= "+ total);
		double average = total/(double)score.length;
		System.out.println("점수의 평균은?= "+ average);
		
		//향상된 for으로 총점 구하기
		for( int k : score) {
			total += k;
		}
		System.out.println("점수의 총점의 2배는?= "+ total);
		
	
	}

	}


