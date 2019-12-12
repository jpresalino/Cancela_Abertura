package interfaces;

import java.io.IOException;
import java.util.Scanner;

import modelos.User;

public class Interface_Abertura_Usuario {

	
	public void cadastro_Usuario(Scanner entrada2) throws IOException {
		//leitura para consumir caracter (enter) ou/n
		
		entrada2.nextLine();
		System.out.println("Olá,Vamos começar seu cadastro:");
		System.out.println("Digite seu Nome:");
		String entrada_nome = entrada2.nextLine().toUpperCase();
		// para incerir o telefone
		System.out.println("Digite seu Telefone:");
		String entrada_Telefone = entrada2.nextLine().toUpperCase();
		// para incerir o veiculo
		System.out.println("Digite o Modelo do seu Veiculo:");
		String entrada_Modelo = entrada2.nextLine().toUpperCase();
		// para incerir a placa
		System.out.println("Digite a Placa do seu Veiculo:");
		String entrada_Veiculo = entrada2.nextLine().toUpperCase();

		// criando um objeto User

		User user = new User();
		user.setId("Usuario:");
		// Colocar nome do usuario
		user.setNome("Nome: " + entrada_nome);
		// incerir telefone
		user.setTelefone("Telefone: " + entrada_Telefone);
		// Se é carro ou moto
		user.setObservacao("Veiculo: " + entrada_Modelo);
		// colocar a placa do carro ou da moto
		user.setPlaca("Placa: " + entrada_Veiculo);

		FileTestUser.escrever(user);
		
		
	}
	
	public void listar() {
		FileTestUser.ler();
	}
	
	
	
}