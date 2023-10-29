package dama;

import java.util.ArrayList;
import java.util.List;

import dama.pecas.Peao;
import tabuleiro.Pecas;
import tabuleiro.Tabuleiro;

public class PartidaDama {
	private Tabuleiro tabuleiro;

	public PartidaDama() {
		super();
		this.tabuleiro = new Tabuleiro(8, 8);
		inicioPartida();
	}
	
	private List<Pecas> pecasNoTabuleiro = new ArrayList<>();
	
	//metodo para retornar matriz de peças
	public PecasDama[][] retornaPecas(){
		PecasDama[][] mat = new PecasDama[tabuleiro.getLinha()][tabuleiro.getColuna()];
		for(int i = 0; i < tabuleiro.getLinha(); i++) {
			for(int j = 0; j < tabuleiro.getColuna(); j++) {
				mat[i][j] = (PecasDama)tabuleiro.peca(i, j);
				
			}
		}
		return mat;
	}
	
	private void novaPosicaoPeca(char coluna, int linha, PecasDama peca) {
		tabuleiro.posicaoPeca(peca, new PosicaoDama(coluna, linha).paraPosicaMatriz());
		pecasNoTabuleiro.add(peca);
	}
	
	public void inicioPartida() {
		novaPosicaoPeca('b', 1, new Peao(tabuleiro, Color.BRANCA));
		novaPosicaoPeca('d', 1, new Peao(tabuleiro, Color.BRANCA));
		novaPosicaoPeca('f', 1, new Peao(tabuleiro, Color.BRANCA));
		novaPosicaoPeca('h', 1, new Peao(tabuleiro, Color.BRANCA));
		novaPosicaoPeca('a', 2, new Peao(tabuleiro, Color.BRANCA));
		novaPosicaoPeca('c', 2, new Peao(tabuleiro, Color.BRANCA));
		novaPosicaoPeca('e', 2, new Peao(tabuleiro, Color.BRANCA));
		novaPosicaoPeca('g', 2, new Peao(tabuleiro, Color.BRANCA));
		novaPosicaoPeca('b', 3, new Peao(tabuleiro, Color.BRANCA));
		novaPosicaoPeca('d', 3, new Peao(tabuleiro, Color.BRANCA));
		novaPosicaoPeca('f', 3, new Peao(tabuleiro, Color.BRANCA));
		novaPosicaoPeca('h', 3, new Peao(tabuleiro, Color.BRANCA));
	}
}
