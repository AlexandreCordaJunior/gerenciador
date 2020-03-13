package br.com.gerenciador.dao;

import org.hibernate.Session;

import br.com.gerenciador.domain.GenericDomain;
import br.com.gerenciador.util.HibernateUtil;

public class GenericDao<Entidade extends GenericDomain> {
	private String className;
	
	public GenericDao(String className) {
		this.className = className;
	}
	
	public void salvar(Entidade entidade) {
		Session session = HibernateUtil.getFabricaDeSessoes().openSession();
		
		try {
			session.beginTransaction();
			
			session.save(entidade);
			
			session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Entidade buscar(long codigo) {
		Session session = HibernateUtil.getFabricaDeSessoes().openSession();
		Entidade entidade = null;
		try {
			session.beginTransaction();
			
			entidade = (Entidade) session.get(className, codigo);
			
			session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return entidade;
	}
	
	public void excluir(long codigo) {
		Session session = HibernateUtil.getFabricaDeSessoes().openSession();
		Entidade entidade = null;
		try {
			session.beginTransaction();
			entidade = (Entidade) session.get(className, codigo);
			if(entidade == null) {
				return;
			}
			
			System.out.println(entidade.getCodigo());
			entidade.setEstado('I');
			session.update(entidade);
			
			session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void editar(long codigo, Entidade novaEntidade) {
		Session session = HibernateUtil.getFabricaDeSessoes().openSession();
		Entidade entidade = null;
		try {
			session.beginTransaction();
			
			entidade = (Entidade) session.get(className, codigo);
			entidade.setEntidade(novaEntidade);
			session.update(entidade);
			
			session.getTransaction().commit();
		}
		catch(Exception e) {
			
		}
	}
}
