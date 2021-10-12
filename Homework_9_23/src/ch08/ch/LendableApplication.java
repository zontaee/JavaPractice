package ch08.ch;

import java.util.Scanner;

public class LendableApplication {
	private static SeperateVolume[] LendableArray = new SeperateVolume[100];
    private static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("------------------------------------------");
            System.out.println("1.도서 등록 | 2.도서목록 |3. 도서대출 | 4. 도서반납 | 5.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택> ");
 
            int selectNo = scanner.nextInt();
 
            
            switch(selectNo) {
            case 1 : createLendable();
                       break;
            case 2 : LendableList();
                       break;
            case 3 : entering();
                       break;
            case 4 : release();
                       break;
            case 5 : run =false;
            break;          
            }
            
            
            
            
          
        }
        System.out.println("프로그램 종료");
    }
 
    //도서생성하기
    private static void createLendable() {
    System.out.println("------------------");
    System.out.println("도서생성");
    System.out.println("------------------");
    System.out.print("도서번호: ");
   	String requestNo = scanner.next();
    System.out.print("도서이름: ");
	String title = scanner.next();
	System.out.print("작가: ");
	String writer = scanner.next();
	SeperateVolume newLendable = new SeperateVolume( requestNo,title, writer);
	for(int i = 0; i < LendableArray.length; i++) {
		if(LendableArray[i] == null) {
			LendableArray[i] =  newLendable;
			System.out.println("결과 : 도서가 생성되었습니다.");
			break;
		}
	}
  }
 
    //도서목록보기
    private static void LendableList() {
    	System.out.println("------------------");
        System.out.println("도서목록");
        System.out.println("------------------");
        for(int i = 0; i <LendableArray.length; i++) {
        	if(LendableArray[i] != null) {
        	System.out.print("도서번호 : "+LendableArray[i].getrequestNo()+" ");
        	System.out.print("도서이름 : "+LendableArray[i].gettitle()+" ");
        	System.out.println("작가 : "+ LendableArray[i].getwriter());
        	System.out.println(LendableArray[i].toString());
        	}
        }
       
    }
    //입고하기
    private static void entering() {
    	System.out.println("------------------");
        System.out.println("대출");
        System.out.println("------------------");   
        
        System.out.print("도서 번호 : ");
        String number = scanner.next();
        SeperateVolume newLendable = findLendable(number);
        
    	
    	  if(newLendable == null) {                            
    		System.out.println("결과 : 도서가 존재하지 않습니다.");
    	} else {
    		if(newLendable.state==newLendable.BORROWED) {
    			System.out.println("==== 대출중인 책 ====");
    			System.out.println("대출자: "+newLendable.name);
    			System.out.println("대출일: "+newLendable.date);
    		}
    		else {
    		System.out.print("이름 : ");
            String name = scanner.next();
            System.out.print("날짜 : ");
            String date = scanner.next();
           
            newLendable.checkOut(name, date);
    		}
    	}
    }
      
    private static void release() {
    	System.out.println("----------");
    	System.out.println("반납");
    	System.out.println("----------");
    	System.out.print(" 반납할 도서 번호 : ");
    	String requestNo = scanner.next();
    	SeperateVolume newLendable = findLendable(requestNo);
    	//도서번호 먼저 확인후 같으면 수량 입력하게 변경
    	if(newLendable == null) {
    		System.out.println("결과 :존재하지 않은 도서입니다..");
    	} else {
    		if(newLendable.state==newLendable.BORROWED) {
    			newLendable.checkIn();
    		}
    		else {
    			System.out.println("대출가능한 도서입니다.");
    		}
    			
    	}
   }
   //SeperateVolume 배열에서 도서번호와 동일한 SeperateVolume 도서번호 객체 찾기
    private static SeperateVolume findLendable(String number) {
    	for(int i = 0; i < LendableArray.length; i++) 
    		if(LendableArray[i]!=null) {
    		if(LendableArray[i].getrequestNo().equals(number))
    			return LendableArray[i];
    	
     }
    	return null;
   }
}
