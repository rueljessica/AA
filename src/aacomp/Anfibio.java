package aacomp;

public interface Anfibio extends Terrestre, Aquatico {
	//sobrescrevendo o m�todo locomover e invocando os m�todos andar e nadar
	default void locomover() { 
		andar();
		nadar();
	}	
}