package tabuleiro;

public class Posicao {
	private int linha;
	private int coluna;
	
	//construtor
	public Posicao(int linha, int coluna) {
		super();
		this.linha = linha;
		this.coluna = coluna;
	}
	
	//metodos get e set
	public int getLinha() {
		return linha;
	}


	public int getColuna() {
		return coluna;
	}

	
	//metodo para alterar o valor da posição
	public void novaPosicao(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
}
