package ch07;

public class Exercise5 {
	public class Parent{
		public String name;

		public Parent(String name) {
			this.name = name;
		}
	}
	public class Child extends Parent {
		private int studentNo;

		public Child(String name, int studentNo) {
			super(name);        //<-ÀÌ·¸°Ô ¹Ù²ãÁà¾ßÇÑ´Ù
			this.studentNo = studentNo;
		}
	}
}