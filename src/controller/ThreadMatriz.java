package controller;

public class ThreadMatriz extends Thread {

	private int[][] valores;
	private int op;

	public ThreadMatriz(int[][] valores, int op) {

		this.valores = valores;
		this.op = op;
	}

	public void run() {

		Soma_linhas(valores, op);
	}

	public int[][] Soma_linhas(int[][] mat, int op) {

		int soma = 0;

		switch (op) {

		case 0:

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 5; j++) {
					mat[i][j] = valores[i][j];
					if (i == 0) {

						soma = soma + mat[i][j];
					}
				}
			}
			System.out.println("A Soma da Primeira Linha é: " + soma);

			break;

		case 1:

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 5; j++) {

					mat[i][j] = valores[i][j];
					if (i == 1) {

						soma = soma + mat[i][j];
					}
				}
			}
			System.out.println("A Soma da Segunda Linha é: " + soma);

			break;

		case 2:

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 5; j++) {

					mat[i][j] = valores[i][j];

					if (i == 2) {

						soma = soma + mat[i][j];
					}
				}
			}
			System.out.println("A Soma da Terceira Linha é: " + soma);

			break;

		}
		return mat;
	}

}
