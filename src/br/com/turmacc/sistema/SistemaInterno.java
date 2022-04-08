package br.com.turmacc.sistema;

import br.com.turmacc.modelo.Autenticavel;

public class SistemaInterno {
	public void loginRestrito(Autenticavel vendedor) {
		if(vendedor.getSenha() == 1234) {
			System.out.println("ACESSSO PERMITIDO \nSeja Bem Vindo !!!");
		}else {
			System.out.println("ACESSO NEGADO!");
		}
	}
}
