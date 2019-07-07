package aacomp;

public interface Terrestre extends Animal {
	default void andar() {
		System.out.println("estou andando!");
	}
	default void locomover() {
		andar();
	}
}
