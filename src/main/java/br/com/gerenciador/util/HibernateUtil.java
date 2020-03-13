package br.com.gerenciador.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static SessionFactory getFabricaDeSessoes() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		return factory;
	}
}
