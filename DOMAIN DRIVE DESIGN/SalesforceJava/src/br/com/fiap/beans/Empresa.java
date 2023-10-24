package br.com.fiap.beans;

public class Empresa {
	// variavel
		private String empresa;
		private String telefone;
		private String cnpj;
		private Endereco endereco;
		private Plano plano;
		
		// construtor metodo vazio
		public Empresa() {
			super();
		}

		// construtor metodo cheio
		public Empresa(String empresa, String telefone, String cnpj) {
			super();
			this.empresa = empresa;
			this.telefone = telefone;
			this.cnpj = cnpj;
		}
		
		
		// getters e setters 
		public String getEmpresa() {
			return empresa;
		}

		public void setEmpresa(String empresa) {
			this.empresa = empresa;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}

		public Endereco getEndereco() {
			return endereco;
		}

		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}

		public Plano getPlano() {
			return plano;
		}

		public void setPlano(Plano plano) {
			this.plano = plano;
		}
}
