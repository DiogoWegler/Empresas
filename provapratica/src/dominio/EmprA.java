package dominio;

public class EmprA extends Empr{

	
	public EmprA(String nome) {
		super(nome);
	}
	
	
	public float txCom() {
		float num = getFiliais().size();
		float tx = 0f;
		tx = num / 100.0f;
		return tx;
	}

}
