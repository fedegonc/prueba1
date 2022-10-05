package edevaluacion1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Faça um procedimento que receba uma matriz MAT(10,10), por parâmetro, e realize as seguintes operações:

trocar a linha 2 com a linha 8;
trocar os valores ímpares da diagonal principal por 1 e os pares por 0;
a linha 5 com a coluna 10;
Utilizar um método para cada operação.

O procedimento deve retornar a matriz alterada.

 */
public class matrices {

    public static void main(String[] args) {

        int MAT[][] = new int[10][10];
        
        Scanner input = new Scanner(System.in);
        int varmenu = 0;
        while (varmenu < 5) {

           
            System.out.println("1 - Llenar matriz");
            System.out.println("2 - cambiar filas x fila");
            System.out.println("3 - cambiar fila x columnas");
            System.out.println("4 - diagonal con ceros y unos");

            while (true) {
                try {
                    input = new Scanner(System.in);
                    varmenu = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Informe um numero");
                }
            }

            switch (varmenu) {
                case 1:
                    printMatriz(llenarMatriz(MAT));
                    break;

                case 2:
                    printMatriz(filaXfila(MAT));
                    break;

                case 3:
                    printMatriz(filaXcolumna(MAT));
                    break;
                
                case 4:
                    printMatriz(diagonalCerosUnos(MAT));
                    break;
                    

            }

        }
        
        
        

    }

    static int[][] llenarMatriz(int MAT[][]) {

        for (int i = 0; i < MAT.length; i++) {
            for (int j = 0; j < MAT.length; j++) {

                MAT[i][j] = (int) (1 + Math.random() * 10);

            }

        }
        return MAT;

    }

    static void printMatriz(int MAT[][]) {
        for (int i = 0; i < MAT.length; i++) {
            for (int j = 0; j < MAT.length; j++) {

                System.out.print(MAT[i][j] + "\t");

            }
            System.out.println("");

        }
        System.out.println("");
    }

    static int[][] filaXfila(int MAT[][]) {
        int temp;
        for (int i = 0; i < MAT.length; i++) {

            temp = MAT[2][i];
            MAT[2][i] = MAT[8][i];
            MAT[8][i] = temp;

        }
        return MAT;
    }

    static int[][] diagonalCerosUnos(int MAT[][]) {
        for (int i = 0; i < MAT.length; i++) {
            for (int j = 0; j < MAT.length; j++) {

                if (j == i) {
                    if (MAT[i][j] % 2 == 0) {
                        MAT[i][j] = 0;
                        
                    } else {
                        MAT[i][j] = 1;
                    }
                }

            }
        }
        return MAT;
    }

    static int[][] filaXcolumna(int MAT[][]) {
        int temp;
        
        for (int i = 0; i < MAT.length; i++) {

            temp = MAT[i][9];
            MAT[i][9] = MAT[4][i];
            MAT[4][i] = temp;

        }

        return MAT;
    }
}
