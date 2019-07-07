package aacomp;

public interface Anfibio extends Terrestre, Aquatico {
	//sobrescrevendo o método locomover e invocando os métodos andar e nadar
	default void locomover() { 
		andar();
		nadar();
	}	
}