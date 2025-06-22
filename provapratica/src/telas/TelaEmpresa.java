package telas;

import java.util.ArrayList;
import java.util.List;

import dominio.Empr;
import dominio.EmprA;
import dominio.EmprX;
import dominio.Filial;
import dominio.Gerente;

public class TelaEmpresa {

	public void MostraLista(List<Empr> l) {
		for(Empr e: l) {
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
	}
	
	public void Relatorio(List<Empr> l, Gerente g) {
		System.out.println("Emp - Filial - Fat. - Sal. b. - Tx Com - Distr");
		float distr = 0f;
		float tsal = 0f;
		float tdistr = 0f;
		float total = 0f;
		for(Empr e: l) {
			for(Filial f: e.getFiliais()) {
				if(f.getGerente().equals(g)) {
					distr = e.txCom() * f.getFaturamento();
					tsal = tsal + f.getGerente().getSalBase();
					tdistr = tdistr + distr;
					total = tdistr + tsal;
					System.out.println(e.getNome() + " - " + f.getNome() + " - " + f.getFaturamento() + " - " + f.getGerente().getSalBase() + " - " + e.txCom()*100 + "% - " + distr);
				}
			}
		}
		System.out.println("Totais: "+ tsal + " + "+ tdistr);
		System.out.println("Total recebido: " + total);
	}
	
}
