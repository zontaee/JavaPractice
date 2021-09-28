package ch03_array;
/* 배열 요소들의 타입이 기본타입 */
public class Ex8Sort {

	public static void main(String[] args) {
		//1차원 배열의 오름차순 정령
		int abc  = 0; 
		int[] score = {76,45,34,89,100,50,90,92};//34,45,50,76,89,90,92,100
		for(int i = 0; i<score.length; i++) {
			for(int j = i+1; j<score.length; j++) {
			if(score[i]<score[j]) {
			abc  = score[i];
			score[i] = score[j];
			score[j] = abc;//임시저장된 값을 다시 j에 저장
			}
			
				
		    }
			
		}
		//정렬된 내용 출력
		for(int k : score) {
			System.out.print(k + " ");
	}
	}
}

