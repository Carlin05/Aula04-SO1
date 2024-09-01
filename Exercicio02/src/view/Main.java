package view;

import java.util.Random;
import controller.ThreadCalc;

public class Main {
	public static void main(String[]Args) {
		int[][] matriz = new int[3][5];
		matriz = valorAleatorio(matriz);
		for(int i = 0; i < matriz.length; i++) {
			ThreadCalc th = new ThreadCalc(matriz[i], i + 1);
			th.start();
		}
	}
	private static int[][] valorAleatorio(int[][]matriz){
		Random random = new Random();
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(1001);
			}
		}
		return matriz;	
	}
}
