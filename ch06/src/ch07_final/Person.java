package ch07_final;

public class Person {
	 //final�ʵ�� ����� ���ÿ� �ʱ�ȭ
	 final String nation="Korea";
	 //�����ڿ��� final�ʵ带 �ʱ�ȭ�Ҽ� �ִ� ��� ���� �س��� ���� �߻����� ����.
	 final String ssn;
	 String name;
	 //�����ڿ� final�ʵ带 �ʱ�ȭ �ϴ� ���ɹ� ����.
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
}
	public static void main(String[] args) {
		Person person = new Person("20010101-1234567","ȫ�浿");
		//person.nation="usa";
		//person.ssn="1234";
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		Person person1 = new Person("20010121-1234567","���浿");
		//person.nation="usa";
		//person.ssn="1234";
		System.out.println(person1.nation);
		System.out.println(person1.ssn);
		System.out.println(person1.name);
	
	} 
	
}