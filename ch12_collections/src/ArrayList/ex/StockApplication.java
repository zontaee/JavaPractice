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
            System.out.println("1.�����ۻ��� | 2.�����۸�� |3. �԰� | 4. ��� |  5.�������̵� |6.����");
            System.out.println("------------------------------------------");
            System.out.print("����> ");
 
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
        System.out.println("���α׷� ����");
    }
  //�������̵�
    private static void transfer() {
    	 System.out.println("------------------");
    	    System.out.println("�������̵�");
    	    System.out.println("------------------");
    	    System.out.print("�̵��� ������ ��ȣ : ");
            String item1 = scanner.next();
            Stock newStock1 = findStock(item1);
            
            if(newStock1 == null) {                            
        		System.out.println("��� : �̵��� �������� �������� �ʽ��ϴ�.");
        		
        	} else {
        		System.out.print("�̵����� ������ ��ȣ : ");
                String item2 = scanner.next();
                Stock newStock2 = findStock(item2);
        		if(newStock2 == null) {
        			System.out.println("��� : �̵����� �������� �������� �ʽ��ϴ�.");
        		}
        		else {
        			System.out.print("�̵��� ���� �Է�  :");
            	int qty = scanner.nextInt();
            	newStock1.setqty((newStock1.getqty()-qty));
            	newStock2.setqty((newStock2.getqty()+qty));
            	System.out.println("�̵��Ϸ�");
                }
        	}
        		
		
	}

	//�����ۻ����ϱ�
    private static void createStock() {
    System.out.println("------------------");
    System.out.println("�����ۻ���");
    System.out.println("------------------");
  
    System.out.print("�������̸�: ");
	String name = scanner.next();
	System.out.print("���� ���� : ");
	int qty = scanner.nextInt();
	StockArray.add(new Stock(name,qty));
	System.out.println("��� : item�� �����Ǿ����ϴ�.");
			
    }
	
    //�����۸�Ϻ���
    private static void StockList() {
    	System.out.println("------------------");
        System.out.println("�����۸��");
        System.out.println("------------------");
        for(int i = 0; i <StockArray.size(); i++) {
        	if(StockArray != null) {
        	System.out.println(StockArray.get(i)+" ");
      	  }
        }
       
    }
    //�԰��ϱ�
    private static void entering() {
    	System.out.println("------------------");
        System.out.println("�԰�");
        System.out.println("------------------");   
        System.out.print("������ ��ȣ : ");
        String item = scanner.next();
        Stock newStock = findStock(item);
    	//�����۹�ȣ ���� Ȯ���� ������ ���� �Է��ϰ� ����
    	 
         if(newStock == null) {                            
    		System.out.println("��� : �������� �������� �ʽ��ϴ�.");
    	} else {
    		System.out.print("�԰� ����: ");
        	int qty = scanner.nextInt();
        	
    		newStock.setqty((newStock.getqty()+qty));
    		System.out.println("��� : �԰� �Ϸ�Ǿ����ϴ�.");
    		System.out.println("�԰� �� ��� ���� : " + newStock.getqty());   //�԰� �� ��� ����
    	
    	}
    }
      //����ϱ�
    private static void release() {
    	System.out.println("----------");
    	System.out.println("���");
    	System.out.println("----------");
    	System.out.print("������ ��ȣ : ");
    	String item = scanner.next();
    	Stock newStock = findStock(item);
    	//�����۹�ȣ ���� Ȯ���� ������ ���� �Է��ϰ� ����
    	if(newStock == null) {
    		System.out.println("��� : �������� �����ϴ�.");
    		
    	} else {
    		System.out.print("��� ����: ");
        	int qty = scanner.nextInt();
    		if(newStock.getqty()-qty>=0) {                         //��������-��� 0���������� else���        
    		newStock.setqty((newStock.getqty()-qty));
    		System.out.println("��� : ��� �Ϸ� �Ǿ����ϴ�.");
    		System.out.println("��� �� ��� ���� : " + newStock.getqty());     //��� �� ������
    	}
    		else {
    			System.out.println("��� ������� �ʽ��ϴ�.");
    			System.out.println("���� ��� ���� : " + newStock.getqty());     // ���� ������
    		}
    			
    	}
   }
   //Stock �迭���� �����۹�ȣ�� ������ Stock �����۹�ȣ ��ü ã��
    private static Stock findStock(String item) {
    	for(int i = 0; i < StockArray.size(); i++) 
    		if(StockArray !=null) {
    		if(StockArray.get(i).getitem().equals(item))
    			return StockArray.get(i);
    	
     }
    	return null;
   }
}
