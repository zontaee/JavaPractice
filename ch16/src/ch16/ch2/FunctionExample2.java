package ch16.ch2;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list 
    =Arrays.asList(new Student("È«±æµ¿",90,96),new Student("ÀÏÁö¸Å",95,93));
	
	public static double avg(ToIntFunction<Student> function) {
		int sum=0;
		for(Student student:list) {
			sum+=function.applyAsInt(student);
		}
		double avg =(double)sum/list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getEnglishScore();
			}
		});
		System.out.println(englishAvg);
		
		englishAvg=avg(student->student.getEnglishScore());
		System.out.println(englishAvg);
	}
}