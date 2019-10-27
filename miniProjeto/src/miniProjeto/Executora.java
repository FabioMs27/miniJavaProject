package miniProjeto;

public class Executora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		Cardapio cadarpio = new Cardapio();
		do {
			opcao =  View.getInteger("Menu", "1 - Cadastrar Comida\n"
					+ "2 - Vender\n"
					+ "3 - Relatório Financeiro\n"
					+ "4 - Sortear Funcionário\n"
					+ "5 - Sair");
			switch (opcao) {
			case 1:
				//Chamar o processo de cadastrar a comida da Ultis
				cadarpio.addComida(Utils.criarComida());
				break;
			case 2:
				//Fazer o processo de venda
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
