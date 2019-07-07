package aacomp;

public class Main{
	public static void main(String[] args) {
		// criando todos os animais
		
		Elefante elefante = new Elefante();
		elefante.setPorte(Porte.GRANDE);
		elefante.setSexo(Sexo.FEMININO);
		//elefante.locomover();
		
		Elefante elefante2 = new Elefante();
		elefante2.setPorte(Porte.GRANDE);
		elefante2.setSexo(Sexo.MASCULINO);
		//elefante2.locomover();
		
		Macaco macaco = new Macaco();
		macaco.setPorte(Porte.PEQUENO);
		macaco.setSexo(Sexo.MASCULINO);
		//macaco.locomover();
		
		Macaco macaco2 = new Macaco();
		macaco2.setPorte(Porte.PEQUENO);
		macaco2.setSexo(Sexo.FEMININO);
		//macaco2.locomover();
		
		Zebra zebra = new Zebra();
		zebra.setPorte(Porte.MEDIO);
		zebra.setSexo(Sexo.MASCULINO);
		//zebra.locomover();
		
		Zebra zebra2 = new Zebra();
		zebra2.setPorte(Porte.MEDIO);
		zebra2.setSexo(Sexo.FEMININO);
		//zebra2.locomover();
		
		Leao leao = new Leao();
		leao.setPorte(Porte.MEDIO);
		leao.setSexo(Sexo.FEMININO);
		//leao.locomover();
		
		Leao leao2 = new Leao();
		leao2.setPorte(Porte.MEDIO);
		leao2.setSexo(Sexo.MASCULINO);
		//leao2.locomover();
		
		Tartaruga tartaruga = new Tartaruga();
		tartaruga.setPorte(Porte.PEQUENO);
		tartaruga.setSexo(Sexo.FEMININO);
		//tartaruga.locomover();
		
		Tartaruga tartaruga2 = new Tartaruga();
		tartaruga2.setPorte(Porte.PEQUENO);
		tartaruga2.setSexo(Sexo.MASCULINO);
		//tartaruga2.locomover();
		
		Pinguim pinguim = new Pinguim();
		pinguim.setPorte(Porte.PEQUENO);
		pinguim.setSexo(Sexo.FEMININO);
		//pinguim.locomover();
		
		Pinguim pinguim2 = new Pinguim();
		pinguim2.setPorte(Porte.PEQUENO);
		pinguim2.setSexo(Sexo.MASCULINO);
		//pinguim2.locomover();
		
		Foca foca = new Foca();
		foca.setPorte(Porte.MEDIO);
		foca.setSexo(Sexo.MASCULINO);
		//foca.locomover();
		
		Foca foca2 = new Foca();
		foca2.setPorte(Porte.MEDIO);
		foca2.setSexo(Sexo.FEMININO);
		//foca2.locomover();
		
		PeixeBoi peixeBoi = new PeixeBoi();
		peixeBoi.setPorte(Porte.PEQUENO);
		peixeBoi.setSexo(Sexo.FEMININO);
		//peixeBoi.locomover();
		
		PeixeBoi peixeBoi2 = new PeixeBoi();
		peixeBoi2.setPorte(Porte.PEQUENO);
		peixeBoi2.setSexo(Sexo.MASCULINO);
		//peixeBoi2.locomover();
		
		Baleia baleia = new Baleia();
		baleia.setPorte(Porte.GRANDE);
		baleia.setSexo(Sexo.FEMININO);
		//baleia.locomover();
		
		Baleia baleia2 = new Baleia();
		baleia2.setPorte(Porte.GRANDE);
		baleia2.setSexo(Sexo.MASCULINO);
		//baleia2.locomover();
		
		Tubarao tubarao = new Tubarao();
		tubarao.setPorte(Porte.GRANDE);
		tubarao.setSexo(Sexo.MASCULINO);
		//tubarao.locomover();
		
		Tubarao tubarao2 = new Tubarao();
		tubarao2.setPorte(Porte.GRANDE);
		tubarao2.setSexo(Sexo.FEMININO);
		//tubarao2.locomover();
		
		Tubarao tubarao3 = new Tubarao();
		tubarao3.setPorte(Porte.GRANDE);
		tubarao3.setSexo(Sexo.FEMININO);
		//tubarao3.locomover();
		
		//criando vetores com os animais criados
		Elefante[] vElefante = {elefante}; 
		Macaco[] vMacaco = {macaco, macaco2}; 
		Zebra[] vZebra = {zebra, zebra2}; 
		Leao[] vLeao = {leao, leao2}; 
		Tartaruga[] vTartaruga = {tartaruga, tartaruga2}; 
		Pinguim[] vPinguim = {pinguim, pinguim2}; 
		Foca[] vFoca = {foca, foca2}; 
		PeixeBoi[] vPeixeBoi = {peixeBoi, peixeBoi2}; 
		Baleia[] vBaleia = {baleia, baleia2}; 
		Tubarao[] vTubarao = {tubarao, tubarao2, tubarao3}; 
		
		Zoologico zoo = new Zoologico();
		
		//criando instalações
		zoo.criar(Localizacao.SUDESTE, vElefante);
		zoo.criar(Localizacao.SUDESTE, vMacaco);
		zoo.criar(Localizacao.SUDESTE, vPinguim);
		zoo.criar(Localizacao.LESTE, vPinguim);
		zoo.criar(Localizacao.CENTROESTE, vZebra);
		zoo.criar(Localizacao.NORDESTE, vLeao);
		zoo.criar(Localizacao.SUDOESTE, vTartaruga);
		zoo.criar(Localizacao.OESTE, vFoca);
		zoo.criar(Localizacao.NOROESTE, vPeixeBoi);
		zoo.criar(Localizacao.SUL, vBaleia);
		zoo.criar(Localizacao.NORTE, vTubarao);
	}
}