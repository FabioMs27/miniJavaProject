package miniProjeto;

public class Manager extends Funcionario{

	//Atributos
	
	//Construtor
	Manager(String nome, String id) {
		super(nome, id);
		// TODO Auto-generated constructor stub
	}

	//Métodos
	@Override
	public void acessarRestaurante(String valor) {
		// TODO Auto-generated method stub
		super.acessarRestaurante(valor);

		//Exibir msg
		View.getAfirmative("Relatório", "Total de vendas: " + Vendas.vendaTotal + "\n Lucro total R$:" + Vendas.lucroTotal);
	}
}
