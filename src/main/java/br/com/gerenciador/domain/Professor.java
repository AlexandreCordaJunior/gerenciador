package br.com.gerenciador.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Professor extends GenericDomain<Professor>{
	
	@Column(nullable = false, length = 15)
	private String cpf;
	
	@Column(nullable = false, length = 15)
	private String rg;
	
	@Column(nullable = false)
	private Date dataDeNascimento;
	
	@Column(nullable = false)
	private char sexo;
	
	@Column(nullable = false, length = 127)
	private String email;
	
	@Column(nullable = false, length = 15)
	private String telefone;
	
	@Column(nullable = false, length = 127)
	private String endereco;
	
	@Column(nullable = false, length = 127)
	private String nome;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Funcionario responsavelPeloCadastro;
	
	public void setEntidade(Professor professor) {
		setCpf(professor.getCpf());
		setDataDeNascimento(professor.getDataDeNascimento());
		setEmail(professor.getEmail());
		setEndereco(professor.getEndereco());
		setEstado(professor.getEstado());
		setNome(professor.getNome());
		setResponsavelPeloCadastro(professor.getResponsavelPeloCadastro());
		setRg(professor.getRg());
		setSexo(professor.getSexo());
		setTelefone(professor.getTelefone());
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Funcionario getResponsavelPeloCadastro() {
		return responsavelPeloCadastro;
	}
	public void setResponsavelPeloCadastro(Funcionario responsavelPeloCadastro) {
		this.responsavelPeloCadastro = responsavelPeloCadastro;
	}

	@Override
	public String toString() {
		return "Professor [cpf=" + cpf + ", rg=" + rg + ", dataDeNascimento=" + dataDeNascimento + ", sexo=" + sexo
				+ ", email=" + email + ", telefone=" + telefone + ", endereco=" + endereco + ", nome=" + nome
				+ ", responsavelPeloCadastro=" + responsavelPeloCadastro.getNome() + "]";
	}
	
	
}