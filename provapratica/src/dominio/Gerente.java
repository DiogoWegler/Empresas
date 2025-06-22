package dominio;

public class Gerente {
	private String nome;
	private float salBase;
	
	public Gerente(String nome, float salBase) {
		this.nome = nome;
		this.salBase = salBase;
	}
	
	public String getNome() {
		return this.nome;
	}
	public float getSalBase() {
		return this.salBase;
	}
}
