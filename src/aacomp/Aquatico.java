package aacomp;

public interface Aquatico extends Animal {
	//sobrescrevendo com default p/ adicionar o corpo
	default void nadar() {
		System.out.println("estou nadando!");
	}
	//sobrescrevendo com default p/ adicionar o corpo
	default void locomover() {
		nadar(); 
	}
}