package dominio;

public class EmprX extends Empr{


	public EmprX(String nome) {
		super(nome);
	}

	public float txCom() {
		float num = fatTotal();
		float tx = 0f;
		if(num <= 1000) {
			tx = 0.01f;
		} else if(num > 1000 && num <= 2000){
			tx = 0.02f;
		} else {
			tx = 0.03f;
		}
		return tx;
	}
	
}
