package dama;

import tabuleiro.Posicao;

public class PosicaoDama {
	
	private char coluna;
	private int linha;
	
	public PosicaoDama(char coluna, int linha) {
		super();
		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}
	
	protected Posicao paraPosicaMatriz() {
		return new Posicao(8 - linha, coluna - 'a');
	}
}
