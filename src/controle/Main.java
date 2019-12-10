package controle;

import java.io.IOException;
import java.util.Scanner;
import interfaces.FileTestUser;
import modelos.User;

public class Main {
	public static void main(String[] args) {
	System.out.println("digite 'V' para validar");
	System.out.println("digite 'C' para cadastrar");
	
    	Scanner entrada = new Scanner(System.in);
    	
    	char opcao = entrada.next().toUpperCase().toCharArray()[0];
    	
    	switch (opcao) {
    	
    	case 'V':
    		Scanner entrada1 = new Scanner(System.in);
    		String entrada_usuario;
    		System.out.println("Olá, Digite o seu nome ou sua placa ");
          entrada_usuario = entrada1.nextLine().toUpperCase();
          System.out.println (entrada_usuario);
    		break;
    	case 'C':
    	//colocar cadastro
    	break;
    	default:
    	System.out.println("Opção Invalida. Digite novamente");	
    	
    	
    	
    	
    	
    	
		
	}

	}
}
