package ListaArrays;

import java.util.Arrays;

public class ArrayMathUtils {

	public static int[] calculaDivisores(int num) {
		int y = 0;
		int resultado = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				resultado++;
			}
		}
		int[] divisores = new int[resultado];
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisores[y] = i;
				y += 1;
			}
		}
		return divisores;
	}

	public static double computaMaior(double[] numeros) {
		Arrays.sort(numeros);
		int a = numeros.length - 1;
		return numeros[a];
	}

	public static double computaMenor(double[] numeros) {
		Arrays.sort(numeros);
		return numeros[0];
	}

	public static double computaMedia(double[] numeros) {
		double valor = 0.0;
		for (int i = 0; i < numeros.length; i++)
			valor += numeros[i];
		return valor / numeros.length;
	}

	public static boolean temNumRepetido(double[] numeros) {
		boolean temRepetido = false;
		int x = 0;
		while (x + 1 < numeros.length) {
			int y = x + 1;

			while (y < numeros.length) {
				if (numeros[x] == numeros[y]) {
					temRepetido = true;
				}
				y++;
			}
			x++;
		}
		return temRepetido;
	}

	public static int[][] somarMatrizes(int[][] m1, int[][] m2) {
		int[][] m3 = new int[m1.length][];

		for (int i = 0; i < m3.length; i++) {
			int q = m1[i].length;
			m3[i] = new int[q];
			for (int j = 0; j < q; j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return m3;
	}

	public static String arrayToString(int[][] a) {
		String saida = "";
		System.out.println("[SOMA DAS MATRIZES]");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(" "+a[i][j]);
			}
			saida += "\n";
		}
		return saida;
	}

}
