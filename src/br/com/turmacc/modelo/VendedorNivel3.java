package br.com.turmacc.modelo;

public class VendedorNivel3 extends Vendedor {

	public VendedorNivel3(int matricula, String nome, double salarioBruto) {
		super(matricula, nome, salarioBruto);
	}

	@Override
	public double calcularComissao(double valorVendas) {
		return valorVendas * 0.004;
	}
}
