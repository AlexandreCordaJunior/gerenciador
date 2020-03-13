package br.com.gerenciador.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Solicitacao extends GenericDomain<Solicitacao> {
	
	@Column(nullable = false, length = 127)
	private String nomeDoAluno;
	@Column
	private Date datadeNascimento;
	@Column(length = 1)
	private char sexo;
	@Column(nullable = false, length = 15)
	private String cpfDoResponsavel;
	@Column(nullable = false, length = 127)
	private String nomeDoResponsavel;
	@Column(nullable = false, length = 255)
	private String enderecoDoResponsavel;
	@Column(nullable = false, length = 255)
	private String telefoneDoResponsavel;
	@ManyToOne
	@JoinColumn(nullable = false)
	private Turma turma;
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	@Column
	private char periodo;
	@Column
	private Date dataDeInscricao;
	@Column(nullable = false, length = 255)
	private String emailDoResponsavel;
	@ManyToOne
	@JoinColumn(nullable = false)
	private Funcionario responsavelPeloCadastro;
	
	public void setEntidade(Solicitacao sol) {
		setCpfDoResponsavel(sol.getCpfDoResponsavel());
		setDataDeInscricao(sol.getDataDeInscricao());
		setDatadeNascimento(sol.getDatadeNascimento());
		setEmailDoResponsavel(sol.getEmailDoResponsavel());
		setEnderecoDoResponsavel(sol.getEnderecoDoResponsavel());
		setEstado(sol.getEstado());
		setNomeDoAluno(sol.getNomeDoAluno());
		setNomeDoResponsavel(sol.getNomeDoResponsavel());
		setPeriodo(sol.getPeriodo());
		setResponsavelPeloCadastro(sol.getResponsavelPeloCadastro());
		setSexo(sol.getSexo());
		setTelefoneDoResponsavel(sol.getTelefoneDoResponsavel());
		setTurma(sol.getTurma());
	}
	
	public String getNomeDoAluno() {
		return nomeDoAluno;
	}
	public void setNomeDoAluno(String nomeDoAluno) {
		this.nomeDoAluno = nomeDoAluno;
	}
	public Date getDatadeNascimento() {
		return datadeNascimento;
	}
	public void setDatadeNascimento(Date datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getCpfDoResponsavel() {
		return cpfDoResponsavel;
	}
	public void setCpfDoResponsavel(String cpfDoResponsavel) {
		this.cpfDoResponsavel = cpfDoResponsavel;
	}
	public String getNomeDoResponsavel() {
		return nomeDoResponsavel;
	}
	public void setNomeDoResponsavel(String nomeDoResponsavel) {
		this.nomeDoResponsavel = nomeDoResponsavel;
	}
	public String getEnderecoDoResponsavel() {
		return enderecoDoResponsavel;
	}
	public void setEnderecoDoResponsavel(String enderecoDoResponsavel) {
		this.enderecoDoResponsavel = enderecoDoResponsavel;
	}
	public String getTelefoneDoResponsavel() {
		return telefoneDoResponsavel;
	}
	public void setTelefoneDoResponsavel(String telefoneDoResponsavel) {
		this.telefoneDoResponsavel = telefoneDoResponsavel;
	}
	
	public char getPeriodo() {
		return periodo;
	}
	public void setPeriodo(char periodo) {
		this.periodo = periodo;
	}
	public Date getDataDeInscricao() {
		return dataDeInscricao;
	}
	public void setDataDeInscricao(Date dataDeInscricao) {
		this.dataDeInscricao = dataDeInscricao;
	}
	public String getEmailDoResponsavel() {
		return emailDoResponsavel;
	}
	public void setEmailDoResponsavel(String emailDoResponsavel) {
		this.emailDoResponsavel = emailDoResponsavel;
	}
	public Funcionario getResponsavelPeloCadastro() {
		return responsavelPeloCadastro;
	}
    
	public void setResponsavelPeloCadastro(Funcionario responsavelPeloCadastro) {
		this.responsavelPeloCadastro = responsavelPeloCadastro;
	
	}
	@Override
	public String toString() {
		return "Solicitacao [nomeDoAluno=" + nomeDoAluno + ", datadeNascimento=" + datadeNascimento + ", sexo=" + sexo
				+ ", cpfDoResponsavel=" + cpfDoResponsavel + ", nomeDoResponsavel=" + nomeDoResponsavel
				+ ", enderecoDoResponsavel=" + enderecoDoResponsavel + ", telefoneDoResponsavel="
				+ telefoneDoResponsavel + ", turma=" + turma + ", periodo=" + periodo + ", dataDeInscricao="
				+ dataDeInscricao + ", emailDoResponsavel=" + emailDoResponsavel + ", responsavelPeloCadastro="
				+ responsavelPeloCadastro.getNome() + "]";
	}
	
	
}


