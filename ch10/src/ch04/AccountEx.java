package ch04;

public class AccountEx {
	public static void main(String[] args) {
		Acc acc =new Acc("111-001","조인태",10000);
		//
		acc.deposit(10000);
		System.out.println(acc.getBalance());
		//
		acc.withdraw(15000);
		System.out.println(acc.getBalance());
		
		acc.withdraw(15000);
		System.out.println(acc.getBalance());
		
	}
	}