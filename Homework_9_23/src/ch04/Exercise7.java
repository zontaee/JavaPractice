package ch04;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args){
		boolean run = true;

		int balance = 0;
		int select = 0;

		Scanner scan = new Scanner(System.in);

		while(run){
			System.out.println("---------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("---------------------");
			System.out.print("����> ");
			
			select = scan.nextInt();
			 
	abc : 	switch(select){
			case 1 : 
				System.out.print("���ݾ�> ");
				int in = scan.nextInt();
			    balance = balance + in;
			    break abc;
			case 2 : 
				System.out.print("��ݾ�> ");
				int out = scan.nextInt();
				 balance = balance - out;
				 break abc;
			case 3 : 
				System.out.print("�ܰ�> " + balance);
				 break abc;
			case 4 : 
				run = false;
			
				}
	        System.out.println();
			}
		System.out.println("���α׷� ����");
    }
}