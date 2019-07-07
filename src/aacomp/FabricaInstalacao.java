package aacomp;

public class FabricaInstalacao {
	/* em cada m�todo p/ criar a instala�ao de cada animal foi feito: 
		a contagem dos animais no vetor e foi comparado com a capacidade maxima da instala��o 
		quando ultrapassa o limite, � apresentada uma mensagem 
		quando a quantidade de animais � menor ou igual ao limite, � criada a instala��o
		e se for menor que o limite, � apresentada uma mensagem falando quantos animais ainda podem ser adicionados � instala��o
	*/
	@SuppressWarnings("unused")
	public static void criarInstalacaoElefante(Localizacao localizacao, Animal[] animal) {
		int cont = 0 ;
		for(Animal a : animal) {
			cont++;
		}
		if(cont<=2) {
			Jaula jaulaElefante = new Jaula(2, localizacao, 23, animal, 20, 30, 25);
			if(cont<2) {
				System.out.println("VOCE PODE ADICIONAR MAIS "+(2-cont)+" ELEFANTE � ESTA JAULA.");
			}
		}else {
			System.out.println("QUANTIDADE DE ANIMAIS ULTRAPASSA A CAPACIDADE MAXIMA");
		}
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoMacaco(Localizacao localizacao, Animal[] animal) {
		int cont = 0 ;
		for(Animal a : animal) {
			cont++;
		}
		if(cont<10) {
			Jaula jaulaMacaco = new Jaula(10, localizacao, 25, animal, 40, 35.7, 90);
			if(cont<10) {
				System.out.println("VOCE PODE ADICIONAR MAIS "+(10-cont)+" MACACO(S) � ESTA JAULA.");
			}
		}else {
			System.out.println("QUANTIDADE DE ANIMAIS ULTRAPASSA A CAPACIDADE MAXIMA");
		}
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoZebra(Localizacao localizacao, Animal[] animal) {
		int cont = 0 ;
		for(Animal a : animal) {
			cont++;
		}
		if(cont<=2) {
			Jaula jaulaZebra = new Jaula(2, localizacao, 24, animal, 20, 30, 25);
			if(cont<2) {
				System.out.println("VOCE PODE ADICIONAR MAIS "+(2-cont)+" ZEBRA � ESTA JAULA.");
			}
		}else {
			System.out.println("QUANTIDADE DE ANIMAIS ULTRAPASSA A CAPACIDADE MAXIMA");
		}
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoLeao(Localizacao localizacao, Animal[] animal) {
		int cont = 0 ;
		for(Animal a : animal) {
			cont++;
		}
		if(cont<=3) {
			Jaula jaulaLeao = new Jaula(3, localizacao, 21.5, animal, 20, 30, 25);
			if(cont < 3) {
				System.out.println("VOCE PODE ADICIONAR MAIS "+(3-cont)+" LEAO(ES) � ESTA JAULA.");
			}
		}else {
			System.out.println("QUANTIDADE DE ANIMAIS ULTRAPASSA A CAPACIDADE MAXIMA");
		}
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoTartaruga(Localizacao localizacao, Animal[] animal) {
		int cont = 0 ;
		for(Animal a : animal) {
			cont++;
		}
		if(cont<=17) {
			Tanque tanqueTartaruga = new Tanque(17, localizacao, 20, animal, 200);
			if(cont<17) {
				System.out.println("VOCE PODE ADICIONAR MAIS "+(17-cont)+" TARTARUGA(S) � ESTE TANQUE.");
			}	
		}else {
			System.out.println("QUANTIDADE DE ANIMAIS ULTRAPASSA A CAPACIDADE MAXIMA");
		}
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoPinguim(Localizacao localizacao, Animal[] animal) {
		int cont = 0 ;
		for(Animal a : animal) {
			cont++;
		}
		if(cont<=25) {
			Tanque tanquePinguim = new Tanque(25, localizacao, 15, animal, 100);
			if(cont<25) {
				System.out.println("VOCE PODE ADICIONAR MAIS "+(25-cont)+" PINGIM(S) � ESTE TANQUE.");
			}
		}else {
			System.out.println("QUANTIDADE DE ANIMAIS ULTRAPASSA A CAPACIDADE MAXIMA");
		}
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoFoca(Localizacao localizacao, Animal[] animal) {
		int cont = 0 ;
		for(Animal a : animal) {
			cont++;
		}
		if(cont<=5) {
			Tanque tanqueFoca = new Tanque(5, localizacao, 15, animal, 100);
			if(cont<5) {
				System.out.println("VOCE PODE ADICIONAR MAIS "+(5-cont)+" FOCA(S) � ESTE TANQUE.");
			}
		}else {
			System.out.println("QUANTIDADE DE ANIMAIS ULTRAPASSA A CAPACIDADE MAXIMA");
		}
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoPeixeBoi(Localizacao localizacao, Animal[] animal) {
		int cont = 0 ;
		for(Animal a : animal) {
			cont++;
		}
		if(cont<=7) {
			Tanque tanquePeixeBoi = new Tanque(7, localizacao, 18, animal, 750);
			if(cont<7) {
				System.out.println("VOCE PODE ADICIONAR MAIS "+(7-cont)+" PEIXE(S)-BOI � ESTE TANQUE.");
			}
		}else {
			System.out.println("QUANTIDADE DE ANIMAIS ULTRAPASSA A CAPACIDADE MAXIMA");
		}
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoBaleia(Localizacao localizacao, Animal[] animal) {
		int cont = 0 ;
		for(Animal a : animal) {
			cont++;
		}
		if(cont<=2) {
			Tanque jaulaBaleia = new Tanque(2, localizacao, 19, animal, 1000);
			if(cont<2) {
				System.out.println("VOCE PODE ADICIONAR MAIS "+(2-cont)+" BALEIA � ESTE TANQUE.");
			}
		}else {
			System.out.println("QUANTIDADE DE ANIMAIS ULTRAPASSA A CAPACIDADE MAXIMA");
		}
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoTubarao(Localizacao localizacao, Animal[] animal) {
		int cont = 0 ;
		for(Animal a : animal) {
			cont++;
		}
		if(cont<=2) {
			Tanque jaulaTubarao = new Tanque(2, localizacao, 22, animal, 500);
			if(cont<2) {
				System.out.println("VOCE PODE ADICIONAR MAIS "+(2-cont)+" TUBARAO � ESTE TANQUE.");
			}
		}else {
			System.out.println("QUANTIDADE DE ANIMAIS ULTRAPASSA A CAPACIDADE MAXIMA");
		}
	}
}