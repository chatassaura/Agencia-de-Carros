package br.com.turmacc.modelo;

import br.com.turmacc.util.AutenticadorUtil;

public class VendedorNivel1 extends Vendedor implements Autenticavel {

	
	private AutenticadorUtil autenticador;
	
	public VendedorNivel1(int matricula, String nome, double salarioBruto) {
		super(matricula, nome, salarioBruto);
		this.autenticador = new AutenticadorUtil();
	}
	
	public int getSenha() {
		return this.autenticador.getSenha();
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
		
	@Override
	public double calcularComissao(double valorVendas) {
		return valorVendas * 0.01;
	}
	
	
}
