package aacomp;

public interface Aquatico extends Animal {
	default void nadar() {
		System.out.println("estou nadando!");
	}
}
