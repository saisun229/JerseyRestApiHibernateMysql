package org.sai.java.messenger.service;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.sai.java.messenger.database.Database;
import org.sai.java.messenger.model.Message;



public class MessageService {
	
	
	
	private Map<Long, Message> messages = Database.getMessages();

	public MessageService() {
	messages.put(1L,new Message(1,"nice sunny day", "sai"));
	messages.put(2L,new Message(2,"Good morning", "Hyderabad"));
		
	}
	
	public List<Message> listAllMessages(){
		
		return new ArrayList<Message>(messages.values());
	}
	public Message getMessage(long id){
		
		return messages.get(id);
	}
	
	
/*  public List<Message>  listAllMessages(){
		
		Message m2 = new Message(2,"Good morning", "Hyderabad");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}*/
}


	

