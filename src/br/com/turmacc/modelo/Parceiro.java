package br.com.turmacc.modelo;

import br.com.turmacc.util.AutenticadorUtil;

public class Parceiro implements Autenticavel {

		private AutenticadorUtil autenticador;
		
		public Parceiro() {
			this.autenticador = new AutenticadorUtil();
		}
		
		@Override
		public int getSenha() {
			return this.autenticador.getSenha();
		}
		
		@Override
		public void setSenha(int senha) {
			this.autenticador.setSenha(senha);
		}
}
