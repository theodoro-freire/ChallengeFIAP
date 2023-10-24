package br.com.fiap.beans;

public class Plano {
	// variavel
		private String nome;
		private double valor;
		private int tempo;
		
		// construtor metodo vazio
		public Plano() {
			super();
		}

		// construtor metodo cheio
		public Plano(String nome, double valor, int tempo) {
			super();
			this.nome = nome;
			this.valor = valor;
			this.tempo = tempo;
		}

		
		// getters e setters
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public int getTempo() {
			return tempo;
		}

		public void setTempo(int tempo) {
			this.tempo = tempo;
		}
		
		

}
