package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;

import java.util.*;

public class EjercicioArrays {

	// Ejercicio 1: Encuentra la riqueza del cliente más rico
	public static int clienteMasRico(int[][] cuentas) {
		int maxRiqueza = 0;
		for (int[] cliente : cuentas) {
			int riquezaActual = 0;
			for (int dinero : cliente) {
				riquezaActual += dinero;
			}
			maxRiqueza = Math.max(maxRiqueza, riquezaActual);
		}
		return maxRiqueza;
	}

	// Ejercicio 2: Ordenar diagonales de una matriz en orden ascendente
	public static int[][] ordenarDiagonales(int[][] mat) {
		int m = mat.length, n = mat[0].length;
		Map<Integer, PriorityQueue<Integer>> diagonales = new HashMap<>();

		// Guardar los valores de cada diagonal en un min-heap (PriorityQueue)
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				diagonales.putIfAbsent(i - j, new PriorityQueue<>());
				diagonales.get(i - j).add(mat[i][j]);
			}
		}

		// Reemplazar los valores en la matriz con los valores ordenados de la diagonal
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = diagonales.get(i - j).poll();
			}
		}

		return mat;
	}

	// Ejercicio 3: Sumar todos los elementos de una matriz
	public static int sumaMatriz(int[][] mat) {
		int suma = 0;
		for (int[] fila : mat) {
			for (int num : fila) {
				suma += num;
			}
		}
		return suma;
	}
}
