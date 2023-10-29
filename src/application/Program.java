package application;

import dama.PartidaDama;

public class Program {

	public static void main(String[] args) {
		PartidaDama partida = new PartidaDama();
		Interface.imprimirTabuleiro(partida.retornaPecas());


	}

}
