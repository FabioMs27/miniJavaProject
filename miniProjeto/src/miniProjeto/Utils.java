package miniProjeto;

import java.util.ArrayList;

public class Utils {
	public static Comida criarComida(Cozinheiro cozinheiro) {
		String nome = "";
		float preco = 0;
		String tipo = "";
		
		
		try {
			cozinheiro.acessarRestaurante(View.getString("Id do Funcionário", "Digite o Id do cozinheiro: "));
			nome = View.getString("Nome da Comida", "Digite o nome da comida");
			preco = View.getFloat("Preço da Comida", "Digite o preço da comida");
			tipo = View.getString("Nome do Tipo", "Digite o tipo de comida");
		} catch (IllegalArgumentException e) {
			View.getError("Input invalido", e.getMessage());
		}catch (Exception e) {
			View.getError("Input invalido", e.getMessage());
		}
		
		Comida comida = new Comida(nome, preco, tipo);
		return comida;
	}
	
	public static Vendas criarVendas(Garcom brother, Cardapio cardapio) {
		Vendas newValue = null;
		
		try {
			newValue = new Vendas(
                    cardapio.getComida(View.getInteger("Cardápio", cardapio.getComidas() + "\n Escolha a comida: ") - 1),
                    brother);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			View.getError("Input invalido", e.getMessage());
		}
		return newValue;
	}
	
	public static void getManagerId(Manager manager) {
		try {
			String id = View.getString("Id Manager", "Digite o id do manager: ");
			manager.acessarRestaurante(id);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			View.getError("Error", e.getMessage());
		}
	}
	
	public static int getRandomDoubleBetweenRange(double min, double max){
        double x = (Math.random()*((max-min)+1))+min;
        int i = (int) x;
        return i;
    }
	
	public static Garcom escolherGarcom(ArrayList<Funcionario> funcionarios) {
		Garcom garcom = (Garcom) funcionarios.get(View.getInteger("ID do funcionario", "Digite o id do funcionario"));
		return garcom;
	}
	
}
