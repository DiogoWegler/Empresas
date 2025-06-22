package dominio;

public class Filial {
	private String nome;
	private float faturamento;
	private Gerente gerente;
	
	public Filial(String nome, float faturamento, Gerente gerente) {
		this.nome = nome;
		this.faturamento = faturamento;
		if (gerente == null) {
		      throw new RuntimeException("Erro: Gerente nulo");
		    }
		    else {
		      this.gerente = gerente;
		    }
	}
	
	public String getNome() {
		return this.nome;
	}
	public float getFaturamento() {
		return this.faturamento;
	}
	public Gerente getGerente() {
		return this.gerente;
	}
}
