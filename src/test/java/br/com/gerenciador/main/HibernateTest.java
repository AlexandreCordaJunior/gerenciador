package br.com.gerenciador.main;

import org.hibernate.Session;
import org.junit.Test;

import br.com.gerenciador.util.HibernateUtil;

public class HibernateTest {
	
	@Test
	public void acessa() {
		Session session = HibernateUtil.getFabricaDeSessoes().openSession();
		session.close();
	}

}
