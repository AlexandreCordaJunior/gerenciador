package br.com.gerenciador.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Turma extends GenericDomain<Turma>{
	@Column(nullable = false)
	private int numTurma;
	
	@Column(nullable = false)
	private char periodo;
	
	@Column(nullable = false, length = 15)
	private String tipo;
	
	@Column(nullable = false)
	private int quantidadeMaximaDeAlunos;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Escola escola;
	
	@ManyToMany
	@JoinColumn(nullable = false)
	private List<Professor> professores;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Funcionario responsavelPeloCadastro;
	
	public void setEntidade(Turma turma) {
		setEscola(turma.getEscola());
		setEstado(turma.getEstado());
		setNumTurma(turma.getNumTurma());
		setPeriodo(turma.getPeriodo());
		setProfessores(turma.getProfessores());
		setQuantidadeMaximaDeAlunos(turma.getQuantidadeMaximaDeAlunos());
		setResponsavelPeloCadastro(turma.getResponsavelPeloCadastro());
		setTipo(turma.getTipo());
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	public Funcionario getResponsavelPeloCadastro() {
		return responsavelPeloCadastro;
	}

	public void setResponsavelPeloCadastro(Funcionario responsavelPeloCadastro) {
		this.responsavelPeloCadastro = responsavelPeloCadastro;
	}

	public int getNumTurma() {
		return numTurma;
	}

	public void setNumTurma(int numTurma) {
		this.numTurma = numTurma;
	}

	public char getPeriodo() {
		return periodo;
	}

	public void setPeriodo(char periodo) {
		this.periodo = periodo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQuantidadeMaximaDeAlunos() {
		return quantidadeMaximaDeAlunos;
	}

	public void setQuantidadeMaximaDeAlunos(int quantidadeMaximaDeAlunos) {
		this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	@Override
	public String toString() {
		return "Turma [numTurma=" + numTurma + ", periodo=" + periodo + ", tipo=" + tipo + ", quantidadeMaximaDeAlunos="
				+ quantidadeMaximaDeAlunos + ", escola=" + escola.getNome() + ", professores=" + professores
				+ ", responsavelPeloCadastro=" + responsavelPeloCadastro.getNome() + "]";
	}
	
	
}
