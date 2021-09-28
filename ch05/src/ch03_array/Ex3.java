package ch03_array;

public class Ex3 {

	public static void main(String[] args) {
		int[] n = {12,20,67,567,21};
		System.out.println("배열의 갯수" + n.length );
		
		for(int i=0; i<n.length; i++) {
			System.out.println("[" + i + "]="+n[i] );
		}
			System.out.println("향상된 for문");
			//향상된for문
			for(int k :n) {
				System.out.print(k + " ");
			}
			
		}

	}


