package controller;

//import java.util.Date;
//import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class CadastrarUsuario {
	Usuario user = new Usuario();
	//Date date = new Date();
	int count = 0;
	
	public void cadastrarUser(List<String> form) {
		user.setId(count + 1);
		user.setNome(form.get(0));
		user.setSobrenome(form.get(1));
		//date.
		//user.setDataNascimento(date);
		user.setCpf(form.get(3));
		user.setSenha(form.get(4));
		
	}
}
