package view;

import java.util.Scanner;

public class TelaPrincipal {
	
	
	
	
	public void tela() {
		System.out.println("TakeAFlight - Sistema de reserva de passagens Aereas v0.1");
		System.out.print("\n\n\n");
		System.out.println("1 - Crie seu cadastro");
		System.out.println("2 - Já sou cadastrado");
		Scanner in = new Scanner(System.in);
		int option = in.nextInt();
		
		if(option == 1) {
			System.out.println("TakeAFlight - Sistema de reserva de passagens Aereas v0.1");
			System.out.print("\n\n\n");
			System.out.println("Cadastro de Usuario");
			System.out.print("\n\n");
			
			System.out.print("Nome: ");
			String nome = in.next();
			
			System.out.print("Sobrenome: ");
			String sobrenome = in.next();
			
			System.out.print("Data de Nascimento (DD-MM-AAAA): ");
			String dataNascimento = in.next();
			
			System.out.print("CPF: ");
			String cpf = in.next();
			
			System.out.print("Senha: ");
			String senha = in.next();
		
		}
		else if(option == 2) {
			System.out.println("TakeAFlight - Sistema de reserva de passagens Aereas v0.1");
			System.out.print("\n\n\n");
			System.out.println("Login");
			System.out.print("\n\n");
			
			
		}
	}

	

}
