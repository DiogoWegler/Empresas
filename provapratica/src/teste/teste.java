package teste;

import java.util.ArrayList;
import java.util.List;

import dominio.Empr;
import dominio.EmprA;
import dominio.EmprX;
import dominio.Filial;
import dominio.Gerente;
import telas.TelaEmpresa;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1, g2;
		g1 = new Gerente("Ger10", 10);
		g2 = new Gerente("Ger20", 20);
		
		Filial F111, F112, F113, F121, F211, F221;
		F111 = new Filial("F111", 1000, g1);
		F112 = new Filial("F112", 2000, g1);
		F113 = new Filial("F113", 3000, g1);
		F121 = new Filial("F121", 4000, g2);
		F211 = new Filial("F211", 600, g1);
		F221 = new Filial("F221", 1000, g2);
		
		EmprA abc;
		abc = new EmprA("Abc");
		abc.addFilial(F111);
		abc.addFilial(F112);
		abc.addFilial(F113);
		abc.addFilial(F121);
		
		EmprX xyz;
		xyz = new EmprX("Xyz");
		xyz.addFilial(F211);
		xyz.addFilial(F221);
		
		List<Empr> empr = new ArrayList<Empr>();
		empr.add(abc);
		empr.add(xyz);
		
		System.out.println("Questao 4");
		for(Empr e: empr) {
			if(e instanceof EmprA) {
				System.out.println("Empresa: " + e.getNome());
				System.out.println("Tipo: A");
			} else if(e instanceof EmprX){
				System.out.println("Empresa: " + e.getNome());
				System.out.println("Tipo: X");
			}
			System.out.println("Filial - Fat. - Gerente - Sal. Base");
			for(Filial f: e.getFiliais()) {
				System.out.println(f.getNome() + " " + f.getFaturamento() + " "+ f.getGerente().getNome() +" "+ f.getGerente().getSalBase());
			}
			System.out.println("Fat. total = " + e.fatTotal());
			System.out.println("Sal. total = " + e.salTotal());
			System.out.println("txCom = " + e.txCom()*100f + "%");
			System.out.println("distr = "+ e.distr());
			System.out.println("Lucro = " + e.lucro());
			System.out.println();
		}
		System.out.println("////////////////////////////");
		System.out.println("Questao 5");
		TelaEmpresa tela = new TelaEmpresa();
		tela.MostraLista(empr);
		System.out.println("////////////////////////////");
		System.out.println("Questao 6");
		tela.Relatorio(empr, g1);
	}

}
