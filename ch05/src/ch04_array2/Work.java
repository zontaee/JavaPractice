package ch04_array2;

import java.util.Scanner;

/* vctor@naver.com
 * 과제 제출기한 10/4일(월) 23:59분 까지
 * 스캐너로 입력값 입력받기 성별, 나이, 키, 몸무게
 * 반복처리 가능하게 만들고 
 * 계속 여부 출력후 yes/no값을 받아서 종료하도록 수정하기.
 *  https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=kmovie97&logNo=150186681215
 * */

public class Work {

	public static void main(String[] args) {
		// 제지방량 구하기
				final double ST1 = 1.10;
				final double ST2 = 128;
                boolean run = true;
                String quesion;
                Scanner sc = new Scanner(System.in);
                while(run){
				System.out.println("성별(남,여)을 입력하시오.");
			    String sex = sc.next();
			    System.out.println("나이을 입력하시오.");
			    int age = sc.nextInt();
			    System.out.println("몸무게을 입력하시오.");
				int weight = sc.nextInt();
				System.out.println("키를 입력하시오.");
				int height = sc.nextInt();
				//제지방량
				double result = ST1 * weight - ST2 * 
						        ((weight * weight) /(double)(height * height)); 

				System.out.println(result);

				// 체지방량 구하기
				double result2 = weight - result;

				System.out.println(result2);

				// 체지방률 구하기 = 체지방량*100/체중
				final double ST3 = 100;

				double result3 = result2 * ST3 / weight;

				System.out.println(result3);
				
				System.out.println("성별 = " + sex +", 나이 = " + age + "세, 몸무게 = " + weight + "kg, 키 = " + height + "cm, 의");
				System.out.printf("제지방량 = %.2f %n"  , result);
				System.out.printf("체지방량 = %.2f %n" ,  result2);
				System.out.printf("체지방률 = %.2f %n"  , result3);
				System.out.println("==========================================");
				System.out.println("게속 출력하시겠습니까?(yes or no)");
				quesion = sc.next();
				if(quesion.equals("no")){
					run = false;
				}
				System.out.println("프로그램 종료합니다. 감사합니다");
	}
	}
}
