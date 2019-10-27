package miniProjeto;

public class Utils {
	public static Comida criarComida() {
		String nome = "";
		float preco = 0;
		String tipo = "";
		try {
			nome = View.getString("Nome da Comida", "Digite o nome da comida");
		} catch (IllegalArgumentException e) {
			View.getError("Nome Inválido", "Nome colocado inválido");
		}catch (Exception e) {
			View.getError("Nome Inválido", "Nome colocado inválido");
		}
		try {
			preco = View.getFloat("Preço da Comida", "Digite o preço da comida");
		} catch (IllegalArgumentException e) {
			View.getError("Preço inválido", "Preço colocado inválido");
		}catch (Exception e) {
			View.getError("Preço inválido", "Preço colocado inválido");
		}
		try {
			tipo = View.getString("Nome do Tipo", "Digite o tipo de comida");
		} catch (IllegalArgumentException e) {
			View.getError("Tipo Inválido", "Tipo colocado inválido");
		}catch (Exception e) {
			View.getError("Tipo Inválido", "Tipo colocado inválido");
		}
		Comida comida = new Comida(nome, preco, tipo);
		return comida;
	}
}
