package ch06.Stock;

import java.util.Scanner;

public class StockApplication2 {
	private static Stock[] StockArray = new Stock[100];
    private static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("------------------------------------------");
            System.out.println("1.아이템생성 | 2.아이템목록 |3. 입고 | 4. 출고 | 5.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택> ");
 
            int selectNo = scanner.nextInt();
 
            if(selectNo == 1) {
                createStock();
            } else if(selectNo == 2) {
            	StockList();
            } else if(selectNo == 3) {
            	entering();
            } else if(selectNo == 4) {
            	release();
            } else if(selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
 
    //아이템생성하기
    private static void createStock() {
    System.out.println("------------------");
    System.out.println("아이템생성");
    System.out.println("------------------");
    System.out.print("아이템번호 : ");
    String item = scanner.next();
    System.out.print("아이템이름: ");
	String name = scanner.next();
	System.out.print("현재 수량 : ");
	int qty = scanner.nextInt();
	Stock newStock = new Stock( name, qty);
	for(int i = 0; i < StockArray.length; i++) {
		if(StockArray[i] == null) {
			StockArray[i] = newStock;
			System.out.println("결과 : item이 생성되었습니다.");
			break;
		}
	}
  }
 
    //아이템목록보기
    private static void StockList() {
    	System.out.println("------------------");
        System.out.println("아이템목록");
        System.out.println("------------------");
        for(int i = 0; i <StockArray.length; i++) {
        	if(StockArray[i] != null) {
        	System.out.print(StockArray[i].getitem()+" ");
        	System.out.print(StockArray[i].getname()+" ");
        	System.out.println(StockArray[i].getqty());
        	}
        }
       
    }
    //입고하기
    private static void entering() {
    	System.out.println("------------------");
        System.out.println("입고");
        System.out.println("------------------");   
        System.out.print("아이템 번호 : ");
        String item = scanner.next();
        Stock newStock = findStock(item);
    	if(newStock == null) {                            
    		System.out.println("결과 : 아이템이 존재하지 않습니다.");
    	} else {
    		System.out.print("입고 수량: ");
        	int qty = scanner.nextInt();
        	
    		newStock.setqty((newStock.getqty()+qty));
    		System.out.println("결과 : 입고가 완료되었습니다.");
    	}
    }
      //출고하기
    private static void release() {
    	System.out.println("----------");
    	System.out.println("출고");
    	System.out.println("----------");
    	System.out.print("아이템 번호 : ");
    	String item = scanner.next();
    	System.out.print("출고 수량: ");
    	int qty = scanner.nextInt();
    	Stock newStock = findStock(item);
    	if(newStock == null) {
    		System.out.println("결과 : 아이템이 없습니다.");
    	} else {
    		if(newStock.getqty()-qty>=0) {                         //기존수량-출고 0보다작으면 else출력        
    		newStock.setqty((newStock.getqty()-qty));
    		System.out.println("결과 : 출고가 완료 되었습니다.");
    	}
    		else {
    			System.out.println("재고가 충분하지 않습니다.");	
    		}
    			
    	}
   }
   //Stock 배열에서 아이템번호와 동일한 Stock 아이템번호 객체 찾기
    private static Stock findStock(String item) {
    	for(int i = 0; i < StockArray.length; i++) 
    		if(StockArray[i]!=null) {
    		if(StockArray[i].getitem().equals(item))
    			return StockArray[i];
    	
     }
    	return null;
   }
}
