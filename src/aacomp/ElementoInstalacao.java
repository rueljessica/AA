package aacomp;

public abstract class ElementoInstalacao extends Instalacao {
	//construtor com os atributos da superclasse
	public ElementoInstalacao(int capacidadeMaxima, Localizacao localizacao, double temperatura, Animal[] animaisInstalados) {
		super(capacidadeMaxima, localizacao, temperatura, animaisInstalados);
	}
}
