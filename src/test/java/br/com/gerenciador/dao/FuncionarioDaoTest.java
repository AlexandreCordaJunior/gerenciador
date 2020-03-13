package br.com.gerenciador.dao;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;

import br.com.gerenciador.domain.Funcionario;

public class FuncionarioDaoTest {
	
	@Test
	@Ignore
	public void salvar() {
		GenericDao<Funcionario> dao = new GenericDao<Funcionario>(Funcionario.class.getName());
		Funcionario func = new Funcionario();
		func.setCpf("1");
		func.setDataDeNascimento(new Date(110, 03, 03));
		func.setEmail("email");
		func.setSexo('M');
		func.setEndereco("rua");
		func.setEstado('A');
		func.setResponsavelPeloCadastro(dao.buscar(1));
		func.setRg("RG");
		func.setTelefone("32");
		func.setNome("Christiano");
		dao.salvar(func);
	}
	
	@Test
	@Ignore
	public void buscar() {
		GenericDao<Funcionario> dao = new GenericDao<Funcionario>(Funcionario.class.getName());
		Funcionario fun = dao.buscar(5);
		System.out.println(fun.getNome());
	}
	
	@Test
	@Ignore
	public void excluir() {
		GenericDao<Funcionario> dao = new GenericDao<Funcionario>(Funcionario.class.getName());
		dao.excluir(1);
	}
	
	@Test
	@Ignore
	public void editar() {
		GenericDao<Funcionario> dao = new GenericDao<Funcionario>(Funcionario.class.getName());
		Funcionario func = new Funcionario();
		func.setCpf("1");
		func.setDataDeNascimento(new Date(110, 03, 03));
		func.setEmail("email");
		func.setSexo('M');
		func.setEndereco("rua");
		func.setEstado('A');
		func.setResponsavelPeloCadastro(dao.buscar(1));
		func.setRg("RG");
		func.setTelefone("32");
		func.setNome("Christiano");
		
		dao.editar(1, func);
	}
	
}
