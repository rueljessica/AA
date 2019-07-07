package aacomp;

public interface Anfibio extends Terrestre, Aquatico {
	default void locomover() {
		andar();
		nadar();
	}	
}
