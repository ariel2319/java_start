import java.util.Scanner;
import java.util.Arrays;
public class Exercises4_todoCode {
    public static void main(String[] args) {

        //EJERCICIO 1
        /*
        Cargar 15 números en un vector
        Contar e informar cuántas veces se cargó el número 3
         */

       /* int countV = 5, count3 = 0;
        int vector1[] = new int[countV];

        Scanner numerosT = new Scanner(System.in);

        System.out.println("Llename el array papá => ");
        for (int i = 0; i < countV; i++) {
            System.out.println("Pos " + i + " => ");
            vector1[i] = numerosT.nextInt();

            if (vector1[i] == 3) count3++;
        }


        System.out.println(Arrays.toString(vector1));
        System.out.println("En la lista hay " + count3 + " números 3 cargados..");*/

        //EJERCICIO 2
        /*
        En una tabla de 4x4 se guardan las notas de 4 alumnos. Cada fila corresponde a las notas y promedio de cada alumno
        El docente debe poder cargar 3 notas x alumno y mostrar el promedio de la 4ta nota
        Mostrar las 3 notas y el promedio..
         */

        int noteTable[][] = new int[4][4];
        String alumnos[] = new String[3];

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese los nombres de los alumnos => ");
        for (int i = 0; i < 3; i++) {
            alumnos[i] = teclado.next();
        }

        System.out.println(Arrays.toString(alumnos));
    }
}
