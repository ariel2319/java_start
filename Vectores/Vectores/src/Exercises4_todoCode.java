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
        /*

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
*/

        //EJERCICIO 4
        /*
        compañía de vuelo cuenta con 6 destinos a los que realiza 3 vuelos diarios, mañana, mediodía y noche. Administrar con una matriz:  6x3
        1ro=> cargar la matriz del programa con cant de asientos disponibles en cada vuelo
        2do=> un usuario debe poder ingresar el número de destino al que quiere dirigirse (índice) y en el horario (también por índice) y cantidad de pasajes que necesita
        3ro=> operación exitosa => "su reserva fue realizada con éxito"
            operación rechazada => "disculpe, no se pudo completar su operación dado que no hay asientos disponibles"
           4to => finalizar operaciones => ingresar "finish"
         */

        Scanner teclado = new Scanner(System.in);
        int vuelos[][] = new int[6][3];
        String[] city = new String[]{"Cancún", "Madrid", "Iguazú", "Milán", "Roma", "París"};
        String[] horario = new String[]{"Mañana", "Mediodía", "Noche"};

        //llenado de viajes
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("posición => (" + i + "," + j + ")");
                vuelos[i][j] = teclado.nextInt();
            }
        }
        //System.out.println(Arrays.deepT1oString(vuelos));
        //imprimir tabla
        //imprimirTabla(vuelos, city);

        String control = "continue";
        int codDestino, codHorario, cantAsientos;

        while (control == "continue") {
            imprimirTabla(vuelos, city);
            System.out.println("\nPor favor Ingrese su destino:\n0 - Cancún\n1 - Madrid\n2 - Iguazú\n3 - Milán\n4 - Roma\n5 - París");
            codDestino = teclado.nextInt();
            System.out.println("Ingrese horario de vuelo:\n0 - Mañana\n1 - Mediodía\n2 - Noche ");
            codHorario = teclado.nextInt();
            System.out.printf("Cantidad de asientos a reservar: ");
            cantAsientos = teclado.nextInt();

            //System.out.println("Destino: " + city[codDestino] + "\tHorario: " + horario[codHorario] + "\tAsientos: " + cantAsientos);

            //Control Stock viajes
            //3ro=> operación exitosa => "su reserva fue realizada con éxito" operación rechazada => "disculpe, no se pudo completar su operación dado que no hay asientos disponibles"

            if (cantAsientos <= vuelos[codDestino][codHorario]) {
                vuelos[codDestino][codHorario] -= cantAsientos;
                System.out.println("\nSu reserva fue realizada con éxito :D\n");

            } else {
                System.out.println("\nDisculpe, no se pudo completar su operación dado que no hay asientos disponibles :( \n");
            }


            //Salida del sistema
            System.out.printf("\n¿Desea reservar más viajes? s/n\t");
            control = teclado.next();
            control = control.toLowerCase();
            System.out.println("control => " + control);
            if (control.equals("n")) {
                control = "finish";
                System.out.println("\n\tGracias por Utilizar Nuestro SISTEMA\n");
            } else {
                control = "continue";
                imprimirTabla(vuelos, city);
            }
            System.out.println("control => " + control);
        }

    }

    public static void imprimirTabla(int[][] tabla, String city[]) {

        System.out.println("\n\n\t\tMañ\tMed\tNoc");

        for (int i = 0; i < 6; i++) {
            System.out.println(city[i] + "\t" + tabla[i][0] + "\t" + tabla[i][1] + "\t" + tabla[i][2]);
        }
    }
}
