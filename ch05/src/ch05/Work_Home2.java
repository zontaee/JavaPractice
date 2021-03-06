package ch05;

import java.util.Scanner;

public class Work_Home2 {
	static Scanner scanner = new Scanner(System.in);	
	static String gender;
	static int age;
	static double weight,height;
	static final double maleSTD = 1.10, femaleSTD=1.07;
	static final int COMSTD=128, COMSTD2=100;
	static boolean run=true;
	static double leanBodyMass;
	static double bodyFatMass;
	static double bodyFatRatio;
	static double leanBodyRatio;
public static void main(String[] args) {
	/*
	 * 1. 제지방 구하기 : 남성 1.10*체중 - (128*(체중^2)/(키^2))
	 *                 여성 1.07*체중 - (128*(체중^2)/(키^2))
	 * 2. 체지방량 = 체중 - 제지방량
	 * 2-1. 제지방율 = 제지방량*100/체중
	 * 3. 체지방율 = 체지방량 * 100/체중                
	 * */	  
while(run){	
	  String gender; int age;double height,weight;
	  //static void printMenu(){}
	  	printMenu();
	  //static void inputInfo(){}
	  	inputInfo();
	  
	  //1.제지방량 구하기-메소드 static leanBodyMass=getLeanBodyMass(String gender){}
	 // double leanBodyMass=0.0;
	  leanBodyMass=getLeanBodyMass();
	  System.out.println("제지방량:"+leanBodyMass);
	  //2.체지방량구하기(=체중 - 제지방량)
	  // bodyFatMass=getBodyFatMass(){}
	 // double bodyFatMass=0.0;
	  bodyFatMass=getBodyFatMass();
	  
	  //2-1. 제지방률(=제지방량*100/체중)
	  // leanBodyRation =  static getLeanBodyRatio(){}
      leanBodyRatio = getLeanBodyRatio();
	  
	  //3.체지방률 구하기(=체지방량*100/체중)
	  // bodyFatRatio= static getBodyFatRatio(){}
	  bodyFatRatio = getBodyFatRatio();
	  
	  //4. 비만도 계산
	  //남/녀 
	  String result="";// result = static  getResult(){}
	  result = getResult();

	  //출력메소드  static  void printResult(){}
      printResult();
	  //계속 여부 확인  static void isRun(){}
	 	isRun();
      }//while끝.

     System.out.println("프로그램 종료");
	}//main()끝,
	
	static void printMenu(){
		  System.out.println("=====================================");
		  System.out.println(" 정확한 계산을 위하여 아래 정보를 입력 바랍니다");
		  System.out.println("=====================================");
	  }
	
	static void inputInfo() {
		  System.out.println("성별(남자(M)/여자(F)입력)>");
		   gender = scanner.next();
		  System.out.println("나이(정수:10~39 입력)>");
		  age = scanner.nextInt();
		  System.out.println("키 입력(단위:cm)>");
		   height = scanner.nextDouble();
		  System.out.println("몸무게 입력(단위:kg)>");
		   weight = scanner.nextDouble();
		  }
	
  static double getLeanBodyMass() {
	  double leanBodyMass=0.0;
		switch(gender) {
		  case "M":leanBodyMass=(maleSTD*weight) - (COMSTD*((weight*weight)/(double)(height*height)));
		  case "F":leanBodyMass=(femaleSTD*weight) - (COMSTD*((weight*weight)/(double)(height*height)));
		  }
		System.out.println(leanBodyMass);
	return leanBodyMass;
	}
  
  static double getBodyFatMass() {
	  return weight - leanBodyMass;
  }
  
  static double getLeanBodyRatio(){
		 return (leanBodyMass*COMSTD2)/(double)weight;
	  }
  
  static double getBodyFatRatio(){
	  return (bodyFatMass*COMSTD2)/(double)weight;
  }
  
  static String getResult(){
		String result="";
	  switch(gender) {
	  case "M": if(bodyFatRatio <12) result="야윈 몸"; // 0~12미만
	  			else if(bodyFatRatio <=17) result="표준"; //12~17
	  			else if(bodyFatRatio <=22) result="과체중";//18~22
	  			else if(bodyFatRatio <=27) result="비만"; //22~27
	  			else result="고도비만";// >=28
	            break;
	  case "F":if(bodyFatRatio <22) result="야윈 몸"; // 0~22미만
				else if(bodyFatRatio <=27) result="표준"; //22~27
				else if(bodyFatRatio <=35) result="과체중";//28~35
				else if(bodyFatRatio <=40) result="비만"; //36~40
				else result="고도비만";// >=40
		        break;
	  }
	  return result;
	}
  
  static void printResult() {
	  System.out.println("결과:>");
	  System.out.printf("제지방량:%.2f\n", leanBodyMass);
	  System.out.printf("제지방율:%.2f\n", leanBodyRatio);
	  System.out.printf("체지방량:%.2f\n", bodyFatMass);
	  System.out.printf("체지방율:%.2f\n", bodyFatRatio);
	  System.out.println("결과:"+getResult());
    }
 
  static void isRun() {
		 System.out.println("계속할까요?(yes/no)");
		  String yesNo = scanner.nextLine();
		  if(yesNo.equals("no")) run=!run;
	 }
}
