package view;

import javax.swing.JOptionPane;

import controller.TelefoneController;
import model.Fila;

public class Principal {

	public static void main(String[] args) throws Exception {
		TelefoneController controller = new TelefoneController();
		Fila fila = new Fila();

		boolean exibeMenu = true;
		while (exibeMenu) {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das op��es \n "
					+ "1- Inserir n�meros \n 2- Consultar chamadas perdidas" + "\n 3- Sair"));
			
			switch (opcao) {
			case 1:
				String numero = String.valueOf(JOptionPane.showInputDialog(null, "Digite um n�mero para adicionar"));
				controller.insereLigacao(fila, numero);
				break;
			case 2:
				controller.consultaLigacoes(fila);
				break;
			case 3:
				exibeMenu = false;
				break;
			default:
				System.err.println("Escolha uma op��o entre 1 a 3");
				break;
			}
		}

	}
}
