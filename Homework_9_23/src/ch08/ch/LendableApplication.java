package ch08.ch;

import java.util.Scanner;

public class LendableApplication {
	private static SeperateVolume[] LendableArray = new SeperateVolume[100];
    private static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("------------------------------------------");
            System.out.println("1.���� ��� | 2.������� |3. �������� | 4. �����ݳ� | 5.����");
            System.out.println("------------------------------------------");
            System.out.print("����> ");
 
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
        System.out.println("���α׷� ����");
    }
 
    //���������ϱ�
    private static void createLendable() {
    System.out.println("------------------");
    System.out.println("��������");
    System.out.println("------------------");
    System.out.print("������ȣ: ");
   	String requestNo = scanner.next();
    System.out.print("�����̸�: ");
	String title = scanner.next();
	System.out.print("�۰�: ");
	String writer = scanner.next();
	SeperateVolume newLendable = new SeperateVolume( requestNo,title, writer);
	for(int i = 0; i < LendableArray.length; i++) {
		if(LendableArray[i] == null) {
			LendableArray[i] =  newLendable;
			System.out.println("��� : ������ �����Ǿ����ϴ�.");
			break;
		}
	}
  }
 
    //������Ϻ���
    private static void LendableList() {
    	System.out.println("------------------");
        System.out.println("�������");
        System.out.println("------------------");
        for(int i = 0; i <LendableArray.length; i++) {
        	if(LendableArray[i] != null) {
        	System.out.print("������ȣ : "+LendableArray[i].getrequestNo()+" ");
        	System.out.print("�����̸� : "+LendableArray[i].gettitle()+" ");
        	System.out.println("�۰� : "+ LendableArray[i].getwriter());
        	System.out.println(LendableArray[i].toString());
        	}
        }
       
    }
    //�԰��ϱ�
    private static void entering() {
    	System.out.println("------------------");
        System.out.println("����");
        System.out.println("------------------");   
        
        System.out.print("���� ��ȣ : ");
        String number = scanner.next();
        SeperateVolume newLendable = findLendable(number);
        
    	
    	  if(newLendable == null) {                            
    		System.out.println("��� : ������ �������� �ʽ��ϴ�.");
    	} else {
    		if(newLendable.state==newLendable.BORROWED) {
    			System.out.println("==== �������� å ====");
    			System.out.println("������: "+newLendable.name);
    			System.out.println("������: "+newLendable.date);
    		}
    		else {
    		System.out.print("�̸� : ");
            String name = scanner.next();
            System.out.print("��¥ : ");
            String date = scanner.next();
           
            newLendable.checkOut(name, date);
    		}
    	}
    }
      
    private static void release() {
    	System.out.println("----------");
    	System.out.println("�ݳ�");
    	System.out.println("----------");
    	System.out.print(" �ݳ��� ���� ��ȣ : ");
    	String requestNo = scanner.next();
    	SeperateVolume newLendable = findLendable(requestNo);
    	//������ȣ ���� Ȯ���� ������ ���� �Է��ϰ� ����
    	if(newLendable == null) {
    		System.out.println("��� :�������� ���� �����Դϴ�..");
    	} else {
    		if(newLendable.state==newLendable.BORROWED) {
    			newLendable.checkIn();
    		}
    		else {
    			System.out.println("���Ⱑ���� �����Դϴ�.");
    		}
    			
    	}
   }
   //SeperateVolume �迭���� ������ȣ�� ������ SeperateVolume ������ȣ ��ü ã��
    private static SeperateVolume findLendable(String number) {
    	for(int i = 0; i < LendableArray.length; i++) 
    		if(LendableArray[i]!=null) {
    		if(LendableArray[i].getrequestNo().equals(number))
    			return LendableArray[i];
    	
     }
    	return null;
   }
}
