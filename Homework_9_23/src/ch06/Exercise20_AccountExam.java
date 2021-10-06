package ch06;

import java.util.Scanner;

public class Exercise20_AccountExam {
	private static Exercise20_Account[] accountArray = new Exercise20_Account[100];
    private static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("------------------------------------------");
            System.out.println("1.���»��� | 2.���¸�� |3. ���� | 4. ��� | 5.����");
            System.out.println("------------------------------------------");
            System.out.print("����> ");
 
            int selectNo = scanner.nextInt();
 
            if(selectNo == 1) {
                createAccount();
            } else if(selectNo == 2) {
                accountList();
            } else if(selectNo == 3) {
                deposit();
            } else if(selectNo == 4) {
                withdraw();
            } else if(selectNo == 5) {
                run = false;
            }
        }
        System.out.println("���α׷� ����");
    }
 
    //���»����ϱ�
    private static void createAccount() {
    System.out.println("------------------");
    System.out.println("���»���");
    System.out.println("------------------");
    System.out.print("���¹�ȣ : ");
    String ano = scanner.next();
    System.out.print("������ : ");
	String owner = scanner.next();
	System.out.print("�ʱ��Աݾ� : ");
	int balance = scanner.nextInt();
	Exercise20_Account newAccount = new Exercise20_Account(ano, owner, balance);
	for(int i = 0; i < accountArray.length; i++) {
		if(accountArray[i] == null) {
			accountArray[i] = newAccount;
			System.out.println("��� : ���°� �����Ǿ����ϴ�.");
			break;
		}
	}
  }
 
    //���¸�Ϻ���
    private static void accountList() {
    	System.out.println("------------------");
        System.out.println("���¸��");
        System.out.println("------------------");
        for(int i = 0; i <accountArray.length; i++) {
        	if(accountArray[i] != null) {
        	System.out.print(accountArray[i].getAno()+" ");
        	System.out.print(accountArray[i].getOwner()+" ");
        	System.out.println(accountArray[i].getBalance());
        	}
        }
       
    }
    //�����ϱ�
    private static void deposit() {
    	System.out.println("------------------");
        System.out.println("����");
        System.out.println("------------------");   
        System.out.print("���¹�ȣ : ");
        String ano = scanner.next();
        System.out.print("���ݾ� : ");
    	int money = scanner.nextInt();
    	Exercise20_Account newAccount = findAccount(ano);
    	if(ano == null) {
    		System.out.println("��� : ���°� �����ϴ�.");
    	} else {
    		newAccount.setBalance((newAccount.getBalance()+money));
    		System.out.println("��� : ������ �����Ǿ����ϴ�.");
    	}
    }
      //����ϱ�
    private static void withdraw() {
    	System.out.println("----------");
    	System.out.println("���");
    	System.out.println("----------");
    	System.out.print("���¹�ȣ : ");
    	String ano = scanner.next();
    	System.out.print("��ݾ� : ");
    	int money = scanner.nextInt();
    	Exercise20_Account newAccount = findAccount(ano);
    	if(ano == null) {
    		System.out.println("��� : ���°� �����ϴ�.");
    	} else {
    		newAccount.setBalance((newAccount.getBalance()-money));
    		System.out.println("��� : ����� �����Ǿ����ϴ�.");
    	}
   }
   //Account �迭���� ano�� ������ Account ��ü ã��
    private static Exercise20_Account findAccount(String ano) {
    	for(int i = 0; i < accountArray.length; i++) {
    		if(accountArray[i].getAno().equals(ano))
    			return accountArray[i];
    	}
    	return null;
    }
     
}
