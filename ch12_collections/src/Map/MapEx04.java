package Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx04 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
	        map.put(1, "홍길동");
	        map.put(2, "일지매");
	        map.put(3, "임꺽정");
	        map.put(2, "이순신");
	        System.out.println(map.size());
	        System.out.println(map.get(3));
	        

	}

}
