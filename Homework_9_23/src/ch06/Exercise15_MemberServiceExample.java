package ch06;

public class Exercise15_MemberServiceExample {
	 public static void main(String[] args) {
		 Exercise15_MemberService memberService = new Exercise15_MemberService();
	        boolean result = memberService.login("hong", "1235");
	        if(result) {
	            System.out.println("�α��� �Ǿ����ϴ�.");
	            memberService.logout("hong");
	        } else {
	            System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
	        }
    }
}
