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
	    	 System.out.println("����� �����Դϴ�.");
	     }
	     else {	 
	     this.name=name;
	     this.date=date;
	     state=BORROWED;//������� ����
	     System.out.println(title+"�� "+name+"�� �����߽��ϴ�.");
	     System.out.println("��������: "+date);
	     }
	     }

		@Override
		public void checkIn() {
	     name="";
	     date="";
	     state=NORMAL;
	     System.out.println(title+"�� �ݳ��߽��ϴ�.");
		}	
		 public String getrequestNo() { return requestNo; }
		    public void setrequestNo(String requestNo) { this.requestNo = requestNo; }
		    public String gettitle() { return title; }
		    public void setname(String title) { this.name = title; }
		    public String getwriter() { return writer; }
		    public void setwriter(String writer) { this.writer = writer; }
		  
		    public String toString() {
				return "requestNo [å ��ȣ=" + requestNo + ",å �̸�=" + name + ",����= " + writer + "]";
		    }
}