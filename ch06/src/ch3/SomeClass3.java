package ch3;

public class SomeClass3 {
int f1 = 10;

SomeClass3(){this.f1=10;}

void method() {
	int f1=0;
	System.out.println(f1);
}
void method2() {
	this.f1=10;
	System.out.println(f1);
}
}
