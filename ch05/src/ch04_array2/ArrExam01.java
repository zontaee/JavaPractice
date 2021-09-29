package ch04_array2;

import java.util.Scanner;

public class ArrExam01 {

	public static void main(String[] args) {
		//성적표 프로그램
		  //스캐너로 값을 입력받기 int[] score = {76,45,34,89,100,50,90,92}; 
		  // int[] scores=new int[8];
		  //입력이 끝나면 합계, 평균, 성적순 출력하기
		  // for문과 향상된 for문으로 출력하기
		  // 1.성적입력 | 2.통계(합/평균)출력| 3. 성적순 출력하기 | 4. 종료
		  //ch04 - 7번 참조.
			 Scanner scanner = new Scanner(System.in);
			 int[] scores=new int[8];
			 boolean run=true;
			 int sum= 0;
			 int temp = 0;
			 while(run) {
		  System.out.println("---------------------------------------");
		  System.out.println("1.성적입력|2.통계(합/평균)출력|3.성적순 출력하기|4. 종료");
		  System.out.println("---------------------------------------");
		  int menu=scanner.nextInt();
		  switch(menu){
		  case 1: 
			     for(int i = 0; i<scores.length; i++) {
			    	 scores[i]=scanner.nextInt();
			     }
			     break;
		  case 2:
			     for( int i : scores) {
			    	 sum += i; 
			     }
			     System.out.println("합은 = " + sum);
			     System.out.println("평균은 = " + sum/(double)scores.length);
			     break;
		  case 3:
			     for(int i = 0 ; i<scores.length; i++ ) {
			    	 for(int j = i+1; j<scores.length; j++) {
			    		 if(scores[i]<scores[j]) {
			    			 temp =  scores[i];
			    			 scores[i]=scores[j];
			    			 scores[j]=temp;
			                  }
			    	     }
			        }
			 	for(int k : scores) {
					System.out.print(k + " ");
			 	}
			     break;
		  case 4: run = !run;
		  System.out.print("종료");
		  }
		  
			}
			 

	}

}
