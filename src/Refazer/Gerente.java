package Refazer;

import java.math.*;
import java.time.LocalDate;

public class Gerente extends Funcionario {

	public Gerente(String nome, LocalDate dataAdmissao, BigDecimal salario) {
		super(nome, dataAdmissao, salario);
	}

	public void AumentoSalarial (double aumento) {
		setSalario(getSalario() new BigDecimal(getSalario()).multiply(new BigDecimal("0.1")));;
	
	
	}
}