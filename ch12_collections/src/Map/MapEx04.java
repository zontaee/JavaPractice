package Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx04 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
	        map.put(1, "ȫ�浿");
	        map.put(2, "������");
	        map.put(3, "�Ӳ���");
	        map.put(2, "�̼���");
	        System.out.println(map.size());
	        System.out.println(map.get(3));
	        

	}

}
