package ch03_array;

public class Ex3 {

	public static void main(String[] args) {
		int[] n = {12,20,67,567,21};
		System.out.println("�迭�� ����" + n.length );
		
		for(int i=0; i<n.length; i++) {
			System.out.println("[" + i + "]="+n[i] );
		}
			System.out.println("���� for��");
			//����for��
			for(int k :n) {
				System.out.print(k + " ");
			}
			
		}

	}


