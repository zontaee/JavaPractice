package ch04_array2;

public class Array2Exam {

	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		scores[0][0]=1; scores[0][1]=2; scores[0][2]=3;
		scores[1][0]=4; scores[1][1]=5; scores[1][2]=6;
		//2차원에서 lenght의 값은 배열의 갯수 의미
		System.out.println(scores.length);//2
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		
		//출력
		for(int i =0; i<scores.length;i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
			}
		

	}

}
