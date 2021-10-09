package Familia36;

public class Preguica extends Animal {
	
	private String dormir;
	
	public Preguica (String nome, String som, int idade,String dormir)
	{
		super(nome,som,idade);
		this.dormir=dormir;
	}

	public void imprimirInfo()
	{
		System.out.println("\nO nome da minha preguiça é "+getNome()+"\nEla faz "+getSom()+", ela tem "+getIdade()
		+" anos de idade "+"e ela gosta de "+dormir);
	}

	public String getDormir() {
		return dormir;
	}

	public void setDormir(String dormir) {
		this.dormir = dormir;
	}
	
}
