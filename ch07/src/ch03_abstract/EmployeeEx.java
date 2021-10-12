package ch03_abstract;

public class EmployeeEx {
	public static void main(String[] args) {
		Employee[] emp = new  Employee[5];
		emp[0] = new SalaryMan("a", 50000000);
		emp[1] = new SalaryMan("b", 2000000);
		emp[2] = new SalaryMan("c", 50000000);
		emp[3] = new HourlyMan("D", 5, 9500);
		emp[4] = new HourlyMan("E", 7, 9800);
		
		for(int i=0;i<emp.length;i++) {
			emp[i].computePay();
			emp[i].print();
		}
	}
}

