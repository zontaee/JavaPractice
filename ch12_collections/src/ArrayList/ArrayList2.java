package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
	List<String> list = new ArrayList<>();

	list.add("ȫ�浿");
	list.add("������");
	list.add("�Ӳ���");
	
	int num = list.size();
	System.out.println(num);
	
	 System.out.println(list.contains("�̼���")?"�̼��� ������ �ֽ��ϴ�.":"�̼��� ������ �����ϴ�.");
    
      for( String a : list) {
    	  System.out.print(a + " ");
      }
      System.out.println();
      list.add(2, "������");
    String str = list.get(3);
  	System.out.println(str);
     list.clear();
	
	System.out.println(list.isEmpty()?"����Ʈ�� ����ֽ��ϴ�.":"����Ʈ�� ������� �ʽ��ϴ�.");
	
	
	}

}
