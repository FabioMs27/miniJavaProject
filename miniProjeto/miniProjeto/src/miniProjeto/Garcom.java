package miniProjeto;

public class Garcom extends Funcionario{

	//Atributos
	private Integer qtdVendas;
	
	//Construtor
	Garcom(String nome, String id) {
		super(nome, id);
		// TODO Auto-generated constructor stub
		this.qtdVendas = 0;
	}
	
	//Métodos
	@Override
	public void acessarRestaurante() {
		// TODO Auto-generated method stub
		super.acessarRestaurante();
	}

	public String toString() {
		return super.toString() + "Quantidade de Vendas: " + this.qtdVendas;
	}
}
