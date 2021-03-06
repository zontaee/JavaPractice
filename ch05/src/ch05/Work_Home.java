package ch05;

import java.util.Scanner;
class Calculator{
	  Scanner scanner = new Scanner(System.in);	
	final double maleSTD = 1.10, femaleSTD=1.07;
	  final int COMSTD=128, COMSTD2=100;
	 int age ;
	double height ;
	double weight ;
	String gender;
	double bodyFatRatio;
	double leanBodyMass;
	double leanBodyRatio;
	double bodyFatMass;
	String result;
	boolean run=true;
	Calculator(int age , double height , double weight, String gender){
			this.age = age;
			this.height = height;
			this.weight = height;
			this.gender = gender;
	}
	double getLeanBodyMass(String gender) {
		 double abc = 0;
		switch(gender) {
		  case "M": abc = (maleSTD*weight) - (COMSTD*((weight*weight)/(double)(height*height)));
		             
		  
		  case "F": abc = (femaleSTD*weight) - (COMSTD*((weight*weight)/(double)(height*height)));
		     }
		return abc;
		}
	void setleanBodyMass(double leanBodyMass){
		 this.leanBodyMass = leanBodyMass;
	 }
	double getBodyFatMass() {
		 return (weight - getLeanBodyMass(gender));
	}
	 void setbodyFatMass(double bodyFatMass){
		 this.bodyFatMass = bodyFatMass;
	 }
    double getLeanBodyRatio() {
    	return ( getLeanBodyMass(gender)*COMSTD2)/(double)weight;
    }
    void setleanBodyRatio(double leanBodyRatio){
		 this.leanBodyRatio = leanBodyRatio;
	 }
    double getBodyFatRatio() {
    	return (getBodyFatMass()*COMSTD2)/(double)weight;
    }
    void setbodyFatRatio(double bodyFatRatio ){
    	this.bodyFatRatio = bodyFatRatio;
    }
    
    String getResult(String gender, double bodyFatRatio){
    	String result = null;
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
    void setResult(String result){
    	this.result = result;
    }
    void printResult(){
    	System.out.println("결과:>");
		  System.out.printf("제지방량:%.2f\n", leanBodyMass);
		  System.out.printf("제지방율:%.2f\n", leanBodyRatio);
		  System.out.printf("체지방량:%.2f\n", bodyFatMass);
		  System.out.printf("체지방율:%.2f\n", bodyFatRatio);
		  System.out.println("결과:"+result);
    }
    void isRun() {
    	System.out.println("계속할까요?(yes/no)");
    	 String yesNo = scanner.nextLine();
		  if(yesNo.equals("no")) run=!run;
		  
    }
}

public class Work_Home {
	 
	
	
	

	private static final String String = null;

	public static void main(String[] args) {
		/*
		 * 1. 제지방 구하기 : 남성 1.10*체중 - (128*(체중^2)/(키^2))
		 *                 여성 1.07*체중 - (128*(체중^2)/(키^2))
		 * 2. 체지방량 = 체중 - 제지방량
		 * 2-1. 제지방율 = 제지방량*100/체중
		 * 3. 체지방율 = 체지방량 * 100/체중                
		 * */	
		  Scanner scanner = new Scanner(System.in);	
		
		  boolean run=true;
		  
	while(run){	  
		  System.out.println("=====================================");
		  System.out.println(" 정확한 계산을 위하여 아래 정보를 입력 바랍니다");
		  System.out.println("=====================================");
		  System.out.println("성별(M/F) 나이(0~39) 키(cm) 몸무게(kg)순 입력>");
		  String input = scanner.nextLine();// "M 35 170 60"
		  String[] arr= input.split(" ");//공백 기준으로 잘라서 문자열 배열로 생성
		  System.out.println(arr.length);
		  String gender = arr[0];
		   int age = Integer.parseInt(arr[1]);
		   double height = Double.parseDouble(arr[2]);
		   double weight = Double.parseDouble(arr[3]);
		   Calculator cal = new Calculator(age,height,weight,gender);
		 
			/*
			 * System.out.println("성별(남자(M)/여자(F)입력)>");
			 * 
			 * String gender = scanner.next(); System.out.println("나이(정수:10~39 입력)>"); int
			 * age = scanner.nextInt(); System.out.println("키 입력(단위:cm)>"); double height =
			 * scanner.nextDouble(); System.out.println("몸무게 입력(단위:kg)>"); double weight =
			 * scanner.nextDouble();
			 */	  
		  
		  
		  //1.제지방량 구하기-메소드 leanBodyMass=getLeanBodyMass(String gender){}
		   double leanBodyMass = cal.getLeanBodyMass(gender);
		   cal.setleanBodyMass(leanBodyMass);
			  
		  
		  //2.체지방량구하기(=체중 - 제지방량)
		  // bodyFatMass=getBodyFatMass(){}
		  double bodyFatMass= cal.getBodyFatMass();
		  cal.setbodyFatMass(bodyFatMass);
		  
		  //2-1. 제지방률(=제지방량*100/체중)
		  // leanBodyRation = getLeanBodyRatio(){}
		  double leanBodyRatio = cal.getLeanBodyRatio();
		  cal.setleanBodyRatio(leanBodyRatio);
		  //3.체지방률 구하기(=체지방량*100/체중)
		  // bodyFatRatio=getBodyFatRatio(){}
		  double bodyFatRatio = cal.getBodyFatRatio();
		  cal.setbodyFatRatio(bodyFatRatio);
		  //4. 비만도 계산
		  //남/녀 
		  String result= cal.getResult(gender, bodyFatRatio);
		  cal.setResult(result);

		  //출력메소드 void printResult(){}
		  cal.printResult();
		 
		  
		  //계속 여부 확인 void isRun(){}
		  cal.isRun();
		  
		  		  
	      }//while끝.

	     System.out.println("프로그램 종료");
		}

	

	
	}

	

