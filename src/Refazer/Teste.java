package Refazer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data = LocalDate.parse("09/07/2016", formato);

		BigDecimal calc = new BigDecimal(4500);
		calc.add(new BigDecimal(0));

		Funcionario func = new Funcionario("Matheus Freitas", data, calc);

		System.out.println("//////////////////////////////////////");
		System.out.println("Nome do Funcionario: " + func.getNome());
		System.out.println("Data de Admissao: " + func.getDataAdmissao());
		System.out.println("Salário: R$" + func.getSalario());
		System.out.println("//////////////////////////////////////");

		Gerente gen = new Gerente("lucio", data, calc);

		System.out.println();

	}

}
