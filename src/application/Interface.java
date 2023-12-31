package application;

import dama.PecasDama;

public class Interface {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	
	//metodo para imprimir o tabuleiro
	public static void imprimirTabuleiro(PecasDama[][] pecas) {
		for(int i = 0; i < 8; i++) {
			System.out.print(8 - i +"");
			
			for(int j = 0; j <  8; j++) {
				imprimirPeca(pecas[i][j]);
				
				if(i % 2 == 0 || j % 2 != 0) {
					System.out.print(ANSI_GREEN_BACKGROUND);
				}
			}	
			
			System.out.println();
		}
		
				
		System.out.println("  a  b  c  d  e  f  g  h");
		
	}
	
	public static void imprimirPeca(PecasDama p) {
		if(p == null) {
			System.out.print(" - ");
		}else {

			System.out.print(" "+p+" "  );
		}
				
	}
}
