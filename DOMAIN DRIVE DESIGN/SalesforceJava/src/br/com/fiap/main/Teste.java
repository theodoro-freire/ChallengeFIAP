package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Plano;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			// String nome, String cargo, String email, String telefone
			Cliente objCliente = new Cliente(
					JOptionPane.showInputDialog("Digite seu nome: "),
					JOptionPane.showInputDialog("Digite seu cargo: "),
					JOptionPane.showInputDialog("Digite seu email: "),
					JOptionPane.showInputDialog("Digite um telefone de contato: "));
			
			// String empresa, String telefone, String cnpj
			Empresa objEmpresa = new Empresa(
					JOptionPane.showInputDialog("Digite o nome da empresa: "),
					JOptionPane.showInputDialog("Digite um telefone para contato: "),
					JOptionPane.showInputDialog("Digite o CNPJ: "));
			
			
			
			// String logradouro, String cidade, String pais, String estado, String bairro, String pontoref, int numero, int cep
			Endereco objEndereco = new Endereco(
					JOptionPane.showInputDialog("Digite o Logradouro: "),
					JOptionPane.showInputDialog("Digite a Cidade: "),
					JOptionPane.showInputDialog("Digite o País: "),
					JOptionPane.showInputDialog("Digite o Estado: "),
					JOptionPane.showInputDialog("Digite o Bairro: "),
					JOptionPane.showInputDialog("Digite um ponto de referencia: "),
					Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: ")),
					Integer.parseInt(JOptionPane.showInputDialog("Digite o CEP: ")));
			
			// String nome, double valor, int tempo
			Plano objPlano = new Plano(JOptionPane.showInputDialog("Digite o nome do plano: "),
					Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do plano: ")),
					Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo do plano (Meses): ")));
					
			objEmpresa.setEndereco(objEndereco);
			objCliente.setEmpresa(objEmpresa);
			
			
			System.out.println("Nome: " + objCliente.getNome()
			+ "\nCargo: " + objCliente.getCargo()
			+ "\nEmail: " + objCliente.getEmail()
			+ "\nTelefone: " + objCliente.getTelefone()
			
			+ "\n\nNome da empresa: " + objCliente.getEmpresa().getEmpresa()
			+ "\nTelefone empresa: " + objCliente.getEmpresa().getTelefone()
			+ "\nCNPJ: " + objCliente.getEmpresa().getCnpj()
			
			+"\n\nLogradouro: " + objEmpresa.getEndereco().getLogradouro()
			+"\nCidade: " + objEmpresa.getEndereco().getCidade()
			+"\nPaís: " + objEmpresa.getEndereco().getPais()	
			+"\nEstado: " + objEmpresa.getEndereco().getEstado()
			+"\nBairro: " + objEmpresa.getEndereco().getBairro()
			+"\nPonto de referencia: " + objEmpresa.getEndereco().getPontoref()
			+"\nNumero: " + objEmpresa.getEndereco().getNumero()
			+"\nCEP: " + objEmpresa.getEndereco().getCep()
			
			+"\n\nNome do Plano: " + objPlano.getNome()
			+"\nValor do plano: " + objPlano.getValor()
			+"\nTempo do plano: " + objPlano.getTempo());
			
		}	
	}

