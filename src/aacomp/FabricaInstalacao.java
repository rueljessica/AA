package aacomp;

public class FabricaInstalacao {
	public static void criarInstalacaoElefante(Localizacao localizacao, Animal[] animal) {
		Jaula jaulaElefante = new Jaula(2, localizacao, 23, animal, 20, 30, 25);
	}
	public static void criarInstalacaoMacaco(Localizacao localizacao, Animal[] animal) {
		Jaula jaulaMacaco = new Jaula(10, localizacao, 25, animal, 40, 35.7, 90);
	}
	public static void criarInstalacaoZebra(Localizacao localizacao, Animal[] animal) {
		Jaula jaulaZebra = new Jaula(2, localizacao, 24, animal, 20, 30, 25);
	}
	public static void criarInstalacaoLeao(Localizacao localizacao, Animal[] animal) {
		Jaula jaulaLeao = new Jaula(3, localizacao, 21.5, animal, 20, 30, 25);
	}
	public static void criarInstalacaoTartaruga(Localizacao localizacao, Animal[] animal) {
		Tanque tanqueTartaruga = new Tanque(17, localizacao, 20, animal, 200);
	}
	public static void criarInstalacaoPinguim(Localizacao localizacao, Animal[] animal) {
		Tanque tanquePinguim = new Tanque(25, localizacao, 15, animal, 100);
	}
	public static void criarInstalacaoFoca(Localizacao localizacao, Animal[] animal) {
		Tanque tanqueFoca = new Tanque(5, localizacao, 15, animal, 100);
	}
	public static void criarInstalacaoPeixeBoi(Localizacao localizacao, Animal[] animal) {
		Tanque tanquePeixeBoi = new Tanque(7, localizacao, 18, animal, 750);
	}
	public static void criarInstalacaoBaleia(Localizacao localizacao, Animal[] animal) {
		Tanque jaulaBaleia = new Tanque(2, localizacao, 19, animal, 1000);
	}
	public static void criarInstalacaoTubarao(Localizacao localizacao, Animal[] animal) {
		Tanque jaulaTubarao = new Tanque(2, localizacao, 22, animal, 500);
	}
}
