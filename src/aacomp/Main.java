package aacomp;

import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		
		Zebra zebra = new Zebra();
		zebra.setPorte(Porte.MEDIO);
		zebra.locomover();
		
		
		Leao leao = new Leao();
		leao.setPorte(Porte.MEDIO);
		leao.locomover();
		
		Tartaruga tartaruga = new Tartaruga();
		tartaruga.setPorte(Porte.PEQUENO);	
		tartaruga.locomover();
		
		Pinguim pinguim = new Pinguim();
		pinguim.setPorte(Porte.PEQUENO);
		pinguim.locomover();
		
		Baleia baleia = new Baleia();
		baleia.setPorte(Porte.GRANDE);
		baleia.locomover();
		
	}
}