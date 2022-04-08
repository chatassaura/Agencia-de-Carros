package br.com.turmacc.modelo;

public abstract class Funcionario {

	//Propriedades e atributos
	protected int matricula;
	protected String nome;
	protected  double salarioBruto;
	
	//Método Calculo da bonificação
	public double calcularBonificacao() {
		return this.salarioBruto * 0.05;
	}
	
	//Sobrescrevendo o metodo tostring() de object
	@Override
	public String toString() {
		
		String funcionarioPadrao = "Matrícula: " + this.matricula +
									"\nNome: " + this.nome +
									"\nSalário Bruto: " + this.salarioBruto + 
									"\nBonificação: " + this.calcularBonificacao();
		return funcionarioPadrao;
	}
	
	//Metodos getters e setters
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
}
