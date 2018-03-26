package app;

import view.TelaBuscaVoos;
import view.TelaPrincipal;
import view.TelaReservas;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelaPrincipal app = new TelaPrincipal();
		TelaReservas reservas = new TelaReservas();
		TelaBuscaVoos busca = new TelaBuscaVoos();
		int a = app.tela();
		if(a == 1) {
			busca.buscaVoos();
		}
	}

}
