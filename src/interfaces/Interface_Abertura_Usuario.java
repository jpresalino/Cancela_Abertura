package interfaces;

import java.io.IOException;
import java.util.Scanner;

import modelos.User;

public class Interface_Abertura_Usuario extends FileTestUser {
	public static void main(String[] args) throws IOException {
		// criando um objeto User
		User user = new User();
		user.setId("Usuario:");
		// Colocar nome do usuario
		user.setNome("Nome: " + "Bla bla ");
		// incerir telefone
		user.setTelefone("Telefone: " + "48-99119-8934");
		// Se é carro ou moto
		user.setObservacao("Veiculo: " + "Carro");
		// colocar a placa do carro ou da moto
		user.setPlaca("Placa: " + "PQP1234");

       //Chamando o método escrever e passando user como parâmetro

		FileTestUser.escrever(user);

	}
}