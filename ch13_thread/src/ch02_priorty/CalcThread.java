package ch02_priorty;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}
  public void run() {
	  for(int i=0; i<200000; i++) {}
	  System.out.println(getName());
  }
}
