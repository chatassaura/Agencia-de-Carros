package br.com.turmacc.modelo;

public abstract class Funcionario {

	//Propriedades e atributos
	protected int matricula;
	protected String nome;
	protected  double salarioBruto;
	
	//M�todo Calculo da bonifica��o
	public double calcularBonificacao() {
		return this.salarioBruto * 0.05;
	}
	
	//Sobrescrevendo o metodo tostring() de object
	@Override
	public String toString() {
		
		String funcionarioPadrao = "Matr�cula: " + this.matricula +
									"\nNome: " + this.nome +
									"\nSal�rio Bruto: " + this.salarioBruto + 
									"\nBonifica��o: " + this.calcularBonificacao();
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
