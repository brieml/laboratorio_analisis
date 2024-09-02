/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedaVector;

/**
 *
 * @author briem
 */
public class VectorSearch {
    // Método para realizar creacion del vector

    public int[] generateVector(int size) {
        int[] vector = new int[size];
        for (int i = 0; i < size; i++) {
            vector[i] = i;
        }
        return vector;
    }

    // Método para realizar una búsqueda lineal
    public int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Retorna el índice donde se encuentra el elemento
            }
        }
        return -1; // Retorna -1 si el elemento no se encuentra
    }

    // Método para realizar una búsqueda binaria
    public int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid; // Retorna el índice donde se encuentra el elemento
            }
            if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Retorna -1 si el elemento no se encuentra

    }

}
