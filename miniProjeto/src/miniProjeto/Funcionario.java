package miniProjeto;

public class Funcionario {

	//Atributos 
	private String nome;
	private String id;
	
	//Construtor
	Funcionario(String nome, String id){
		setNome(nome);
		setId(id);
	}
	
	//Metodos
	public void acessarRestaurante(String valor) {
		if(!valor.equals(this.getId()))
			throw new IllegalArgumentException("Id invalido!");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if(nome.isEmpty()) {
			throw new IllegalArgumentException("id não pode ser vazio!");
		}
		this.id = id;
	}
	public void setNome(String nome) {
		if(nome.isEmpty()) {
			throw new IllegalArgumentException("Nome não pode ser vazio!");
		}
		this.nome = nome;
	}
	
	public String toString() {
		return "nome: " + this.nome;
	}
	
}
