package aacomp;

public interface Animal {
	public boolean alimentar(Alimento alimento);
	public void locomover();
	public Sexo getSexo();
	public void setSexo(Sexo sexo);
	public Porte getPorte();
	public void setPorte(Porte porte);
}