package aacomp;

public class Tanque extends ElementoInstalacao {
	private double volumeEmLitros;
	public Tanque(int capacidadeMaxima, Localizacao localizacao, double temperatura, Animal[] animaisInstalados, double volumeEmLitros) {
		super(capacidadeMaxima, localizacao, temperatura, animaisInstalados);
		this.volumeEmLitros = volumeEmLitros;
	}
	public Tanque() {
		super();
	}
	public double getVolumeEmLitros() {
		return volumeEmLitros;
	}
	public void setVolumeEmLitros(double volumeEmLitros) {
		this.volumeEmLitros = volumeEmLitros;
	}
}
