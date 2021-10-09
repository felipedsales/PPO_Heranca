package Familia36;

public class Cachorro extends Animal {
	
	private String correr;

	public Cachorro(String nome,String som,int idade,String correr)
	{
		super(nome,som,idade);
		this.correr=correr;
	}

	public void imprimirInfo() {
		System.out.println("\nO nome do meu cachorro é "+getNome()+"\nEle faz "+getSom()+", ele tem "+getIdade()+
				" anos"+" e ele gosta de "+correr);
	}
	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
}

