package controle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import interfaces.FileTestUser;
import interfaces.Interface_Abertura_Usuario;
import modelos.User;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("digite 'L' para Liberar Sua entrada");
		System.out.println("digite 'C' para cadastrar um novo Usuário");

		Scanner entrada = new Scanner(System.in);
		Interface_Abertura_Usuario interfac_usuario = new Interface_Abertura_Usuario();

		char opcao = entrada.next().toUpperCase().toCharArray()[0];

		switch (opcao) {
		// para quesquisar no banco de dados
		case 'L':
			/*
			 * String verificplaca; String entrada_usuario;
			 * System.out.println("Olá, Digite sua placa "); entrada_usuario =
			 * entrada.nextLine().toUpperCase(); System.out.println(entrada_usuario); //
			 * verificar se o codigo esta funcionando ate aqui
			 */
			interfac_usuario.listar();

		case 'C':
			// Criar cadastro
			// para incerir o nomec
			interfac_usuario.cadastro_Usuario(entrada);
			break;
		default:
			System.out.println("Opção Invalida. Digite novamente");

			// Chamando o método escrever e passando user como parâmetro

		}

	}
}
