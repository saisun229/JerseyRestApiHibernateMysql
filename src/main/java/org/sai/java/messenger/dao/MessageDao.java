package org.sai.java.messenger.dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.sai.java.messenger.model.Message;
import org.sai.java.messenger.util.HibernateUtil;




public class MessageDao {

	

	public static  Session getSession() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		return session;
	}
	

public  List<Message> listAllMessages(){
	
	Criteria cr  = getSession().createCriteria(Message.class);
	List results= cr.list();
       getSession().close();
		return results;

}
public Message getMessage(int tid){
	
	Message message = (Message) getSession().get(Message.class, tid);
	getSession().close();
		return message;

}


























public  void saveMessage(Message message) {
	
	
	
	Transaction trns = null;
	Session session = HibernateUtil.getSessionFactory().openSession();
	try {
		trns = session.beginTransaction();
		session.save(message);
		session.getTransaction().commit();
	} catch (RuntimeException e) {
		if (trns != null) {
			trns.rollback();
		}
		e.printStackTrace();
	} finally {
		session.flush();
		session.close();
	}




}

	


}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	













