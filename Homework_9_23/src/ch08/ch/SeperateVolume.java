package ch08.ch;

public class SeperateVolume implements Lendable{
	String requestNo; String title; String writer;
	 public int state; 
	 String name="", date="";
	  
	  
	public SeperateVolume(String requestNo, String title, String writer) {
		this.requestNo = requestNo;
		this.title = title;
		this.writer = writer;
	}

		@Override
		public void checkOut(String name, String date) {
	     if(state==BORROWED) {
	    	 System.out.println("대출된 도서입니다.");
	     }
	     else {	 
	     this.name=name;
	     this.date=date;
	     state=BORROWED;//대출상태 변경
	     System.out.println(title+"을 "+name+"가 대출했습니다.");
	     System.out.println("대출일자: "+date);
	     }
	     }

		@Override
		public void checkIn() {
	     name="";
	     date="";
	     state=NORMAL;
	     System.out.println(title+"을 반납했습니다.");
		}	
		 public String getrequestNo() { return requestNo; }
		    public void setrequestNo(String requestNo) { this.requestNo = requestNo; }
		    public String gettitle() { return title; }
		    public void setname(String title) { this.name = title; }
		    public String getwriter() { return writer; }
		    public void setwriter(String writer) { this.writer = writer; }
		  
		    public String toString() {
				return "requestNo [책 번호=" + requestNo + ",책 이름=" + name + ",저자= " + writer + "]";
		    }
}