import java.util.Scanner;

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

        /*double noteTable[][] = new double[4][4];
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
        }*/


        //EJERCICIO 3
        /*
        3 vectores => 1ro nombre de ciudades; 2do t° mínimas; 3ro t° máximas
        Programa que permita la carga de los datos; luego debe informar la ciudad con la t° más baja y cual la más alta, mostrando ciudad y t°
         */

        int cantDatos = 3;
        String[] city = new String[cantDatos];
        double[] minT = new double[cantDatos];
        double[] maxT = new double[cantDatos];

        Scanner teclado = new Scanner(System.in);
        System.out.println("\tLlename de Datos :)");
        for (int count = 0; count < cantDatos; count++) {
            System.out.printf("Ciudad Plis => ");
            city[count] = teclado.next();
            System.out.printf("T° Mínima => ");
            minT[count] = teclado.nextDouble();
            System.out.printf("T° Máxima => ");
            maxT[count] = teclado.nextDouble();
        }


        double aux = minT[0];
        int posMin = 0, posMax = 0;
        for (int i = 0; i < minT.length; i++) {
            if (aux > minT[i]) {
                aux = minT[i];
                posMin = i;
            }
        }

        aux = maxT[0];
        for (int i = 0; i < maxT.length; i++) {
            if (aux < maxT[i]) {
                aux = maxT[i];
                posMax = i;
            }
        }

        //System.out.println("posición  =>  temperatura" + posMin + "  =>  " + aux);
        System.out.println("minima =>" + minT[posMin] + "\t Ciudad => " + city[posMin]);
        System.out.println("máxima =>" + maxT[posMax] + "\t Ciudad => " + city[posMax]);
        //System.out.println(Arrays.toString(city));

    }
}
