package br.com.gerenciador.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Escola extends GenericDomain<Escola>{
	@Column(nullable = false, length = 127)
	private String nome;
	
	@Column(nullable = false, length = 127)
	private String email;
	
	@Column(nullable = false, length = 15)
	private String telefone;
	
	@Column(nullable = false, length = 127)
	private String endereco;
	
	@Column(nullable = false, length = 15)
	private String cnpj;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Funcionario responsavelPeloCadastro; 
	
	public void setEntidade(Escola e) {
		setNome(e.getNome());
		setCnpj(e.getCnpj());
		setEmail(e.getEmail());
		setEndereco(e.getEndereco());
		setResponsavelPeloCadastro(e.getResponsavelPeloCadastro());
		setTelefone(e.getTelefone());
		setEstado(e.getEstado());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Funcionario getResponsavelPeloCadastro() {
		return responsavelPeloCadastro;
	}

	public void setResponsavelPeloCadastro(Funcionario responsavelPeloCadastro) {
		this.responsavelPeloCadastro = responsavelPeloCadastro;
	}

	@Override
	public String toString() {
		return "Escola [nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", endereco=" + endereco
				+ ", cnpj=" + cnpj + ", responsavelPeloCadastro=" + responsavelPeloCadastro.getNome() + "]";
	}
	
}
