package ch04_array2;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		 //1. id="hong", pwd="1234"
		  // id와 pwd를 scanner로 입력받아서 id와 pwd가 둘다 같으면 "login성공",
		  // 아니면 "1회 실패하였습니다". 출력
		  // 5회 실패하면, "5회 실패하였습니다. 프로그램을 종료 합니다" 출력 후 종료
		Scanner sc1 = new Scanner(System.in);
		
		int cnt=0;
		String a ;
		String b;
		  
	 while(true) {
			   if(cnt==5) {
				   System.out.println(cnt+"회 실패하였습니다. 프로그램을 종료 합니다");
                break;
			   }
			   else {
				   System.out.println("아이디와 패스워드를 입력하세요.");
			    System.out.println("아이디>");
			    a =sc1.next();
			   System.out.println("패스워드>");
			   b =sc1.next();
			   if(a.equals("hong") && b.equals("1234")) {
                System.out.println("로그인 성공");
                break;
			   }
			   else {
				   cnt++;
				   System.out.println(cnt+"회 실패하였습니다. (5회 실패시 종료)");
			}
			}
	}
			   }
			
	}



