package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListEx4 {
	public static void main(String[] args) {
	List list =  new ArrayList();
	list.add("È«±æµ¿");    //String -> Object
	list.add("ÀÏÁö¸Å");
	list.add("ÀÓ²©Á¤");
	list.add("10");// Integer ->Object
	list.add("20");
	list.add("30");
	for (int i =0; i<list.size(); i++) {
		System.out.println(list.get(i)); // Object -> String/Integer
		
	}
}
}