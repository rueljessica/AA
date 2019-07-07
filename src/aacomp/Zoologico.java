package aacomp;

import java.util.ArrayList;

public class Zoologico {
	ArrayList<Localizacao> locaisDisponiveis = new ArrayList<Localizacao>();
	public void add() {
		locaisDisponiveis.add(Localizacao.CENTROESTE);
		locaisDisponiveis.add(Localizacao.LESTE);
		locaisDisponiveis.add(Localizacao.NORDESTE);
		locaisDisponiveis.add(Localizacao.NOROESTE);
		locaisDisponiveis.add(Localizacao.NORTE);
		locaisDisponiveis.add(Localizacao.OESTE);
		locaisDisponiveis.add(Localizacao.SUDESTE);
		locaisDisponiveis.add(Localizacao.SUL);
		locaisDisponiveis.add(Localizacao.SUDOESTE);
	}
	public void criar(Localizacao l, Animal[] animais) {
		add();
		boolean aux = false;
		for(Localizacao a : locaisDisponiveis) {
			if(a==l) {
				locaisDisponiveis.remove(a);
				aux = true;
				if(animais[0] instanceof Zebra) {
					FabricaInstalacao.criarInstalacaoZebra(l, animais);
				}else if(animais[0] instanceof Elefante) {
					FabricaInstalacao.criarInstalacaoElefante(l, animais);
				}else if(animais[0] instanceof Macaco) {
					FabricaInstalacao.criarInstalacaoMacaco(l, animais);
				}
				else if(animais[0] instanceof Leao) {
					FabricaInstalacao.criarInstalacaoLeao(l, animais);
				}
				else if(animais[0] instanceof Tartaruga) {
					FabricaInstalacao.criarInstalacaoTartaruga(l, animais);
				}
				else if(animais[0] instanceof Pinguim) {
					FabricaInstalacao.criarInstalacaoPinguim(l, animais);
				}
				else if(animais[0] instanceof Foca) {
					FabricaInstalacao.criarInstalacaoFoca(l, animais);
				}
				else if(animais[0] instanceof PeixeBoi) {
					FabricaInstalacao.criarInstalacaoPeixeBoi(l, animais);
				}
				else if(animais[0] instanceof Baleia) {
					FabricaInstalacao.criarInstalacaoBaleia(l, animais);
				}
				else if(animais[0] instanceof Tubarao) {
					FabricaInstalacao.criarInstalacaoTubarao(l, animais);
				}
				return;
			}
		}
		if(aux==false) {
			System.out.println("TENTE COM OUTRA LOCALIZACAO");
		}
	}
}
