package ch01;
/* ���� ���� ����� �����ϰ� ��ü ������ ���� ������
 * NullPointExceptionExam ���ܰ� �߻�

 */
public class NullPointExceptionExam {

	public static void main(String[] args) {
		//�����Ͻô� ���������� ������ �����Ƿ� ���� �߻����� ����.
		int[] intArray = null;//��ü ���� ���� ���� �ϰ� ���� ��ü�� �������� ����.
		//intArray=new int[10]; //�迭 ��ü ����
		intArray[0] = 10; //���α׷� ������ ���� �߻� -runtime Exception
		
		
		String str = null;//��ü ���� ���� ���� �ϰ� ���� ��ü�� �������� ����.
		//str="Hello";//hello ��� ���ڿ� ��ü ����
		System.out.println("�� ���ڼ� :"+str.length());//���α׷� ���� �� ���� �߻�-runtime Exception
	}

}
