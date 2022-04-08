package br.com.turmacc.modelo;

public class Venda {
	
	//Propriedades e Atributos Generico
	private Vendedor vendedor;
	private Carro carro;
	private static double vendaTotal;
	
	//Metodo para Registrar Vendas Generico
	public void registrarvenda(Vendedor vendedor, Carro carro) {
		this.vendedor = vendedor;
		this.carro = carro;
		Venda.vendaTotal += carro.getPreco();
	}
		
	
	
	// Metodos Gets 

	public Vendedor getVendedor() {
		return vendedor;
	}
	public Carro getCarro() {
		return carro;
	}
	public static double getVendaTotal() {
		return vendaTotal;
	}	
}
