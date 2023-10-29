package tabuleiro;

public class Tabuleiro {
	private int linha;
	private int coluna;
	private Pecas[][] pecas;
	
	//construtor tabuleiro
	public Tabuleiro(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		pecas = new Pecas[linha][coluna];
	}
	
	//metodos get
	public int getLinha() {
		return linha;
	}
	public int getColuna() {
		return coluna;
	}

	public Pecas[][] getPecas() {
		return pecas;
	}
	
	//metodo para retornar uma peça passanto uma linha e uma coluna
	public Pecas peca(int linha, int coluna) {
		return pecas[linha][coluna];
	}
	
	//metodo para colocar uma peça no tabuleiro
	public void posicaoPeca(Pecas p, Posicao po) {
		pecas[po.getLinha()][po.getColuna()] = p;
		p.posicao = po;
	}
}
