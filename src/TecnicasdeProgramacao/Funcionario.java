package TecnicasdeProgramacao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Funcionario {
	private String nomeFunc;
	private LocalDate dataContratacao;
	private BigDecimal salario;

	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	
	  public Funcionario(String nomeFunc,LocalDate data, BigDecimal salario) {
	  super(); 
	  this.nomeFunc = nomeFunc; 
	  this.dataContratacao = data; 
	  this.salario = salario;
	 
}
	

}
