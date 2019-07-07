package aacomp;

public class Tartaruga implements Anfibio{
	private Porte porte;
	private Sexo sexo;
	Alimento[] alimento = {Alimento.FRUTAS, Alimento.VERDURAS, Alimento.PEIXES};
	@Override
	public boolean alimentar(Alimento alimento) {
		// TODO Auto-generated method stub
		for(int i=0; i<this.alimento.length;i++) {
			if(this.alimento[i]==alimento) {
				return true;
			}
		}
		return false;
	}
	@Override
	public Sexo getSexo() {
		// TODO Auto-generated method stub
		return this.sexo;
	}

	@Override
	public void setSexo(Sexo sexo) {
		// TODO Auto-generated method stub
		this.sexo = sexo;
	}

	@Override
	public Porte getPorte() {
		// TODO Auto-generated method stub
		return this.porte;
	}

	@Override
	public void setPorte(Porte porte) {
		// TODO Auto-generated method stub
		this.porte= porte;
	}

}
