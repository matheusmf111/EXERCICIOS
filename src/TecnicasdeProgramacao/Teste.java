package TecnicasdeProgramacao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Teste {

	public static void main(String[] args) {
		
		
		/*LocalDate date = new LocalDate('16/05/1994');*/
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		LocalDate data = LocalDate.parse("12/09/2017", formato);
		
		BigDecimal calc = new BigDecimal(10000);
		calc.add(new BigDecimal(0));
		
		Funcionario func = new Funcionario("Matheus de Moura Freitas", data, calc);
		
		
		//Obter valores de funcionarios.
		System.out.println("---------------------");
		System.out.println("Nome do Funcionario: " + func.getNomeFunc());
		System.out.println("Data da Contratação: " + func.getDataContratacao());
		System.out.println("Salario: " + func.getSalario());
		System.out.println("aumento" );
		System.out.println("--------------------");
		
		
		
	}
}
