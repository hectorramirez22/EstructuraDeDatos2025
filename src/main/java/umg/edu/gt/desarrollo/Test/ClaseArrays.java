package umg.edu.gt.desarrollo.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays;

class ClaseArrays {

    // Prueba para el Ejercicio 1: Cliente más rico
    @Test
    void testClienteMasRico() {
        int[][] cuentas1 = {{1,2,3}, {3,2,1}};
        assertEquals(6, EjercicioArrays.clienteMasRico(cuentas1));

        int[][] cuentas2 = {{1,5}, {7,3}, {3,5}};
        assertEquals(10, EjercicioArrays.clienteMasRico(cuentas2));

        int[][] cuentas3 = {{2,8,7}, {7,1,3}, {1,9,5}};
        assertEquals(17, EjercicioArrays.clienteMasRico(cuentas3));

        // Prueba forzada a fallar
        int[][] cuentasFallo = {{1,1,1}, {1,1,1}};
        assertEquals(5, EjercicioArrays.clienteMasRico(cuentasFallo)); // Esto fallará a propósito
    }

    // Prueba para el Ejercicio 2: Ordenar diagonales de una matriz
    @Test
    void testOrdenarDiagonales() {
        int[][] mat1 = {{3,3,1,1}, {2,2,1,2}, {1,1,1,2}};
        int[][] expected1 = {{1,1,1,1}, {1,2,2,2}, {1,2,3,3}};
        assertArrayEquals(expected1, EjercicioArrays.ordenarDiagonales(mat1));

        int[][] mat2 = {{11,25,66,1,69,7}, {23,55,17,45,15,52}, {75,31,36,44,58,8}, {22,27,33,25,68,4}, {84,28,14,11,5,50}};
        int[][] expected2 = {{5,17,4,1,52,7}, {11,11,25,45,8,69}, {14,23,25,44,58,15}, {22,27,31,36,50,66}, {84,28,75,33,55,68}};
        assertArrayEquals(expected2, EjercicioArrays.ordenarDiagonales(mat2));
    }

    // Prueba para el Ejercicio 3: Suma de todos los elementos de la matriz
    @Test
    void testSumaMatriz() {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(45, EjercicioArrays.sumaMatriz(mat1));

        int[][] mat2 = {{10, 20}, {30, 40}};
        assertEquals(100, EjercicioArrays.sumaMatriz(mat2));

        int[][] mat3 = {{1,1,1}, {1,1,1}, {1,1,1}};
        assertEquals(9, EjercicioArrays.sumaMatriz(mat3));
    }
}
