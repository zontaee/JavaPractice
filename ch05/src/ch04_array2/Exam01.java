package ch04_array2;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		 //1. id="hong", pwd="1234"
		  // id�� pwd�� scanner�� �Է¹޾Ƽ� id�� pwd�� �Ѵ� ������ "login����",
		  // �ƴϸ� "1ȸ �����Ͽ����ϴ�". ���
		  // 5ȸ �����ϸ�, "5ȸ �����Ͽ����ϴ�. ���α׷��� ���� �մϴ�" ��� �� ����
		Scanner sc1 = new Scanner(System.in);
		
		int cnt=0;
		String a ;
		String b;
		  
	 while(true) {
			   if(cnt==5) {
				   System.out.println(cnt+"ȸ �����Ͽ����ϴ�. ���α׷��� ���� �մϴ�");
                break;
			   }
			   else {
				   System.out.println("���̵�� �н����带 �Է��ϼ���.");
			    System.out.println("���̵�>");
			    a =sc1.next();
			   System.out.println("�н�����>");
			   b =sc1.next();
			   if(a.equals("hong") && b.equals("1234")) {
                System.out.println("�α��� ����");
                break;
			   }
			   else {
				   cnt++;
				   System.out.println(cnt+"ȸ �����Ͽ����ϴ�. (5ȸ ���н� ����)");
			}
			}
	}
			   }
			
	}



