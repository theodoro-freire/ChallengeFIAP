package br.com.fiap.beans;

public class Cliente {
	//variaveis
	
		private String nome;
		private String cargo;
		private String email;
		private String telefone;
		private Empresa empresa;
		
		
		// construtor metodo vazio
		public Cliente() {
			super();
		}


		// construtor metodo cheio	
		public Cliente(String nome, String cargo, String email, String telefone) {
			super();
			this.nome = nome;
			this.cargo = cargo;
			this.email = email;
			this.telefone = telefone;
		}

		

		//getters e setters
		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getCargo() {
			return cargo;
		}


		public void setCargo(String cargo) {
			this.cargo = cargo;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getTelefone() {
			return telefone;
		}


		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}


		public Empresa getEmpresa() {
			return empresa;
		}


		public void setEmpresa(Empresa empresa) {
			this.empresa = empresa;
		}
}
