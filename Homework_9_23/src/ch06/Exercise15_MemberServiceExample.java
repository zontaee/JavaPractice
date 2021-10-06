package ch06;

public class Exercise15_MemberServiceExample {
	 public static void main(String[] args) {
		 Exercise15_MemberService memberService = new Exercise15_MemberService();
	        boolean result = memberService.login("hong", "1235");
	        if(result) {
	            System.out.println("로그인 되었습니다.");
	            memberService.logout("hong");
	        } else {
	            System.out.println("id 또는 password가 올바르지 않습니다.");
	        }
    }
}
