package ch06.Stock;

import java.util.Scanner;

public class StockApplication {
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
 
            
            switch(selectNo) {
            case 1 : createStock();
                       break;
            case 2 : StockList();
                       break;
            case 3 : entering();
                       break;
            case 4 : release();
                       break;
            case 5 : run =false;
            break;          
            }
            
            
            
            
          
        }
        System.out.println("���α׷� ����");
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
	Stock newStock = new Stock( name, qty);
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
        	System.out.print("�����۹�ȣ : "+StockArray[i].getitem()+" ");
        	System.out.print("�������̸� : "+StockArray[i].getname()+" ");
        	System.out.println("��� : "+ StockArray[i].getqty());
        	 
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
    	for(int i = 0; i < StockArray.length; i++) 
    		if(StockArray[i]!=null) {
    		if(StockArray[i].getitem().equals(item))
    			return StockArray[i];
    	
     }
    	return null;
   }
}
