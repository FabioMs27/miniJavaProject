package miniProjeto;

public class Executora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		Cardapio cardapio = new Cardapio();
		Garcom garcom1 = new Garcom("Brother", "001");
		Garcom garcom2 = new Garcom("Emílio", "002");
		Garcom garcom3 = new Garcom("Joana", "003");
		Cozinheiro cozinheiro = new Cozinheiro("Felícia", "004");
		Manager manager = new Manager("Drixx", "005");
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
				Utils.criarVendas(garcom1, cardapio);
				break;
			case 3:
				//Gerar o relátorio
				break;
			case 4:
				//Sortear o funcionário do mês
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
