package ArrayList.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockApplication {
	private static List<Stock> StockArray = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("------------------------------------------");
            System.out.println("1.아이템생성 | 2.아이템목록 |3. 입고 | 4. 출고 |  5.아이템이동 |6.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택> ");
 
            int selectNo = scanner.nextInt();
 
            
            switch(selectNo) {
            case 1 : createStock();
                       break;
            case 2 : StockList();
                       break;
            case 3 : entering();
                       break;
            case 4 : release();
                       break;
            case 5 : transfer();
                       break;
            case 6 : run =false;
            break;          
            }
            
            
            
            
          
        }
        System.out.println("프로그램 종료");
    }
  //아이템이동
    private static void transfer() {
    	 System.out.println("------------------");
    	    System.out.println("아이템이동");
    	    System.out.println("------------------");
    	    System.out.print("이동할 아이템 번호 : ");
            String item1 = scanner.next();
            Stock newStock1 = findStock(item1);
            
            if(newStock1 == null) {                            
        		System.out.println("결과 : 이동할 아이템이 존재하지 않습니다.");
        		
        	} else {
        		System.out.print("이동당할 아이템 번호 : ");
                String item2 = scanner.next();
                Stock newStock2 = findStock(item2);
        		if(newStock2 == null) {
        			System.out.println("결과 : 이동당할 아이템이 존재하지 않습니다.");
        		}
        		else {
        			System.out.print("이동할 수량 입력  :");
            	int qty = scanner.nextInt();
            	newStock1.setqty((newStock1.getqty()-qty));
            	newStock2.setqty((newStock2.getqty()+qty));
            	System.out.println("이동완료");
                }
        	}
        		
		
	}

	//아이템생성하기
    private static void createStock() {
    System.out.println("------------------");
    System.out.println("아이템생성");
    System.out.println("------------------");
  
    System.out.print("아이템이름: ");
	String name = scanner.next();
	System.out.print("현재 수량 : ");
	int qty = scanner.nextInt();
	StockArray.add(new Stock(name,qty));
	System.out.println("결과 : item이 생성되었습니다.");
			
    }
	
    //아이템목록보기
    private static void StockList() {
    	System.out.println("------------------");
        System.out.println("아이템목록");
        System.out.println("------------------");
        for(int i = 0; i <StockArray.size(); i++) {
        	if(StockArray != null) {
        	System.out.println(StockArray.get(i)+" ");
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
    	//아이템번호 먼저 확인후 같으면 수량 입력하게 변경
    	 
         if(newStock == null) {                            
    		System.out.println("결과 : 아이템이 존재하지 않습니다.");
    	} else {
    		System.out.print("입고 수량: ");
        	int qty = scanner.nextInt();
        	
    		newStock.setqty((newStock.getqty()+qty));
    		System.out.println("결과 : 입고가 완료되었습니다.");
    		System.out.println("입고 후 재고 수량 : " + newStock.getqty());   //입고 후 재고 수량
    	
    	}
    }
      //출고하기
    private static void release() {
    	System.out.println("----------");
    	System.out.println("출고");
    	System.out.println("----------");
    	System.out.print("아이템 번호 : ");
    	String item = scanner.next();
    	Stock newStock = findStock(item);
    	//아이템번호 먼저 확인후 같으면 수량 입력하게 변경
    	if(newStock == null) {
    		System.out.println("결과 : 아이템이 없습니다.");
    		
    	} else {
    		System.out.print("출고 수량: ");
        	int qty = scanner.nextInt();
    		if(newStock.getqty()-qty>=0) {                         //기존수량-출고 0보다작으면 else출력        
    		newStock.setqty((newStock.getqty()-qty));
    		System.out.println("결과 : 출고가 완료 되었습니다.");
    		System.out.println("출고 후 재고 수량 : " + newStock.getqty());     //출고 후 재고수량
    	}
    		else {
    			System.out.println("재고가 충분하지 않습니다.");
    			System.out.println("현재 재고 수량 : " + newStock.getqty());     // 현재 재고수량
    		}
    			
    	}
   }
   //Stock 배열에서 아이템번호와 동일한 Stock 아이템번호 객체 찾기
    private static Stock findStock(String item) {
    	for(int i = 0; i < StockArray.size(); i++) 
    		if(StockArray !=null) {
    		if(StockArray.get(i).getitem().equals(item))
    			return StockArray.get(i);
    	
     }
    	return null;
   }
}
