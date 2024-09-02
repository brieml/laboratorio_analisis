/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaVectores;

/**
 *
 * @author briem
 */
public class main {

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 50000}; // Tamaños de vectores a probar

        for (int size : sizes) {

            /* === Medir tiempo de ejecución para la suma === */
            // Medir el tiempo de inicio
            long startTime = System.nanoTime();

            // Calcular el tiempo de ejecución de inicio
            long timeBefore = System.nanoTime() - startTime;

            System.out.println("Tiempo de ejecución antes: " + timeBefore + " ns");

            //Inicializo los dos vectores tanto A como B
            VectorSum vectorA = new VectorSum(size);
            VectorSum vectorB = new VectorSum(size);

            //Creo los vectores
            vectorA.createVector();
            vectorB.createVector();

            //Impimo los vectores
            System.out.println("Vector 1 de tamaño " + size + ": " + vectorA);
            System.out.println("Vector 2 de tamaño " + size + ": " + vectorB);
            // Sumar los vectores
            VectorSum result = vectorA.sumVectors(vectorB);

            // Medir el tiempo de finalización
            long endTime = System.nanoTime();

            // Calcular el tiempo de ejecución
            long duration = endTime - startTime;

            // Medir uso de memoria
            long totalMemory = Runtime.getRuntime().totalMemory();
            long freeMemory = Runtime.getRuntime().freeMemory();
            long usedMemory = totalMemory - freeMemory;

            System.out.println("Vector suma de tamaño " + size + ": " + result);
            System.out.println("Tiempo de ejecución: " + duration + " ns");
            System.out.println("Memoria usada: " + usedMemory + " bytes");
            System.out.println();
            
        }

    }
}
