package ch06;

public class Exercise15_MemberService {
	boolean login(String id, String password) {
		if("12345".equals(password)) {
			
			return true;
		}
		else 
			 
			return false;
	}
    void logout (String id) {
    	System.out.println(id + "���� �α׾ƿ� �Ǿ����ϴ�.");
    }
}
