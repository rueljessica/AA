package aacomp;

public interface Anfibio extends Terrestre, Aquatico {
	default void nadar() {
		System.out.println("estou nadando!");
	}
	default void andar() {
		System.out.println("estou andando!");
	}	
}
