package controller;

import model.Fila;

public class TelefoneController {

	
	public void insereLigacao(Fila f,String numeroTelefone) {
		 f.insert(numeroTelefone);
		 System.out.println("Número "+ numeroTelefone + " adicionado com sucesso!");
	}
	
	public void consultaLigacoes(Fila f) throws Exception {
		if(f.isEmpty()) throw new Exception("Não existem ligações perdidas");
		
		int count = 1;
		while(!f.isEmpty()) {
			System.out.println("\n"+ count++ +"°- " + f.remove());
		}
		
	}
}
