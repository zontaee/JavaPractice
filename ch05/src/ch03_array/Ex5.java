package ch03_array;

public class Ex5 {

	public static void main(String[] args) {
		double[] scores = { 72.5, 32.4, 48.5, 99.8, 55.4};
		//향상된 for문을 이용하여
		//합과 평균 출력
		double total = 0;
		double avg;
		for(double k : scores) {
		 total += k;
			}
		System.out.println("총합은 = " + (int)(total*10)/(double)10 );
		avg = (total/scores.length); 
		System.out.println("평균은 = " + (int)(total/scores.length*10)/(double)10 );
	    //소수점 표기 상당히 불편하다. 따라서 
		//소수점 자리수 printf("%.표시할소수점 자리수 f" ,값);
		System.out.printf("%.1f %n", total );
		System.out.printf("%.1f", avg);
		
	}

	}


