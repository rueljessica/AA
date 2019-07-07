package aacomp;

public class Tartaruga implements Anfibio{
	private Porte porte;
	private Sexo sexo;
	Alimento[] alimento = {Alimento.FRUTAS, Alimento.VERDURAS, Alimento.PEIXES}; // definindo o tipo de alimento que este animal come
	@Override
	public boolean alimentar(Alimento alimento) {
		// comparando o tipo de alimento recebido com o tipo que o animal come 
		for(int i=0; i<this.alimento.length;i++) {
			if(this.alimento[i]==alimento) {
				return true;
			}
		}
		return false;
	}
	@Override
	public Sexo getSexo() {
		return this.sexo;
	}
	@Override
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	@Override
	public Porte getPorte() {
		return this.porte;
	}
	@Override
	public void setPorte(Porte porte) {
		this.porte= porte;
	}
}