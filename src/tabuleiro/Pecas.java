package tabuleiro;

public class Pecas {
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Pecas(Tabuleiro tabuleiro) {
		super();
		this.tabuleiro = tabuleiro;
		this.posicao = null;
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	
}
