package miniProjeto;

public class Vendas {

	//Atributos
	private Comida comida;
	private Garcom garcom;
	public static Integer vendaTotal = 0;
	public static float lucroTotal = 0;
	
	//Construtor
	Vendas(Comida comida, Garcom garcom){
		this.comida = comida;
		this.garcom = garcom;
		Vendas.lucroTotal += comida.getPreco();
	}
	
	//Métodos
	public String toString() {
		return "comida: \n" + comida + "\nFuncionario: \n" + garcom;
	}
}
