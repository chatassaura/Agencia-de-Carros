package br.com.turmacc.modelo;

//o extends transforma a classe em filha da classe que quiser,como nessa classe 
public abstract class Vendedor extends Funcionario {

	public Vendedor(int matricula, String nome, double salarioBruto) {
		super.matricula = matricula;
		super.nome = nome;
		super.salarioBruto = salarioBruto;
		
	}
	
	public abstract double calcularComissao(double valorVendas);
}
