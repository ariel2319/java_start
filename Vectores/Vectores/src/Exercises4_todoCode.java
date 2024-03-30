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

        double noteTable[][] = new double[4][4];
        String alumnos[] = new String[3];

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese los nombres de los alumnos => ");
        for (int i = 0; i < 3; i++) {
            alumnos[i] = teclado.next();
        }

        //System.out.println(Arrays.toString(alumnos));

        for (int j = 0; j < 3; j++) {
            System.out.println("\tNotas de " + alumnos[j] + ":");
            for (int n = 0; n < 3; n++) {
                System.out.println("Nota " + (n + 1) + ": ");
                noteTable[j][n] = teclado.nextInt();
                noteTable[j][3] += noteTable[j][n];
            }
        }

        System.out.println(Arrays.deepToString(noteTable));

        //IMPRESIÓN FINAL
        System.out.println("Alumno\tNota 1\tNota2\tNota3\tPromedio");
        for (int i = 0; i < 3; i++) {
            System.out.println(alumnos[i] + "\t\t" + noteTable[i][0] + "\t\t" + noteTable[i][1] + "\t\t" + noteTable[i][2] + "\t\t" + (noteTable[i][3] / 3));
        }
    }
}
