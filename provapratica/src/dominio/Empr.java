package dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class Empr {
	private String nome;
	private Filial filial;
	List<Filial> filiais = new ArrayList<Filial>();
	
	
	public Empr(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	public float fatTotal() {
		float total = 0f;
		for(Filial f: filiais) {
			total = f.getFaturamento() + total;
		}
		return total;
	}
	public float salTotal() {
		float total = 0f;
		for(Filial f: filiais) {
			total = f.getGerente().getSalBase() + total;
		}
		return total;
	}
	public float distr() {
		float total = 0f;
		total = fatTotal() * txCom();
		return total;
	}
	public float lucro() {
		float total = 0f;
		total = fatTotal() - salTotal() - distr();
		return total;
	}
	
	public abstract float txCom();
	
	public void addFilial(Filial f) {
		filiais.add(f);
	}
	
	public List<Filial> getFiliais(){
		return this.filiais;
	}
}
