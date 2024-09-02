/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransposicionMatriz;

/**
 *
 * @author briem
 */
public class main {

    public static void main(String[] args) {
        int[] sizes = {50, 500, 1050}; // Tamaños de matrices a probar

        for (int size : sizes) {

            // Medir tiempo de ejecución para la transposición
            long startTimes = System.nanoTime();
            System.out.println("Tiempo de ejecución antes: " + startTimes + " ns");

            MatrixTranspose matrixTranspose = new MatrixTranspose(size, size);

            matrixTranspose.generateMatrix();
            System.out.println("Matriz original de tamaño " + size + "x" + size + ":");
            matrixTranspose.printMatrix();

            MatrixTranspose ressult = matrixTranspose.transpose();
            long endTime = System.nanoTime();
            long ExecutionTime = endTime - startTimes;

            // Medir uso de memoria
            long TotalMemory = Runtime.getRuntime().totalMemory();
            long freeMemory = Runtime.getRuntime().freeMemory();
            long memoryUsed = TotalMemory - freeMemory;

            System.out.println("Matriz transpuesta de tamaño " + size + "x" + size + ":");
            ressult.printMatrix();
            System.out.println("Tiempo de ejecución: " + ExecutionTime + " ns");
            System.out.println("Memoria usada: " + memoryUsed + " bytes");
            System.out.println();
         
        }

    }
}
