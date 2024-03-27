/*
Los arreglos (o arrays) son un conjunto de datos que se almacenan en memoria de manera contigua con el mismo nombre, pero con diferentes índices para diferenciar cada un de ellos. Son estructuras fijas que se declaran y que mantienen su tamaño durante toda la ejecución del programa. Si declaro un arreglo de 5 posiciones, mantendrá esas 5 posiciones siempre.

Existen arreglos unidimensionales y bidimensionales. Entre los unidimensionales (una sola dimensión), tenemos a los vectores, a quienes conoceremos en el video a continuación.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //ARRAYS

       /* int reglita[] = new int[3];

//        for (int count = 0; count < 5; count++) {
//            reglita[count] = count * count;
//        }

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese valor para la posición => " + i + 1);
            reglita[i] = teclado.nextInt();
        }

        System.out.println(Arrays.toString(reglita));*/


        //MATRICES

        int matriz[][] = new int[3][3];
        //[0][0]    [0][1]   [0][2]
        //[1][0]    [1][1]   [1][2]
        //[2][0]    [2][1]   [2][2]

        //Asignación (Manual)
        matriz[0][0] = 5;


        //Asignación (Iterada)
        int ancho = 3, alto = 3;
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                matriz[i][j] = j * j * (i + 1);
            }
        }

        System.out.println(Arrays.deepToString(matriz));
    }
}