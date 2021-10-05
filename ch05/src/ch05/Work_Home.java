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
		  case "M": if(bodyFatRatio <12) result="���� ��"; // 0~12�̸�
		  			else if(bodyFatRatio <=17) result="ǥ��"; //12~17
		  			else if(bodyFatRatio <=22) result="��ü��";//18~22
		  			else if(bodyFatRatio <=27) result="��"; //22~27
		  			else result="����";// >=28
		            break;
		  case "F":if(bodyFatRatio <22) result="���� ��"; // 0~22�̸�
					else if(bodyFatRatio <=27) result="ǥ��"; //22~27
					else if(bodyFatRatio <=35) result="��ü��";//28~35
					else if(bodyFatRatio <=40) result="��"; //36~40
					else result="����";// >=40
			        break;
		}
       return result;
    }
    void setResult(String result){
    	this.result = result;
    }
    void printResult(){
    	System.out.println("���:>");
		  System.out.printf("�����淮:%.2f\n", leanBodyMass);
		  System.out.printf("��������:%.2f\n", leanBodyRatio);
		  System.out.printf("ü���淮:%.2f\n", bodyFatMass);
		  System.out.printf("ü������:%.2f\n", bodyFatRatio);
		  System.out.println("���:"+result);
    }
    void isRun() {
    	System.out.println("����ұ��?(yes/no)");
    	 String yesNo = scanner.nextLine();
		  if(yesNo.equals("no")) run=!run;
		  
    }
}

public class Work_Home {
	 
	
	
	

	private static final String String = null;

	public static void main(String[] args) {
		/*
		 * 1. ������ ���ϱ� : ���� 1.10*ü�� - (128*(ü��^2)/(Ű^2))
		 *                 ���� 1.07*ü�� - (128*(ü��^2)/(Ű^2))
		 * 2. ü���淮 = ü�� - �����淮
		 * 2-1. �������� = �����淮*100/ü��
		 * 3. ü������ = ü���淮 * 100/ü��                
		 * */	
		  Scanner scanner = new Scanner(System.in);	
		
		  boolean run=true;
		  
	while(run){	  
		  System.out.println("=====================================");
		  System.out.println(" ��Ȯ�� ����� ���Ͽ� �Ʒ� ������ �Է� �ٶ��ϴ�");
		  System.out.println("=====================================");
		  System.out.println("����(M/F) ����(0~39) Ű(cm) ������(kg)�� �Է�>");
		  String input = scanner.nextLine();// "M 35 170 60"
		  String[] arr= input.split(" ");//���� �������� �߶� ���ڿ� �迭�� ����
		  System.out.println(arr.length);
		  String gender = arr[0];
		   int age = Integer.parseInt(arr[1]);
		   double height = Double.parseDouble(arr[2]);
		   double weight = Double.parseDouble(arr[3]);
		   Calculator cal = new Calculator(age,height,weight,gender);
		 
			/*
			 * System.out.println("����(����(M)/����(F)�Է�)>");
			 * 
			 * String gender = scanner.next(); System.out.println("����(����:10~39 �Է�)>"); int
			 * age = scanner.nextInt(); System.out.println("Ű �Է�(����:cm)>"); double height =
			 * scanner.nextDouble(); System.out.println("������ �Է�(����:kg)>"); double weight =
			 * scanner.nextDouble();
			 */	  
		  
		  
		  //1.�����淮 ���ϱ�-�޼ҵ� leanBodyMass=getLeanBodyMass(String gender){}
		   double leanBodyMass = cal.getLeanBodyMass(gender);
		   cal.setleanBodyMass(leanBodyMass);
			  
		  
		  //2.ü���淮���ϱ�(=ü�� - �����淮)
		  // bodyFatMass=getBodyFatMass(){}
		  double bodyFatMass= cal.getBodyFatMass();
		  cal.setbodyFatMass(bodyFatMass);
		  
		  //2-1. �������(=�����淮*100/ü��)
		  // leanBodyRation = getLeanBodyRatio(){}
		  double leanBodyRatio = cal.getLeanBodyRatio();
		  cal.setleanBodyRatio(leanBodyRatio);
		  //3.ü����� ���ϱ�(=ü���淮*100/ü��)
		  // bodyFatRatio=getBodyFatRatio(){}
		  double bodyFatRatio = cal.getBodyFatRatio();
		  cal.setbodyFatRatio(bodyFatRatio);
		  //4. �񸸵� ���
		  //��/�� 
		  String result= cal.getResult(gender, bodyFatRatio);
		  cal.setResult(result);

		  //��¸޼ҵ� void printResult(){}
		  cal.printResult();
		 
		  
		  //��� ���� Ȯ�� void isRun(){}
		  cal.isRun();
		  
		  		  
	      }//while��.

	     System.out.println("���α׷� ����");
		}

	

	
	}

	

