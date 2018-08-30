package Refazer;

//imports
import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {
	private String nome;
	private LocalDate dataAdmissao;
	private BigDecimal salario;

	// get & set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	// construtor
	public Funcionario(String nome, LocalDate data, BigDecimal salario) {
		super();
		this.nome = nome;
		this.dataAdmissao = data;
		this.salario = salario;
	}
}
