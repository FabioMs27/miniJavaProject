package miniProjeto;

public class Comida {
	//Atributos
	private String nome;
	private Float preco;
	private String tipo;
	
	//Construtor
	Comida(String nome, Float preco, String tipo){
		setNome(nome);
		setPreco(preco);
		setTipo(tipo);
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		if(preco <= 0.0)
			throw new IllegalArgumentException("preco invalido!");
		this.preco = preco;
	}

	public void setNome(String nome) {
		if(nome.isEmpty())
			throw new IllegalArgumentException("Nome não pode ser vazio!");
		this.nome = nome;
	}

	public void setTipo(String tipo) {
		if(tipo.isEmpty())
			throw new IllegalArgumentException("Tipo não pode ser vazio!");
		this.tipo = tipo;
	}
	
	public String toString() {
		return this.nome + " R$:" + this.preco + " tipo: " + this.tipo;
	}
}
