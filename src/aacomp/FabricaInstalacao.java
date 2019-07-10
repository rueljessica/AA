package aacomp;

public class FabricaInstalacao {
	/* em cada método p/ criar a instalaçao de cada animal foi feito: 
		a contagem dos animais no vetor e foi comparado com a capacidade maxima da instalação 
		quando ultrapassa o limite, é apresentada uma mensagem 
		quando a quantidade de animais é menor ou igual ao limite, é criada a instalação
		e se for menor que o limite, é apresentada uma mensagem falando quantos animais ainda podem ser adicionados à instalação
	*/
	@SuppressWarnings("unused")
	public static void criarInstalacaoElefante(Localizacao localizacao, Animal[] animal) {
		Jaula jaulaElefante = new Jaula();
		jaulaElefante.setCapacidadeMaxima(2);
		jaulaElefante.setLocalizacao(localizacao);
		jaulaElefante.setTemperatura(23);
		jaulaElefante.setAltura(20);
		jaulaElefante.setLargura(30);
		jaulaElefante.setComprimento(25);
		
		System.out.println("A AREA DESSA JAULA É: "+ jaulaElefante.area());
		int i=0;
		
		for(i=0;i<animal.length;i++) {
			jaulaElefante.instalaAnimal(animal[i], i);
			boolean b = jaulaElefante.instalaAnimal(animal[i], i);
			if(b) {
				System.out.println("ELEFANTE "+ (i+1) +" INSTALADO COM SUCESSO");
			}
		}
		if(i<2) {
			System.out.println("VOCE PODE ADICIONAR MAIS "+(2-i)+" ELEFANTE À ESTA JAULA.");
		}else {
			System.out.println("CAPACIDADE MAXIMA ATINGIDA");
		}
		System.out.println("----------------------------------------------------------------------");
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoMacaco(Localizacao localizacao, Animal[] animal) {
		Jaula jaulaMacaco = new Jaula();
		jaulaMacaco.setCapacidadeMaxima(10);
		jaulaMacaco.setLocalizacao(localizacao);
		jaulaMacaco.setTemperatura(25);
		jaulaMacaco.setAltura(40);
		jaulaMacaco.setLargura(35.7);
		jaulaMacaco.setComprimento(90);
		
		System.out.println("A AREA DESSA JAULA É: "+ jaulaMacaco.area());
		int i=0;
		
		for(i=0;i<animal.length;i++) {
			boolean b = jaulaMacaco.instalaAnimal(animal[i], i);
			if(b) {
				System.out.println("MACACO "+(i+1) +" INSTALADO COM SUCESSO");
			}
		}
		if(i<10) {
			System.out.println("VOCE PODE ADICIONAR MAIS "+(10-i)+" MACACO(S) À ESTA JAULA.");
		}else{
			System.out.println("CAPACIDADE MAXIMA ATINGIDA");
		}
		System.out.println("----------------------------------------------------------------------");
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoZebra(Localizacao localizacao, Animal[] animal) {
		Jaula jaulaZebra = new Jaula();
		jaulaZebra.setCapacidadeMaxima(2);
		jaulaZebra.setLocalizacao(localizacao);
		jaulaZebra.setTemperatura(24);
		jaulaZebra.setAltura(20);
		jaulaZebra.setLargura(30);
		jaulaZebra.setComprimento(25);
		
		System.out.println("A AREA DESSA JAULA É: "+ jaulaZebra.area());
		int i=0;
		
		for(i=0;i<animal.length;i++) {
			boolean b = jaulaZebra.instalaAnimal(animal[i], i);
			if(b) {
				System.out.println("ZEBRA "+(i+1) +" INSTALADO COM SUCESSO");
			}
		}
		if(i<2) {
			System.out.println("VOCE PODE ADICIONAR MAIS "+(2-i)+" ZEBRA À ESTA JAULA.");
		}else{
			System.out.println("CAPACIDADE MAXIMA ATINGIDA");
		}
		System.out.println("----------------------------------------------------------------------");
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoLeao(Localizacao localizacao, Animal[] animal) {
		Jaula jaulaLeao = new Jaula();
		jaulaLeao.setCapacidadeMaxima(3);
		jaulaLeao.setLocalizacao(localizacao);
		jaulaLeao.setTemperatura(21.5);
		jaulaLeao.setAltura(20);
		jaulaLeao.setLargura(30);
		jaulaLeao.setComprimento(25);
		
		System.out.println("A AREA DESSA JAULA É: "+ jaulaLeao.area());
		int i=0;
		
		for(i=0;i<animal.length;i++) {
			boolean b = jaulaLeao.instalaAnimal(animal[i], i);
			if(b) {
				System.out.println("LEAO "+(i+1) +" INSTALADO COM SUCESSO");
			}
		}
		if(i<3) {
			System.out.println("VOCE PODE ADICIONAR MAIS "+(3-i)+" LEAO(ES) À ESTA JAULA.");
		}else{
			System.out.println("CAPACIDADE MAXIMA ATINGIDA");
		}
		System.out.println("----------------------------------------------------------------------");
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoTartaruga(Localizacao localizacao, Animal[] animal) {
		Tanque tanqueTartaruga = new Tanque();
		tanqueTartaruga.setCapacidadeMaxima(17);
		tanqueTartaruga.setLocalizacao(localizacao);
		tanqueTartaruga.setTemperatura(20);
		tanqueTartaruga.setVolumeEmLitros(200);
		int i= 0;
		for(i=0;i<animal.length;i++) {
			boolean b = tanqueTartaruga.instalaAnimal(animal[i], i);
			if(b) {
				System.out.println("TARTARUGA "+(i+1) +" INSTALADA COM SUCESSO");
			}
		}
		if(i<17) {
			System.out.println("VOCE PODE ADICIONAR MAIS "+(17-i)+" TARTARUGA(s) À ESTE TANQUE.");
		}else{
			System.out.println("CAPACIDADE MAXIMA ATINGIDA");
		}
		System.out.println("----------------------------------------------------------------------");
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoPinguim(Localizacao localizacao, Animal[] animal) {
		Tanque tanquePinguim = new Tanque();
		tanquePinguim.setCapacidadeMaxima(25);
		tanquePinguim.setLocalizacao(localizacao);
		tanquePinguim.setTemperatura(15);
		tanquePinguim.setVolumeEmLitros(100);
		
		int i= 0;
		for(i=0;i<animal.length;i++) {
			boolean b = tanquePinguim.instalaAnimal(animal[i], i);
			if(b) {
				System.out.println("PINGUIM "+(i+1) +" INSTALADO COM SUCESSO");
			}
		}
		if(i<25) {
			System.out.println("VOCE PODE ADICIONAR MAIS "+(25-i)+" PINGUIM(S) À ESTE TANQUE.");
		}else{
			System.out.println("CAPACIDADE MAXIMA ATINGIDA");
		}
		System.out.println("----------------------------------------------------------------------");
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoFoca(Localizacao localizacao, Animal[] animal) {
		Tanque tanqueFoca = new Tanque();
		tanqueFoca.setCapacidadeMaxima(5);
		tanqueFoca.setLocalizacao(localizacao);
		tanqueFoca.setTemperatura(15);
		tanqueFoca.setVolumeEmLitros(100);
		
		int i= 0;
		for(i=0;i<animal.length;i++) {
			boolean b = tanqueFoca.instalaAnimal(animal[i], i);
			if(b) {
				System.out.println("FOCA "+(i+1) +" INSTALADA COM SUCESSO");
			}
		}
		if(i<5) {
			System.out.println("VOCE PODE ADICIONAR MAIS "+(5-i)+" FOCA(S) À ESTE TANQUE.");
		}else{
			System.out.println("CAPACIDADE MAXIMA ATINGIDA");
		}
		System.out.println("----------------------------------------------------------------------");
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoPeixeBoi(Localizacao localizacao, Animal[] animal) {
		Tanque tanquePeixeBoi = new Tanque();
		tanquePeixeBoi.setCapacidadeMaxima(7);
		tanquePeixeBoi.setLocalizacao(localizacao);
		tanquePeixeBoi.setTemperatura(18);
		tanquePeixeBoi.setVolumeEmLitros(750);
		
		int i= 0;
		for(i=0;i<animal.length;i++) {
			boolean b = tanquePeixeBoi.instalaAnimal(animal[i], i);
			if(b) {
				System.out.println("PEIXE-BOI "+(i+1) +" INSTALADO COM SUCESSO");
			}
		}
		if(i<7) {
			System.out.println("VOCE PODE ADICIONAR MAIS "+(7-i)+" PEIXE(S)-BOI À ESTE TANQUE.");
		}else{
			System.out.println("CAPACIDADE MAXIMA ATINGIDA");
		}
		System.out.println("----------------------------------------------------------------------");
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoBaleia(Localizacao localizacao, Animal[] animal) {
		Tanque jaulaBaleia = new Tanque();
		jaulaBaleia.setCapacidadeMaxima(2);
		jaulaBaleia.setLocalizacao(localizacao);
		jaulaBaleia.setTemperatura(19);
		jaulaBaleia.setVolumeEmLitros(1000);
		
		int i= 0;
		for(i=0;i<animal.length;i++) {
			boolean b = jaulaBaleia.instalaAnimal(animal[i], i);
			if(b) {
				System.out.println("BALEIA "+(i+1) +" INSTALADA COM SUCESSO");
			}
		}
		if(i<2) {
			System.out.println("VOCE PODE ADICIONAR MAIS "+(2-i)+" BALEIA À ESTE TANQUE.");
		}else{
			System.out.println("CAPACIDADE MAXIMA ATINGIDA");
		}
		System.out.println("----------------------------------------------------------------------");
	}
	@SuppressWarnings("unused")
	public static void criarInstalacaoTubarao(Localizacao localizacao, Animal[] animal) {
		Tanque jaulaTubarao = new Tanque();
		jaulaTubarao.setCapacidadeMaxima(2);
		jaulaTubarao.setLocalizacao(localizacao);
		jaulaTubarao.setTemperatura(22);
		jaulaTubarao.setVolumeEmLitros(500);
		
		int i= 0;
		for(i=0;i<animal.length;i++) {
			boolean b = jaulaTubarao.instalaAnimal(animal[i], i);
			if(b) {
				System.out.println("TUBARAO "+(i+1) +" INSTALADO COM SUCESSO");
			}
		}
		if(i<2) {
			System.out.println("VOCE PODE ADICIONAR MAIS "+(2-i)+" TUBARAO À ESTE TANQUE.");
		}else{
			System.out.println("CAPACIDADE MAXIMA ATINGIDA");
		}
		System.out.println("----------------------------------------------------------------------");
	}
}
