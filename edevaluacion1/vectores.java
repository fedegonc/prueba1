package edevaluacion1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Construa um menu com as opções de escolha a seguir. 

Para cada opção escreva um procedimento ou uma função apropriados: 

a) Preencha um vetor de inteiros com 30 posições; 

b) Identifique o maior elemento do vetor e apresente-o; 

c) Identifique o menor valor do vetor e apresente-o; 

d) Calcule a soma entre os elementos do vetor; 

e) Calcule a média entre os elementos do vetor; 

f) Apresente o elemento de uma determinada posição indicada pelo usuário; 

g) Saia do programa; 

 Dica: Para realizar as operações b, c, d, e, e f, o vetor deve ter sido preenchido. 

Caso contrário, deve ser apresentada uma mensagem ao usuário informando que o vetor está vazio
 */
public class vectores {

    public static void main(String[] args) {

        int[] vect = new int[30];

        System.arraycopy(llenarVector(), 0, vect, 0, llenarVector().length);

        System.out.println(Arrays.toString(vect));

        int menu;
        while (true) {
            while (true) {
                try {
                    System.out.println("Ingrese la opcion o digite 0 para salir: ");
                    System.out.println("Elemento Mayor: 1");
                    System.out.println("Elemento Menor: 2 ");
                    System.out.println("Suma: 3");
                    System.out.println("Media: 4");
                    System.out.println("Elegir: 5");

                    menu = new Scanner(System.in).nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Informe um numero");
                }
            }
            if (menu == 0) {
                break;
            }

            switch (menu) {
                case 1 ->
                    elementoMayor(vect);
                case 2 ->
                    elementoMenor(vect);
                case 3 ->
                    suma(vect);
                case 4 ->
                    media(vect);
                case 5 ->
                    elegir(vect);

            }

        }
    }

    static int[] llenarVector() {

        int[] valores = new int[30];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (1 + Math.random() * 10);
        }
        return valores;
    }

    static int elementoMayor(int[] vect) {
        int mayor = 0;

        for (int i = 0; i < vect.length; i++) {

            if (vect[i] > mayor) {
                mayor = vect[i];
            }

        }
        System.out.println("el mayor elemento es: " + mayor);

        return mayor;

    }

    static int elementoMenor(int[] vect) {
        int menor = vect[0];

        for (int i = 0; i < vect.length; i++) {

            if (vect[i] < menor) {
                menor = vect[i];
            }

        }
        System.out.println("el menor elemento es: " + menor);

        return menor;

    }

    static int suma(int[] vect) {
        int suma = 0;

        for (int i = 0; i < vect.length; i++) {

            suma = suma + vect[i];

        }
        System.out.println("la suma es: " + suma);

        return suma;

    }

    static float media(int[] vect) {
        int suma = 0;
        float media;

        for (int i = 0; i < vect.length; i++) {

            suma = suma + vect[i];

        }
        media = (float) suma / vect.length;
        System.out.println("la media es: " + media);

        return suma;

    }

    static void elegir(int[] vect) {
        System.out.println("ingrese la posicion de un determinado elemento empezando de 1");
        int posicion = new Scanner(System.in).nextInt();

        posicion = posicion - 1;

        if (posicion <= 30) {

            System.out.println(Arrays.toString(vect));
            System.out.println(vect[posicion]);

        } else {
            System.out.println("Indice mayor de 30");

        }

    }

}
