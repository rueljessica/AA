package aacomp;

public abstract class Instalacao {
	private int capacidadeMaxima;
	private Localizacao localizacao;
	private double temperatura;
	private Animal[] animaisInstalados;
	public Instalacao(int capacidadeMaxima, Localizacao localizacao, double temperatura, Animal[] animaisInstalados) {
		this.capacidadeMaxima = capacidadeMaxima;
		this.localizacao = localizacao;
		this.temperatura = temperatura;
		this.animaisInstalados = animaisInstalados;
	}
	public boolean instalaAnimal(Animal animal) {
		return true;
	}
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	public Localizacao getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public Animal[] getAnimaisInstalados() {
		return animaisInstalados;
	}
	public void setAnimaisInstalados(Animal[] animaisInstalados) {
		this.animaisInstalados = animaisInstalados;
	}
}