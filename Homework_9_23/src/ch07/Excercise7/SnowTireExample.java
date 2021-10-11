package ch07.Excercise7;

public class SnowTireExample {
	 public static void main(String[] args){
	    	SnowTire snowTire = new SnowTire();
	        Tire tire = snowTire;
	        
	        snowTire.run();
	        tire.run();
	    }
	}
//둘다 스노우 타이어가 굴러갑니다 가 출력된다. 왜냐면 tire 객체에 snowtire를 집어넣기때문