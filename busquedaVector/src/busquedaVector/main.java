/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedaVector;

import java.util.Arrays;  // Importa la clase Arrays del paquete java.util

/**
 *
 * @author briem
 */
public class main {

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000, 100000};

        for (int size : sizes) {

            // Medir el uso de memoria antes de la transposición
            Runtime runtime = Runtime.getRuntime();
            long totalMemory = runtime.totalMemory();
            long freeMemory = runtime.freeMemory();
            long memoryBefore = totalMemory - freeMemory;

            // Medir el tiempo antes de la transposición
            long startTime = System.nanoTime();

            // Imprimir los resultados antes
            System.out.println("Tiempo de la busqueda antes: " + startTime + " nanosegundos");

            VectorSearch search = new VectorSearch();

            int[] array = search.generateVector(size);

            int key = array[size - 1]; // Buscar el último elemento para el peor caso

            // Imprimir el vector
            System.out.println("Vector de tamaño " + size + ": " + Arrays.toString(array));

            // Búsqueda lineal
            long inicioTiempo = System.nanoTime();
            search.linearSearch(array, key);
            long finTiempo = System.nanoTime();
            long tiempoEjecucionLineal = finTiempo - inicioTiempo;

            // Búsqueda binaria (asegúrate de que el vector esté ordenado)
            Arrays.sort(array);
            inicioTiempo = System.nanoTime();
            search.binarySearch(array, key);
            finTiempo = System.nanoTime();
            long tiempoEjecucionBinaria = finTiempo - inicioTiempo;

            // Uso de memoria
            long memoriaTotal = Runtime.getRuntime().totalMemory();
            long memoriaLibre = Runtime.getRuntime().freeMemory();
            long memoriaUsada = memoriaTotal - memoriaLibre;

            System.out.println("Tamaño del vector: " + size);
            System.out.println("Tiempo de ejecución (Búsqueda Lineal): " + tiempoEjecucionLineal + " ns");
            System.out.println("Tiempo de ejecución (Búsqueda Binaria): " + tiempoEjecucionBinaria + " ns");
            System.out.println("Memoria usada: " + memoriaUsada + " bytes");
            System.out.println();
           
        }

    }
}
