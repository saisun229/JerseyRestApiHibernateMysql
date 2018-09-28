package org.sai.java.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sai.java.messenger.dao.MessageDao;
import org.sai.java.messenger.model.Message;
import org.sai.java.messenger.service.MessageService;




@Path("/messages")
public class MessageResource {
	
/*MessageService messageService = new MessageService();
*/
	 
	MessageDao messageDao = new MessageDao();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		
		return messageDao.listAllMessages();
		
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Message getMessageWithId(@PathParam("id") int id) {
		
		return messageDao.getMessage(id);
		
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public  void saveMessage(Message message) {
		
		messageDao.saveMessage(message);
		
	}
	
}
