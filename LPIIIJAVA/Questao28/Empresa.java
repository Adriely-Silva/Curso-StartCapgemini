package Questao28;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private List<Funcionario> lista;
	
	private Double salarioMinimo;

	public Empresa() {
		super();
		this.lista = new ArrayList<>();
	}

	public Double getSalarioMinimo() {
		return salarioMinimo;
	}

	public void setSalarioMinimo(Double salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}
	
	public List<Funcionario> getLista() {
		return lista;
	}

	public void cadastrarFuncionario(Funcionario funcionario) {
		lista.add(funcionario);
	}
	
	public void reajustarSalarios() {
		for (Funcionario funcionario : lista) {
			funcionario.setReajuste(getReajuste(funcionario));
		}
	}
	
	public Double getQuantidadeSalariosMinimos(Funcionario funcionario) {
		Double quantidade = funcionario.getSalario() / getSalarioMinimo();
		return Math.floor(quantidade);
	}
	
	public Double getPorcentagemReajusteSalario(Funcionario funcionario) {
		Double quantidadeSalario = getQuantidadeSalariosMinimos(funcionario);
		Double reajuste;
		if (quantidadeSalario < 3) {
			reajuste = 0.50;
		} else if ((quantidadeSalario >= 3) && (quantidadeSalario <= 10)) {
			reajuste = 0.20;
		} else if ((quantidadeSalario > 10) && (quantidadeSalario <= 20)) {
			reajuste = 0.15;
		} else {
			reajuste = 0.10;
		}	
		return reajuste;
	}
	
	public Double getReajuste(Funcionario funcionario) {
		Double porcentagem = getPorcentagemReajusteSalario(funcionario);
		return funcionario.getSalario() * porcentagem;
	}
	
	public Double getAumentoFolha() {
		Double somaAntigos = 0.0;
		Double somaNovos = 0.0;
		for (Funcionario funcionario : lista) {
			somaAntigos += funcionario.getSalario();
			somaNovos += funcionario.getSalarioNovo();
		}
		return somaNovos - somaAntigos;
	}
	
	@Override
	public String toString() {
		String texto = "[Empresa]\n";
		for (Funcionario funcionario : lista) {
			texto += funcionario.toString() + "\n";
		}
		texto += "Aumento da folha de pagamento" + getAumentoFolha();
		return texto;
	}
}
