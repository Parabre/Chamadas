package controller;

import model.Fila;

public class TelefoneController {

	
	public void insereLigacao(Fila f,String numeroTelefone) {
		 f.insert(numeroTelefone);
		 System.out.println("N�mero "+ numeroTelefone + " adicionado com sucesso!");
	}
	
	public void consultaLigacoes(Fila f) throws Exception {
		if(f.isEmpty()) throw new Exception("N�o existem liga��es perdidas");
		
		int count = 1;
		while(!f.isEmpty()) {
			System.out.println("\n"+ count++ +"�- " + f.remove());
		}
		
	}
}
