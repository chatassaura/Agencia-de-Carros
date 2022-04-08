package br.com.turmacc.teste;

import br.com.turmacc.modelo.Carro;
import br.com.turmacc.modelo.Gerente;
import br.com.turmacc.modelo.Venda;
import br.com.turmacc.modelo.VendedorNivel1;
import br.com.turmacc.modelo.VendedorNivel2;
import br.com.turmacc.modelo.VendedorNivel3;

public class TesteCriacaoVendedores {

	public static void main(String[] args) {
		
		Carro fox = new Carro("VW", "Fox", "Preto", 50000);
		Carro cobail = new Carro("Chevrolet", "Cobalt", "Preto", 75000);
		Carro mobil = new Carro("Fiat", "Mobil", "Preto", 100000);
		Carro doblo = new Carro("Fiat", "Doblo", "Preto", 15000);
		Carro eco = new Carro("Ford", "Eco", "Preto", 25000);
		

		VendedorNivel1 vendn1 = new VendedorNivel1(2525, "Salom�o", 3450);	
		VendedorNivel2 vendn2 = new VendedorNivel2(2020, "Luana", 4000);
		VendedorNivel3 vendn3 = new VendedorNivel3(1515, "Vitor", 3500);	
		Gerente gerente = new Gerente(1010, "Fernanda Martins", 1500);
		
		
		//----------------------------------------------------------------
		
		Venda[] vendas = new Venda[5];
		vendas[0] = new Venda();
		vendas[0].registrarvenda(vendn1, fox);
		
		vendas[1] = new Venda();
		vendas[1].registrarvenda(vendn1, mobil);
		
		vendas[2] = new Venda();
		vendas[2].registrarvenda(vendn3, cobail);
		
		vendas[3] = new Venda();
		vendas[3].registrarvenda(vendn2, eco);
		
		vendas[4] = new Venda();
		vendas[4].registrarvenda(vendn2, doblo);
		
		
		
		System.out.println("----------------------Relat�rio de Vendas--------------------");
		System.out.println("Vendedor Nivel 1 (Matricula/Nome/Carro/Valor)");
		
		System.out.println(vendas[0].getVendedor().getMatricula() + "/" +
		vendas[0].getVendedor().getNome() + "/" + 
		vendas[0].getCarro().getModelo() + "/" + 
		vendas[0].getCarro().getPreco());
		
		System.out.println("--------------------------------------------------");
		
		System.out.println(vendas[1].getVendedor().getMatricula() + "/" +
		vendas[1].getVendedor().getNome() + "/" + 
		vendas[1].getCarro().getModelo() + "/" + 
		vendas[1].getCarro().getPreco());
		
		
		System.out.println("=============================================");
		System.out.println("Vendedor Nivel 2 (Matricula/Nome/Carro/Valor)");
		
		System.out.println(vendas[3].getVendedor().getMatricula() + "/" +
		vendas[3].getVendedor().getNome() + "/" + 
		vendas[3].getCarro().getModelo() + "/" + 
		vendas[3].getCarro().getPreco());
		
		System.out.println("-----------------------------------------------");
		
		System.out.println(vendas[4].getVendedor().getMatricula() + "/" +
		vendas[4].getVendedor().getNome() + "/" + 
		vendas[4].getCarro().getModelo() + "/" + 
		vendas[4].getCarro().getPreco());
		System.out.println("=============================================");
		
		System.out.println("Vendedor Nivel 3 (Matricula/Nome/Carro/Valor)");
		
		System.out.println(vendas[2].getVendedor().getMatricula() + "/" +
		vendas[2].getVendedor().getNome() + "/" + 
		vendas[2].getCarro().getModelo() + "/" + 
		vendas[2].getCarro().getPreco());
		System.out.println("=============================================");
		
		
		
	
		System.out.println("----------VENDEDOR NIVEL 1---------");
		System.out.println("Matr�cula: " + vendn1.getMatricula());
		System.out.println("Nome: " + vendn1.getNome());
		System.out.println("Sal�rio: " + vendn1.getSalarioBruto());
		System.out.println("Bonifica��o: " + vendn1.calcularBonificacao());
		
		double valorVendas = 0;
		for(int i=0; i< vendas.length; i++) {
			 if(vendn1 == vendas [i].getVendedor()) {
				 valorVendas += vendas[i].getCarro().getPreco();
			 }		
			
		}
		
		System.out.println("Subtotal Vendas =====> " + valorVendas);
		System.out.println("Comiss�o: " + vendn1.calcularComissao(valorVendas));
		System.out.println("Sal�rio + Bonifica��o + Comiss�o: " +
																(vendn1.getSalarioBruto() + vendn1.calcularBonificacao() + vendn1.calcularComissao(valorVendas))	);
			
		System.out.println();
		
		vendn2.setMatricula(2020);
		vendn2.setNome("Pedro Guilhermo");
		vendn2.setSalarioBruto(3000);
		
		
		System.out.println("----------VENDEDOR NIVEL 2---------");
		System.out.println("Matr�cula: " + vendn2.getMatricula());
		System.out.println("Nome: " + vendn2.getNome());
		System.out.println("Sal�rio: " + vendn2.getSalarioBruto());
		System.out.println("Bonifica��o: " + vendn2.calcularBonificacao());
	
		
		valorVendas = 0;
		for(int i=0; i < vendas.length; i ++ ) {
			if(vendn2 == vendas[i].getVendedor())
			{
				valorVendas += vendas[i].getCarro().getPreco();
			}
		}
		System.out.println("Subtotal Vendas =====> " + valorVendas);
		System.out.println("Comiss�o: " + vendn2.calcularComissao(valorVendas));
		System.out.println("Sal�rio + Bonifica��o + Comiss�o: " +
																(vendn2.getSalarioBruto() + vendn2.calcularBonificacao() + vendn2.calcularComissao(valorVendas))	);
		
		System.out.println();
		
		vendn3.setMatricula(2030);
		vendn3.setNome("Flaviana Nunes");
		vendn3.setSalarioBruto(3000);
	
		
		System.out.println("----------VENDEDOR NIVEL 3---------");
		System.out.println("Matr�cula: " + vendn3.getMatricula());
		System.out.println("Nome: " + vendn3.getNome());
		System.out.println("Sal�rio: " + vendn3.getSalarioBruto());
		System.out.println("Bonifica��o: " + vendn3.calcularBonificacao());

		valorVendas = 0;
		for(int i=0; i < vendas.length; i ++ ) {
			if(vendn3 == vendas[i].getVendedor())
			{
				valorVendas += vendas[i].getCarro().getPreco();
			}
		}
		System.out.println("Subtotal Vendas =====> " + valorVendas);
		System.out.println("Comiss�o: " + vendn3.calcularComissao(valorVendas));
		System.out.println("Sal�rio + Bonifica��o + Comiss�o: " +
																(vendn3.getSalarioBruto() + vendn3.calcularBonificacao() + vendn3.calcularComissao(valorVendas))	);
		System.out.println();		
		
		System.out.println("-------------GERENTE------------");
		System.out.println("Matr�cula: " + gerente.getMatricula());
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("Sal�rio: " + gerente.getSalarioBruto());
		System.out.println("Bonifica��o: " + gerente.calcularBonificacao());
		System.out.println("Comiss�o: " + gerente.calcularComissao(Venda.getVendaTotal()));
		System.out.println("Sal�rio + Bonifica��o + Comiss�o: " + (gerente.getSalarioBruto() + gerente.calcularBonificacao () + gerente.calcularComissao(Venda.getVendaTotal())));
		
	}

}
