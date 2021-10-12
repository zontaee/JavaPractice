package ch01;

public interface G1 {
	//G1(){} 
	int a=10;//static fianl
	void a();//public abstract
}

class G2 implements G1{
	@Override
	public void a() {
		System.out.println("aa");
	}
}
class G3 implements G1{
	@Override
	public void a() {
		System.out.println("bb");
	}
}