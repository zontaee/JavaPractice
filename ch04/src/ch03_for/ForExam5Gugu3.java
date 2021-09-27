package ch03_for;

import java.util.Scanner;

public class ForExam5Gugu3 {

	public static void main(String[] args) {
		 int i;
		 for(i=2;i<=9;i++) {
			 for(int j=1;j<=9;j++) {
			   System.out.print(i+"*" +j+"="+i*j+"\t");
			 }
			 System.out.println();//한줄 밑으로 내리는 명령문;
		 }
		 System.out.println("i="+i);//? 

	}

}
