package br.com.fiap.beans;

public class Endereco {
	//variavel
		private String logradouro;
		private String cidade;
		private String pais;
		private String estado;
		private String bairro;
		private String pontoref;
		private int numero;
		private int cep;
		
		// construtor metodo vazio
		public Endereco() {
			super();
		}

		// construtor metodo cheio
		public Endereco(String logradouro, String cidade, String pais, String estado, String bairro, String pontoref, int numero, int cep) {
			super();
			this.logradouro = logradouro;
			this.cidade = cidade;
			this.pais = pais;
			this.estado = estado;
			this.bairro = bairro;
			this.pontoref = pontoref;
			this.numero = numero;
			this.cep = cep;
		}

		
		// getters e setters
		public String getLogradouro() {
			return logradouro;
		}

		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getPais() {
			return pais;
		}

		public void setPais(String pais) {
			this.pais = pais;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

		public String getPontoref() {
			return pontoref;
		}

		public void setPontoref(String pontoref) {
			this.pontoref = pontoref;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public int getCep() {
			return cep;
		}

		public void setCep(int cep) {
			this.cep = cep;
		}
}
