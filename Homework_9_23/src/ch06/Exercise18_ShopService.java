package ch06;

public class Exercise18_ShopService {
private static Exercise18_ShopService shopService = new Exercise18_ShopService(); 

private Exercise18_ShopService(){}

public static Exercise18_ShopService getInstance() {
	return  shopService;
 }
}
