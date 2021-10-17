package ch01_Object.copy;

//thread, collection, network, file�����, 
public class Member {
private String name;//����Ÿ�� 	
private int age;//�⺻Ÿ��

public Member(String name, int age) {
	this.name = name;
	this.age = age;
}

public String getName() {	return name;}
public void setName(String name) {this.name = name;}
public int getAge() {	return age;}
public void setAge(int age) {this.age = age;}

//2.equals�޼ҵ� ��
@Override
public boolean equals(Object obj) {
	if(obj instanceof Member) {
	return this.name.equals(((Member)obj).getName()) && this.age==((Member)obj).getAge();
	}
	return false;
}


}