package br.com.turmacc.teste;

import br.com.turmacc.modelo.Gerente;
import br.com.turmacc.modelo.Parceiro;
import br.com.turmacc.modelo.VendedorNivel1;
import br.com.turmacc.sistema.SistemaInterno;

public class TesteSistemaInterno {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente(3010, "Domenico George", 6500);
		gerente.setSenha(1234);
		
		VendedorNivel1 vendedorNivel1 = new VendedorNivel1(2010, "Francisco Lopes", 3000);
		vendedorNivel1.setSenha(1234);
		
		Parceiro parceiro = new Parceiro();
		parceiro.setSenha(1234);
		
		SistemaInterno si = new SistemaInterno();
		si.loginRestrito(gerente);
		si.loginRestrito(vendedorNivel1);
		si.loginRestrito(parceiro);
	}

}
