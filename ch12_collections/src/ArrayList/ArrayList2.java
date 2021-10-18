package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
	List<String> list = new ArrayList<>();

	list.add("홍길동");
	list.add("일지매");
	list.add("임꺾정");
	
	int num = list.size();
	System.out.println(num);
	
	 System.out.println(list.contains("이순신")?"이순신 문장이 있습니다.":"이순신 문장이 없습니다.");
    
      for( String a : list) {
    	  System.out.print(a + " ");
      }
      System.out.println();
      list.add(2, "유관순");
    String str = list.get(3);
  	System.out.println(str);
     list.clear();
	
	System.out.println(list.isEmpty()?"리스트가 비어있습니다.":"리스트가 비어있지 않습니다.");
	
	
	}

}
