package ch08.Exercise5;

public class ActionExample {
	public static void main(String[] args) {
		Action action =	 new Action(){

			@Override
			public void work() {
				System.out.println("�����մϴ�.");
				
			}
			
		};
		
		action.work();

	}
}
