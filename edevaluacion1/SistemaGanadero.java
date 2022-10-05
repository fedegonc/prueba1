package edevaluacion1;

/*Calcule alguns dados correspondentes aos animais de uma fazenda. 
Os animais pertencem a espécies diferentes, a saber: bovinos, ovinos e caprinos.
Construa procedimento para calcular e apresentar a média de peso de cada 
espécie para os animais do sexo feminino e do sexo masculino. Com base em dados fornecidos pelo usuário,
faça também o algoritmo chamador. 
Utilize a linguagem Java para resolver e implemente métodos.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaGanadero {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int menu;
        while (true) {

            while (true) {
                try {
                    System.out.println("Ingrese la especie o digite 0 para salir: ");
                    System.out.println("Bovino: 1");
                    System.out.println("Caprino: 2 ");
                    System.out.println("Bovino: 3");

                    menu = new Scanner(System.in).nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Informe um numero");
                }
            }
            if (menu == 0) {
                break;
            }
            int cantidad = 0;

            switch (menu) {
                case 1 -> {
                    while (true) {
                        try {
                            while (true) {

                                System.out.println("Ingrese la cantidad de individuos: ");
                                cantidad = new Scanner(System.in).nextInt();
                                if (cantidad > 0) {
                                    break;
                                } else {
                                    System.out.println("Ingrese una cantidad positiva");
                                }
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Informe un tipo numerico");
                        }
                    }

                    calculadora(cantidad);
                }
                case 2 -> {
                    while (true) {
                        try {
                            while (true) {

                                System.out.println("Ingrese la cantidad de individuos: ");
                                cantidad = new Scanner(System.in).nextInt();
                                if (cantidad > 0) {
                                    break;
                                } else {
                                    System.out.println("Ingrese una cantidad positiva");
                                }
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Informe un tipo numerico");
                        }
                    }

                    calculadora(cantidad);
                }
                case 3 -> {
                    while (true) {
                        try {
                            while (true) {

                                System.out.println("Ingrese la cantidad de individuos: ");
                                cantidad = new Scanner(System.in).nextInt();
                                if (cantidad > 0) {
                                    break;
                                } else {
                                    System.out.println("Ingrese una cantidad positiva");
                                }
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Informe un tipo numerico");
                        }
                    }

                    calculadora(cantidad);
                }

            }
        }
    }

    static void calculadora(int cantidad) {

        float mediaM, mediaF;
        mediaM = mediaF = 0;

        int sumaPesosF, sumaPesosM, f, m;

        sumaPesosM = sumaPesosF = f = m = 0;

        int[] pesos = new int[cantidad];
        String[] sexos = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {

            while (true) {
                try {
                    while (true) {

                        System.out.println("ingrese el peso del animal");
                        pesos[i] = new Scanner(System.in).nextInt();
                        if (cantidad > 0) {
                            break;
                        } else {
                            System.out.println("Ingrese una cantidad positiva");
                        }
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Informe un tipo numerico");
                }
            }

            while (true) {
                System.out.println("ingrese el sexo del animal");
                sexos[i] = new Scanner(System.in).nextLine();
                if (sexos[i].equalsIgnoreCase("f") || sexos[i].equalsIgnoreCase("m")) {
                    break;
                } else {
                    System.out.println("Digite f o m ");
                }
            }

        }

        for (int i = 0; i < cantidad; i++) {
            if (sexos[i].equalsIgnoreCase("f")) {
                sumaPesosF = sumaPesosF + pesos[i];
                f++;
            }
            if (sexos[i].equalsIgnoreCase("m")) {
                sumaPesosM = sumaPesosM + pesos[i];
                m++;
            }

        }

        mediaM = (float) sumaPesosM / m;
        mediaF = (float) sumaPesosF / f;

       // mediaM = (mediaM > 0) ? mediaM : 0;
       // mediaF = (mediaF > 0) ? mediaF : 0;

        System.out.println("la media de las hembras es: " + mediaF+ "Kg");

        System.out.println("la media de los machos es: " + mediaM+ "Kg \n");

    }
}