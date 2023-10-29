package dama;

import tabuleiro.Pecas;
import tabuleiro.Tabuleiro;

public class PecasDama extends Pecas{
	private Color cor;

	public PecasDama(Tabuleiro tabuleiro, Color cor) {
		super(tabuleiro);
		this.cor = cor;
	}
	
	//metodo para retornar uma peça
}
