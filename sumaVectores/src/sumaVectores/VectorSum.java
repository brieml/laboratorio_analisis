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
public class VectorSum {

    public int[] ValorA;
    // Tamaño de los vectores (N elementos)
    int size;

    // Constructor para inicializar el vector
    public VectorSum(int size) {
        this.size = size;
        ValorA = new int[size];
    }

    // Método para llenar el vector con valores secuenciales
    public void createVector() {
        for (int i = 0; i < ValorA.length; i++) {
            ValorA[i] = i + 1;
        }
    }

    // Método para sumar dos vectores
    public VectorSum sumVectors(VectorSum vectorB) {
        if (this.ValorA.length != vectorB.ValorA.length) {
            throw new IllegalArgumentException("Los vectores deben tener el mismo tamaño");
        }
        VectorSum result = new VectorSum(this.ValorA.length);
        for (int i = 0; i < this.ValorA.length; i++) {
            result.ValorA[i] = this.ValorA[i] + vectorB.ValorA[i];
        }
        return result;
    }

    // Método para convertir el vector a una cadena de texto
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < ValorA.length; i++) {
            sb.append(ValorA[i]);
            if (i < ValorA.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
       
    }

}
