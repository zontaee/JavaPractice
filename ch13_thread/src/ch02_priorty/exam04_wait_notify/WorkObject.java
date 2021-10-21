package ch02_priorty.exam04_wait_notify;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadAÀÇ methodA() ÀÛ¾÷ ½ÇÇà");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadBÀÇ methodB() ÀÛ¾÷ ½ÇÇà");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
}