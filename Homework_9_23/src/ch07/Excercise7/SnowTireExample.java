package ch07.Excercise7;

public class SnowTireExample {
	 public static void main(String[] args){
	    	SnowTire snowTire = new SnowTire();
	        Tire tire = snowTire;
	        
	        snowTire.run();
	        tire.run();
	    }
	}
//�Ѵ� ����� Ÿ�̾ �������ϴ� �� ��µȴ�. �ֳĸ� tire ��ü�� snowtire�� ����ֱ⶧��