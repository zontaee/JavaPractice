package ch06;

public class Exercise19_AccountExam {
	 public static void main(String[] args) {
		 Exercise19_Account account = new Exercise19_Account();
	        
	        account.setBalance(10000);
	        System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
	 
	        account.setBalance(-100);
	        System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
	 
	        account.setBalance(2000000);
	        System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
	 
	        account.setBalance(300000);
	        System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
	    }
}
