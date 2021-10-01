package ch2;



public class PrintShapeExam {

	public static void main(String[] args) {
		Shape shape = new Shape();
		Triangle tri = new Triangle();
		Square squ = new Square();
		Circle circle = new Circle();
		
		System.out.println(shape.name);
		System.out.println(tri.name);
		System.out.println(squ.name);
		System.out.println(circle.name);

	}

}
