package br.com.turmacc.modelo;

public class Carro {
	//propiedades
	private String marca;
	private String modelo;
	private String cor;
	private double preco;
	
	//Construtor com Campos
	public Carro(String marca, String modelo, String cor, double salarioBruto) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.preco = salarioBruto;
	}
	
	//metofos get e setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
