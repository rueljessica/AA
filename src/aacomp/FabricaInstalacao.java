package aacomp;

public class FabricaInstalacao {
	/* em cada método p/ criar a instalaçao de cada animal foi feito: 
		a contagem dos animais no vetor e foi comparado com a capacidade maxima da instalação 
		quando ultrapassa o limite, é apresentada uma mensagem 
		quando a quantidade de animais é menor ou igual ao limite, é criada a instalação 
		para as jaulas, é imprimido a area total da jaula criada
		e se for menor que o limite, é apresentada uma mensagem falando quantos animais ainda podem ser adicionados à instalação
	*/
	@SuppressWarnings("unused")
	public static void criarInstalacaoElefante(Localizacao localizacao, Animal[] animal) {
		int cont = 0 ;
		for(Animal a : animal) {
			cont++;
		}
		if(cont<=2) {
			Jaula jaulaElefante = new Jaula(2, localizacao, 23, animal, 20, 30, 25);
			System.out.println("A AREA DESSA JAULA É: "+ jaulaElefante.area());
			if(cont<2) {
				System.out.println("VOCE PODE ADICIONAR MAIS "+(2-cont)+" ELEFANTE À ESTA JAULA.");
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
			System.out.println("A AREA DESSA JAULA É: "+ jaulaMacaco.area());
			if(cont<10) {
				System.out.println("VOCE PODE ADICIONAR MAIS "+(10-cont)+" MACACO(S) À ESTA JAULA.");
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
			System.out.println("A AREA DESSA JAULA É: "+ jaulaZebra.area());
			if(cont<2) {
				System.out.println("VOCE PODE ADICIONAR MAIS "+(2-cont)+" ZEBRA À ESTA JAULA.");
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
			System.out.println("A AREA DESSA JAULA É: "+ jaulaLeao.area());
			if(cont < 3) {
				System.out.println("VOCE PODE ADICIONAR MAIS "+(3-cont)+" LEAO(ES) À ESTA JAULA.");
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
				System.out.println("VOCE PODE ADICIONAR MAIS "+(17-cont)+" TARTARUGA(S) À ESTE TANQUE.");
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
				System.out.println("VOCE PODE ADICIONAR MAIS "+(25-cont)+" PINGIM(S) À ESTE TANQUE.");
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
				System.out.println("VOCE PODE ADICIONAR MAIS "+(5-cont)+" FOCA(S) À ESTE TANQUE.");
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
				System.out.println("VOCE PODE ADICIONAR MAIS "+(7-cont)+" PEIXE(S)-BOI À ESTE TANQUE.");
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
				System.out.println("VOCE PODE ADICIONAR MAIS "+(2-cont)+" BALEIA À ESTE TANQUE.");
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
				System.out.println("VOCE PODE ADICIONAR MAIS "+(2-cont)+" TUBARAO À ESTE TANQUE.");
			}
		}else {
			System.out.println("QUANTIDADE DE ANIMAIS ULTRAPASSA A CAPACIDADE MAXIMA");
		}
	}
}
