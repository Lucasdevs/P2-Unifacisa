package ListaArrays;

import java.util.Arrays;

public class MainArrayMathUtils {

	public static void main(String[] args) {

		int[] divisor = ArrayMathUtils.calculaDivisores(32);
		System.out.println("Divisores: "+Arrays.toString(divisor)+"\n");

		double[] numeros = new double[] { 5.6, 8.9, 8.9, 2.7 };
		System.out.println("Maior Nº: " + ArrayMathUtils.computaMaior(numeros) + "\n");

		System.out.println("Menor Nº: " + ArrayMathUtils.computaMenor(numeros) + "\n");

		System.out.println("Média: " + ArrayMathUtils.computaMedia(numeros) + "\n");

		System.out.println("Repetições: " + ArrayMathUtils.temNumRepetido(numeros)+"\n");

		int m1[][] = new int[][] { { 5, 4}, { 0, 2},{ 1,-1} };
		int m2[][] = new int[][] { { 0, -2}, { 5, -3},{-1, 0}};

		int[][] matriz = ArrayMathUtils.somarMatrizes(m1, m2);
		ArrayMathUtils.arrayToString(matriz);
	}

}
