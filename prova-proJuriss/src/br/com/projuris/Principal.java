package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		MyFindArray findArrayClass = new MyFindArray();
		MyFindChar myFindChar = new MyFindChar();
		MyCalculo myCalculo = new MyCalculo();
		
		int[] array = {1, 3, 5};
		int[] subArray = {1};
		String word = "stress";
		
		int result1 = findArrayClass.findArray(array, subArray);
		char result2 = myFindChar.findChar(word);
		
		System.out.println("Questão 1: " + result1);
		System.out.println("Questão 2: " + result2);
		
		Funcionario funcionario1 = new Funcionario("Assistente", "Administrativo", new BigDecimal(1000.0));
		Funcionario funcionario2 = new Funcionario("Gerente", "Administrativo", new BigDecimal(7000.70));
		Funcionario funcionario3 = new Funcionario("Diretor", "Administrativo", new BigDecimal(10000.45));
		Funcionario funcionario4 = new Funcionario("Assistente", "Financeiro", new BigDecimal(1300.9));
		Funcionario funcionario5 = new Funcionario("Gerente", "Financeiro", new BigDecimal(7500));
		Funcionario funcionario6 = new Funcionario("Diretor", "Financeiro", new BigDecimal(11000.0));
		Funcionario funcionario7 = new Funcionario("Estagiário", "Jurídico", new BigDecimal(700.4));
		Funcionario funcionario8 = new Funcionario("Assistente", "Jurídico", new BigDecimal(1800.90));
		Funcionario funcionario9 = new Funcionario("Gerente", "Jurídico", new BigDecimal(9500.50));
		Funcionario funcionario10 = new Funcionario("Diretor", "Jurídico", new BigDecimal(13000.0));
		List<Funcionario> listaFuncionario = new ArrayList<>();
		listaFuncionario.add(funcionario1);
		listaFuncionario.add(funcionario2);
		listaFuncionario.add(funcionario3);
		listaFuncionario.add(funcionario4);
		listaFuncionario.add(funcionario5);
		listaFuncionario.add(funcionario6);
		listaFuncionario.add(funcionario7);
		listaFuncionario.add(funcionario8);
		listaFuncionario.add(funcionario9);
		listaFuncionario.add(funcionario10);

		List<CustoCargo> result3  = myCalculo.custoPorCargo(listaFuncionario);
		List<CustoDepartamento> result4  = myCalculo.custoPorDepartamento(listaFuncionario);
		
		System.out.println("------------------ CUSTO POR CARGO ------------------");
		for(CustoCargo item : result3){
			System.out.println(item.getCargo() + ": " + item.getCusto());
		}
		
		System.out.println("------------------ CUSTO POR DEPAR ------------------");
		for(CustoDepartamento item : result4){
			System.out.println(item.getDepartamento() + ": " + item.getCusto());
		}
	}
}
