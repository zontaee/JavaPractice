package ch03_array;

public class Ex12CopyExam {

	public static void main(String[] args) {
		 int[] arr1 = {1,2,3,4,5};
		 int[] arr2 = {6,7,8,9,10};//index번호 0,1,2,3,4
		 //두개의 배열을 합치기
		 //두개의 다 저장할수 있는 크기의 새로운 배열 생성
		 int[] arr3=new int[arr1.length + arr2.length];
		 //첫번째 배열 내용 복사
		 for(int i=0;i<arr1.length;i++) arr3[i]=arr1[i];//[1][2][3][4][5][0][0][0][0][0]
		 //두번째 배열 내용 복사
		 //첫번째 배열 복사후 두번째 배열 복사시는 복사된index번호 이후부터 저장
		 //첫번째 배열의 길이=5
		 for(int i=0;i<arr2.length;i++) arr3[arr1.length+i]=arr2[i];
		 //[6][7][8][9][10][0][0][0][0][0] ->//[1][2][3][4][5][6][7][8][9][10]
		 
		 for(int a:arr3)
			 System.out.print(a+" ");
	}

}
