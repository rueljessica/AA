package aacomp;

public class Macaco implements Terrestre {
	private Porte porte;
	private Sexo sexo;
	Alimento alimento = Alimento.FRUTAS; // definindo o tipo de alimento que este animal come
	@Override
	public boolean alimentar(Alimento alimento) {
		// comparando o tipo de alimento recebido com o tipo que o animal come 
		if(this.alimento == alimento) {
			return true;
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
		this.porte = porte;
	}
}