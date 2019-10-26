package miniProjeto;

import java.util.ArrayList;

public class Cardapio {

	//Atributos
	private ArrayList<Comida> comidas = new ArrayList<Comida>();
	
	
	//Method
	public void addComida(Comida newValue) {
		comidas.add(newValue);
	}
	
	public Comida getComida(int index) {
		return this.comidas.get(index);
	}
	
	public String getComidas() {
		String msg = "";
		for (Comida comida : comidas) {
			msg += comida + "\n";
		}
		return msg;
	}
}
