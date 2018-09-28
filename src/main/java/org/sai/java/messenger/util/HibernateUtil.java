package org.sai.java.messenger.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.sai.java.messenger.model.Message;



public class HibernateUtil {

	private static final SessionFactory SESSION_FACTORY;
	
	static {
		Configuration configuration = new Configuration();
		
		//by default loads hibernate.cfg.xml
		configuration.configure();
		configuration.addAnnotatedClass(Message.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SESSION_FACTORY =configuration.buildSessionFactory(serviceRegistry);
	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}



	
}


	
