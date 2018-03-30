package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyCalculo implements Calculo{

	@Override
	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {
		List<CustoCargo> custoCargoList = new ArrayList<CustoCargo>();
		List<String> cargoList = funcionarios.stream().map(Funcionario :: getCargo).distinct().collect(Collectors.toList());;
		
		for(String cargo : cargoList){
			CustoCargo custoCargo = new CustoCargo();
			Double custo = 0.0;
			
			custoCargo.setCargo(cargo);
			List<Funcionario> funcionariosCargo = funcionarios.stream().filter(x -> x.getCargo() == cargo).collect(Collectors.toList());
		
			for(Funcionario funcionario : funcionariosCargo){
				custo += funcionario.getSalario().doubleValue();
			}
			custoCargo.setCusto(new BigDecimal(custo));
			custoCargoList.add(custoCargo);
		}
		
		return custoCargoList;
	}

	@Override
	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios) {
		List<CustoDepartamento> custoDepartamentoList = new ArrayList<CustoDepartamento>();
		List<String> departamentoList = funcionarios.stream().map(Funcionario :: getDepartamento).distinct().collect(Collectors.toList());;
		
		for(String departamento : departamentoList){
			CustoDepartamento custoDepartamento = new CustoDepartamento();
			Double custo = 0.0;
			
			custoDepartamento.setDepartamento(departamento);
			List<Funcionario> funcionariosCargo = funcionarios.stream().filter(x -> x.getDepartamento() == departamento).collect(Collectors.toList());
		
			for(Funcionario funcionario : funcionariosCargo){
				custo += funcionario.getSalario().doubleValue();
			}
			custoDepartamento.setCusto(new BigDecimal(custo));
			custoDepartamentoList.add(custoDepartamento);
		}
		return custoDepartamentoList;
	}

}
