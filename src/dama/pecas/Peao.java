package dama.pecas;

import dama.Color;
import dama.PecasDama;
import tabuleiro.Tabuleiro;

public class Peao extends PecasDama{

	public Peao(Tabuleiro tabuleiro, Color cor) {
		super(tabuleiro, cor);
		
	}

	@Override
	public String toString() {
		return "P";
	}
	
	

}