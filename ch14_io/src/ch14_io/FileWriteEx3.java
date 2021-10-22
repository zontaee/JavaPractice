package ch14_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//���ڴ���(2byte)�� ���� �����ϴ� ��Ʈ����ü ����
		FileWriter fout=null;
		int c;//
		try {
			fout = new FileWriter("c:\\temp\\ex1.txt");
			while(true) {
				String line = scanner.nextLine();//�� �� ������ �Է¹ޱ�
				if(line.length()==0) break;//�����Է¾��� EnterŰ ġ�� ����������
				fout.write(line,0,line.length());//write(���ڿ�,����index,���ڿ�����);
				fout.write("\r\n",0,2);//����ڿ� ĳ���� �����߰� <-���ڵ� �ٽú���
			}
			//�ڿ�����
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//�ڿ�����
		scanner.close();
		FileReader fin=null;
		try {
		    fin = new FileReader("c:\\\\temp\\\\ex1.txt");//���丮\���ϸ�
		    int d;//���� ���ھ� ��� �����ϴ� ����
		    while((d=fin.read()) !=-1) {//read()�Լ� ���ھ� �о intŸ������ ���ϸ޼ҵ�, ����Ÿ�� ������ -1�� ����
		    	System.out.print((char)d);//���ڷ� ����ȯ �� ���
		    }
		    //�ڿ�����
		    fin.close();
		}catch(Exception e) {
			System.out.println("����� ����");
		}
	}
}