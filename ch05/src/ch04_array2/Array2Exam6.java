package ch04_array2;

public class Array2Exam6 {

	public static void main(String[] args) {
		/// 2�����迭 - ����ǥ �ۼ�
				String title ="����ǥ";
				String[] head= {"�̸�","����","����","����","����","���"};
				System.out.println("\t\t"+title);
				for(String h:head)System.out.print(h+"\t");
				System.out.println("\n===========================================");
				String[] name = { "ȫ�浿", "������", "�Ӳ���", "�̼���" ,"����" };
				int sum = 0;
				int avg = 0;
				int total[]= new int[5];
				int[][] score = { { 90, 80, 70 }, { 76, 86, 90 }, { 90, 78, 90 }, { 80, 65, 87 } };
				//
				for (int i = 0; i < score.length; i++) {// score.length-�迭�� ���� ����
					System.out.print(name[i]+"\t");
					for (int j = 0; j < score[i].length; j++) {// score[i].length =�迭�� �� ���� ���� ����
						System.out.print(score[i][j] + "\t");
						sum+=score[i][j];//�� �ະ ������ ���
						avg = sum/score[j].length;
						total[j] +=score[i][j];
						}//���� for��
					System.out.println(sum+"\t"+sum/score[i].length);
					total[total.length-2] += sum; 
					total[total.length-1] += avg;
				
					sum=0;//�ʱ�ȭ
					avg=0;
				}//�ٱ��� for��
				
				System.out.println("===========================================");
				System.out.print("�հ�" + "\t");
				total[total.length-1]= total[total.length-1]/4;
				for (int i = 0; i < total.length; i++) {
					System.out.print(total[i] + "\t");
				}
				
		}
			
		
	}


