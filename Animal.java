package Familia36;

public class Animal {

	//Atributos
	private String nome;
	private String som;
	private int idade;
	
	//Construtor
	
	public Animal(String nome,String som, int idade)
	{
		this.nome=nome;
		this.som=som;
		this.idade=idade;
	}

	//métodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
