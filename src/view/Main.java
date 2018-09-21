package view;
import java.util.Random;
import controller.ThreadMatriz;

public class Main {

	public static void main(String[] args) {

		Random r = new Random();

		int[][] valores = new int[3][5];

		Exibir_Matriz(r, valores);
		
		ThreadMatriz linha_Um = new ThreadMatriz(valores, 0);
		ThreadMatriz linha_Dois = new ThreadMatriz(valores, 1);
		ThreadMatriz linha_Tres = new ThreadMatriz(valores, 2);

		linha_Um.start();
		linha_Dois.start();
		linha_Tres.start();

	}

	public static void Exibir_Matriz(Random r, int[][] valores) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				valores[i][j] = r.nextInt(8) + 1;
				System.out.print(valores[i][j] + " ");
			}
			System.out.println("	");
		}
	}

}
