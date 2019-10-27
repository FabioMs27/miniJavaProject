package miniProjeto;

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
			brother.acessarRestaurante(View.getString("Id do Funcionário", "Digite o Id do cozinheiro: "));
			newValue = new Vendas(
					cardapio.getComida(View.getInteger("Cardápio", cardapio.getComidas())),
					brother);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			View.getError("Input invalido", e.getMessage());
		}
		return newValue;
	}
}
