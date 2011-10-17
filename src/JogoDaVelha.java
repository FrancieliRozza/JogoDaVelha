import java.util.Scanner;
import java.util.Vector;


public class JogoDaVelha {
	
	public static void main(String[] args) throws JogoDaVelhaException {
		String[][] tabuleiro = inicializar();
		Scanner entrada = new Scanner(System.in);

		while(true) {
		System.out.print("Faca uma jogada: ");
		String jogadaString = entrada.nextLine();

		Vector jogadaVector = interpretarJogada(jogadaString);

		String jogador = (String) jogadaVector.get(0);
		int linha = (Integer) jogadaVector.get(1);
		int coluna = (Integer) jogadaVector.get(2);

		jogar(tabuleiro, linha, coluna, jogador);
		boolean jogadorXGanhou = existeGanhador(tabuleiro, "X");
		boolean jogadorOGanhou = existeGanhador(tabuleiro, "O");

		mostrarTabuleiro(tabuleiro);

		if(jogadorXGanhou || jogadorOGanhou) {
			System.out.println("Fim do jogo. Existe ganhador");
			} else {

			}
		}
	}
	
	public static void mostrarTabuleiro(String[][] tabuleiro) {
		for(int i = 0; i < tabuleiro.length; i++) {
			for(int j = 0; j < tabuleiro.length; j++) {
				System.out.print(tabuleiro[i][j] + " | ");
			}
			System.out.println("");
		}
	}
	
	public static Vector interpretarJogada(String jogadaString) {
		String[] jogadaSeparada = jogadaString.split(" ");

		int linha = Integer.parseInt(jogadaSeparada[1]);
		int coluna = Integer.parseInt(jogadaSeparada[2]);

		Vector jogadaVector = new Vector();
		jogadaVector.add(jogadaSeparada[0]);
		jogadaVector.add(linha);
		jogadaVector.add(coluna);
		return jogadaVector;
	}

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
		
		if("X".equals(tabuleiro[0][0]) && "X".equals(tabuleiro[1][1]) && "X".equals(tabuleiro[2][2]) ){
			
			System.out.println("O jogador X ganhou!");
			return true;
		}
		
		if("X".equals(tabuleiro[2][0]) && "X".equals(tabuleiro[1][1]) && "X".equals(tabuleiro[0][2]) ){
			
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
		
		if("O".equals(tabuleiro[0][0]) && "O".equals(tabuleiro[1][1]) && "O".equals(tabuleiro[2][2]) ){
			
			System.out.println("O jogador O ganhou!");// falta testar
			return true;
		}
		
		if("O".equals(tabuleiro[2][0]) && "O".equals(tabuleiro[1][1]) && "O".equals(tabuleiro[0][2]) ){
			
			System.out.println("O jogador O ganhou!");// falta testar
			return true;
		}
		
		return false;
	}
}

