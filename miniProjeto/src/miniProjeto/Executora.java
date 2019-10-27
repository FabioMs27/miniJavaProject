package miniProjeto;

import java.util.ArrayList;

public class Executora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		Cardapio cardapio = new Cardapio();
		Garcom garcom1 = new Garcom("Brother", "1");
		Garcom garcom2 = new Garcom("Emílio", "2");
		Garcom garcom3 = new Garcom("Joana", "3");
		Garcom garcom;
		Cozinheiro cozinheiro = new Cozinheiro("Felícia", "4");
		Manager manager = new Manager("Drixx", "5");
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(manager);
		funcionarios.add(garcom1);
		funcionarios.add(garcom2);
		funcionarios.add(garcom3);
		funcionarios.add(cozinheiro);
		do {
			opcao =  View.getInteger("Menu", "1 - Cadastrar Comida\n"
					+ "2 - Vender\n"
					+ "3 - Relatório Financeiro\n"
					+ "4 - Sortear Funcionário\n"
					+ "5 - Sair");
			switch (opcao) {
			case 1:
				//Chamar o processo de cadastrar a comida da Ultis
				cardapio.addComida(Utils.criarComida(cozinheiro));
				break;
			case 2:
				//Fazer o processo de venda
				garcom = Utils.escolherGarcom(funcionarios);
				if(garcom.getId() == "1" || garcom.getId() == "2" || garcom.getId() == "3")
					Utils.criarVendas(garcom, cardapio);
				else
					View.getError("Error", "Garcom inválido");
				break;
			case 3:
				//Gerar o relátorio
				Utils.getManagerId(manager);
				break;
			case 4:
				//Sortear o funcionário do mês
				View.getAfirmative("Funcionário do mês", funcionarios.get(Utils.getRandomDoubleBetweenRange(0, 4)).toString());
				break;
			case 5:
				opcao = 0;
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
			
		} while (opcao != 0);
		
	}

}
