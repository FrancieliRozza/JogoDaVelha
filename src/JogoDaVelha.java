public class JogoDaVelha {

	public static String[][] inicializar() {
		String[][] tabuleiroEsperado = new String[][] {{"", "", ""}, 
	  													{"", "", ""}, 
	  													{"", "", ""}};

		return tabuleiroEsperado;
	}

	public static void jogar(String[][] tabuleiro, int i, int j, String jogador) throws JogoDaVelhaException {
		
		if (i >= 0 && i <= 2 && j >= 0 && j <= 2){ // posições válidas
			if ("".equals(tabuleiro [i][j])){
				tabuleiro [i][j] = jogador;
			} else {
				throw new JogoDaVelhaException("Jogada Inválida");
			}
		} else {
			throw new JogoDaVelhaException("Posição Inválida");
		}
	}

	public static boolean existeGanhador(String[][] tabuleiro, String jogador) {
		
		if("X".equals(tabuleiro[0][0]) && "X".equals(tabuleiro[0][1]) && "X".equals(tabuleiro[0][2]) ){
			
			System.out.println("O jogador X ganhou!");
			return true;
		}
		

		if("X".equals(tabuleiro[1][0]) && "X".equals(tabuleiro[1][1]) && "X".equals(tabuleiro[1][2]) ){
			
			System.out.println("O jogador X ganhou!");
			return true;
		}
		

		if("X".equals(tabuleiro[2][0]) && "X".equals(tabuleiro[2][1]) && "X".equals(tabuleiro[2][2]) ){
			
			System.out.println("O jogador X ganhou!");
			return true;
		}
		
		
		
		
		if("O".equals(tabuleiro[0][0]) && "O".equals(tabuleiro[0][1]) && "O".equals(tabuleiro[0][2]) ){
			
			System.out.println("O jogador O ganhou!");
			return true;
		}
		

		if("O".equals(tabuleiro[1][0]) && "O".equals(tabuleiro[1][1]) && "O".equals(tabuleiro[1][2]) ){
			
			System.out.println("O jogador O ganhou!");
			return true;
		}
		

		if("O".equals(tabuleiro[2][0]) && "O".equals(tabuleiro[2][1]) && "O".equals(tabuleiro[2][2]) ){
			
			System.out.println("O jogador O ganhou!");
			return true;
		}
		
		return false;
	}
}

