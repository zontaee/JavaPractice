package ch06.Stock;

import java.util.Scanner;

public class StockApplication2 {
	private static Stock[] StockArray = new Stock[100];
    private static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("------------------------------------------");
            System.out.println("1.�����ۻ��� | 2.�����۸�� |3. �԰� | 4. ��� | 5.����");
            System.out.println("------------------------------------------");
            System.out.print("����> ");
 
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
        System.out.println("���α׷� ����");
    }
 
    //�����ۻ����ϱ�
    private static void createStock() {
    System.out.println("------------------");
    System.out.println("�����ۻ���");
    System.out.println("------------------");
    System.out.print("�����۹�ȣ : ");
    String item = scanner.next();
    System.out.print("�������̸�: ");
	String name = scanner.next();
	System.out.print("���� ���� : ");
	int qty = scanner.nextInt();
	Stock newStock = new Stock(item, name, qty);
	for(int i = 0; i < StockArray.length; i++) {
		if(StockArray[i] == null) {
			StockArray[i] = newStock;
			System.out.println("��� : item�� �����Ǿ����ϴ�.");
			break;
		}
	}
  }
 
    //�����۸�Ϻ���
    private static void StockList() {
    	System.out.println("------------------");
        System.out.println("�����۸��");
        System.out.println("------------------");
        for(int i = 0; i <StockArray.length; i++) {
        	if(StockArray[i] != null) {
        	System.out.print(StockArray[i].getitem()+" ");
        	System.out.print(StockArray[i].getname()+" ");
        	System.out.println(StockArray[i].getqty());
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
    	if(newStock == null) {                            
    		System.out.println("��� : �������� �������� �ʽ��ϴ�.");
    	} else {
    		System.out.print("�԰� ����: ");
        	int qty = scanner.nextInt();
        	
    		newStock.setqty((newStock.getqty()+qty));
    		System.out.println("��� : �԰��� �Ϸ�Ǿ����ϴ�.");
    	}
    }
      //����ϱ�
    private static void release() {
    	System.out.println("----------");
    	System.out.println("���");
    	System.out.println("----------");
    	System.out.print("������ ��ȣ : ");
    	String item = scanner.next();
    	System.out.print("��� ����: ");
    	int qty = scanner.nextInt();
    	Stock newStock = findStock(item);
    	if(newStock == null) {
    		System.out.println("��� : �������� �����ϴ�.");
    	} else {
    		if(newStock.getqty()-qty>=0) {                         //��������-��� 0���������� else���        
    		newStock.setqty((newStock.getqty()-qty));
    		System.out.println("��� : ����� �Ϸ� �Ǿ����ϴ�.");
    	}
    		else {
    			System.out.println("����� ������� �ʽ��ϴ�.");	
    		}
    			
    	}
   }
   //Stock �迭���� �����۹�ȣ�� ������ Stock �����۹�ȣ ��ü ã��
    private static Stock findStock(String item) {
    	for(int i = 0; i < StockArray.length; i++) 
    		if(StockArray[i]!=null) {
    		if(StockArray[i].getitem().equals(item))
    			return StockArray[i];
    	
     }
    	return null;
   }
}