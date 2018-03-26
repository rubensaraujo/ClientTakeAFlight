package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.CadastrarUsuario;

public class TelaPrincipal {
	
	CadastrarUsuario cadastrarUsuario = new CadastrarUsuario();
	
	
	public int tela() {
		System.out.println("TakeAFlight - Sistema de reserva de passagens Aereas v0.1");
		System.out.print("\n\n\n");
		System.out.println("1 - Crie seu cadastro");
		System.out.println("2 - Já sou cadastrado");
		List<String> form = new ArrayList<String>();
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
			
			System.out.println("Confira seu cadastro\n");
			System.out.println("Nome: " + nome);
			System.out.println("Sobrenome: " + sobrenome);
			System.out.println("Data de Nascimento: " + dataNascimento);
			System.out.println("CPF: " + cpf);
			//System.out.println("Nome: " + nome);
			System.out.println("\n\n");
			System.out.println("Confirma? 1- Sim 2- Não");
			int confirma = in.nextInt();
			if(confirma == 1) {
				form.add(nome);
				form.add(sobrenome);
				form.add(dataNascimento);
				form.add(cpf);
				form.add(senha);
				
				in.close();
				cadastrarUsuario.cadastrarUser(form);
				//return 1;
			}
		}
		else if(option == 2) {
			System.out.println("TakeAFlight - Sistema de reserva de passagens Aereas v0.1");
			System.out.print("\n\n\n");
			System.out.println("Login de Usuario");
			System.out.print("\n\n");
			
			System.out.println("CPF: ");
			String cpfL = in.next();
			System.out.println("Senha: ");
			String senhaL = in.next();
			in.close();
			return 1;
		}
		in.close();
		return 0;
	}

	

}
