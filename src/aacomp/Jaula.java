package aacomp;

public class Jaula extends ElementoInstalacao {
	private double altura, largura, comprimento;
	public Jaula(int capacidadeMaxima, Localizacao localizacao, double temperatura, Animal[] animaisInstalados,
			double altura, double largura, double comprimento) {
		super(capacidadeMaxima, localizacao, temperatura, animaisInstalados);
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
	}

	public double area() {
		return 0;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
}