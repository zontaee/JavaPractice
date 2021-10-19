package Map;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueEx {
public static void main(String[] args) {
	Queue<Message> messageQue=new LinkedList<>();
	
	messageQue.offer(new Message("sendMail", "홍길동"));
	messageQue.offer(new Message("sendSNS", "김완선"));
	messageQue.offer(new Message("sendKatok", "강호동"));
	
	while(!messageQue.isEmpty()) {
	    Message message = messageQue.poll();
	    switch(message.command) {
	    case "sendMail": System.out.println(message.to+" 메일정송"); break;
	    case "sendSNS": System.out.println(message.to+" SNS전송"); break;
	    case "sendKatok": System.out.println(message.to+" Katok전송"); break;
	    }
	}
	
}
}