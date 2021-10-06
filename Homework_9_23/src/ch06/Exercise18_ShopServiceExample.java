package ch06;

public class Exercise18_ShopServiceExample {

	public static void main(String[] args) {
		Exercise18_ShopService obj1 = Exercise18_ShopService.getInstance();
		Exercise18_ShopService obj2 = Exercise18_ShopService.getInstance();
	 
	        if(obj1 == obj2) {
	            System.out.println("µø¿œ ∞¥√º");
	        } else {
	            System.out.println("¥Ÿ∏• ∞¥√º");
	        }

	}

}
