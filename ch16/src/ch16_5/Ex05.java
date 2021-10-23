package ch16_5;

public class Ex05 {
public static void main(String[] args) {
	UsingThis1 usingThis = new UsingThis1();
	UsingThis1.Inner inner = usingThis.new Inner();
	inner.method();
}
}