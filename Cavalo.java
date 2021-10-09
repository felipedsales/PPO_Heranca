package Familia36;

public class Cavalo extends Animal {
	
	private String saltar;
	
	public Cavalo(String nome,String som,int idade,String saltar) 
	{
		super(nome,som,idade);
		this.saltar=saltar;
	}

	public void imprimirInfo()
	{
		System.out.println("\nO nome do meu cavalo é "+getNome()+"\nEle faz "+getSom()+",ele tem "+getIdade()
		+" anos de idade "+"e ele gosta de "+saltar);
	}

	public String getSaltar() {
		return saltar;
	}

	public void setSaltar(String saltar) {
		this.saltar = saltar;
	}
	
}
