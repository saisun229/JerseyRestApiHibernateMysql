package org.sai.java.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.sai.java.messenger.model.Message;

public class Database {

	
	private static Map< Long , Message> messages = new HashMap<>();
	
	
	public static Map<Long, Message> getMessages(){
		
		return messages;
	}
	
}
