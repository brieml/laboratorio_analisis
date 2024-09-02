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
public class MatrixTranspose {

    public int[][] matriz;
    public int rows;
    public int columns;

    public MatrixTranspose(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matriz = new int[rows][columns];
    }

    // Método para transponer una matriz
    public MatrixTranspose transpose() {

        MatrixTranspose transposedMatrix = new MatrixTranspose(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix.matriz[j][i] = this.matriz[i][j];
            }
        }
        return transposedMatrix;
    }

    // Método para llenar la matriz con valores secuenciales
    public void generateMatrix() {
        int valor = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matriz[i][j] = valor++;
            }
        }
    }

    // Método para imprimir la matriz
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        
        }
    
    }

}
