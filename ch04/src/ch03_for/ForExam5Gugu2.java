package ch03_for;

import java.util.Scanner;

public class ForExam5Gugu2 {

	public static void main(String[] args) {
		int i;
		 for(i=1;i<=9;i++) {
			 for(int j=2;j<=9;j++) {
			   System.out.print(j+"*" +i+"="+i*j+"\t");
			 }
			 System.out.println();//���� ������ ������ ��ɹ�;
		 }
		 System.out.println("i="+i);//? 

	}

}
