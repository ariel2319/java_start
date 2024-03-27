import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //EJERCICIO 1 => dar por teclado un límite numérico y que muestre los números hasta ese límite
        /*
        System.out.println("Che necesito el límite de números a mostrar => ");
        int limite = teclado.nextInt();

        for (int count = 1; count < limite; count++) System.out.println("Número: " + count);

        System.out.println("Límite: " + limite);*/


        //EJERCICIO 2 => IMC - se brinda por teclado el peso de la persona en KG y estatura en M
        // => cálculo: kg / (M)(M)
        /*System.out.println("\t Cálculo IMC");
        System.out.println("Necesito tu peso en KG: ");
        double peso = teclado.nextDouble();

        System.out.println("Necesito tu altura en M: ");
        double altura = teclado.nextDouble();*/
        /*IMC
        Nivel de peso
        Por debajo de 18.5	Bajo peso
        18.5 – 24.9	Normal
        25.0 – 29.9	Sobrepeso
        30.0 o más	Obesidad*/
        /*double IMC = peso / (altura * altura);
        String nivelPeso = " ";
        if (IMC <= 18.5) nivelPeso = "Bajo Peso :(";
        if (IMC > 18.5 && IMC <= 24.9) nivelPeso = "Normal :D";
        if (IMC > 24.9 && IMC <= 29.9) nivelPeso = "Sobrepeso :/";
        if (IMC > 29.9) nivelPeso = "Obesidad :C";

        System.out.println("\t\t Su IMC es => " + IMC + "\nTu nivel de Peso es: " + nivelPeso);
*/

        //EJERCICIO 3 => En la ciudad de Oberá, Misiones se realiza año a año la “Maratón del Inmigrante” en el marco de la Fiesta Nacional del Inmigrante. El evento cuenta con un día de inscripciones el día anterior a la carrera, por lo que se desconoce la cantidad exacta de inscriptos que puede llegar a haber.
        //
        /*       //Desde la Federación de Colectividades (Organismo que organiza), manifestaron que se solicitan los siguientes datos para la inscripción de cada participante: dni, nombre y edad.
        //
        //En cuanto a las categorías posibles para una inscripción, se manejan las siguientes:
        //
        //Menores A (de 6 a 10 años)
        //Menores B (de 11 a 17 años)
        //Juveniles (de 18 a 30 años)
        //Adultos (de 31 a 50 años)
        //Adultos mayores (mayores de 50 años)
        //Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante, se muestre por pantalla a qué categoría debe ser inscripto.
        //
        //Cabe destacar que, al finalizar el día, para dar fin a las inscripciones, se debe ingresar un dni con el valor 0 y un nombre con la palabra “fin”.
*/
        /*System.out.println("\t\tMaratón del Inmigrante\nINSCRIPCIONES:");
        String name = "hola", dni = "1";
        int edad, escape = 0;
        while (escape == 0) {
            System.out.println("Nombre:");
            name = teclado.nextLine();
            System.out.println("DNI:");
            dni = teclado.nextLine();
            System.out.println("Edad:");
            edad = teclado.nextInt();
            //System.out.println(escape + name + dni + edad);

            //Categorías
            System.out.printf("\t\tCategoría => ");
            if (edad >= 1 && edad < 6) {
                System.out.println("No podes participar peque..I´m sorry ");
            } else if (edad > 5 && edad <= 10) {
                System.out.println("Menores A");
            } else if (edad > 10 && edad <= 17) {
                System.out.println("Menores B");
            } else if (edad > 17 && edad <= 30) {
                System.out.println("Juveniles");
            } else if (edad > 30 && edad <= 50) {
                System.out.println("Adultos");
            } else if (edad > 50) {
                System.out.println("Adultos Mayores");
            }

            //Salida
            if (dni.equals("0") || name.equals("fin")) {
                escape = 1;
                System.out.println("Saliendo de la Aplicación");
            }


            //uso un nextLine() extra para que no tome el Enter como ingreso en la iteración
            dni = teclado.nextLine();
        }*/

        //EJERCICIO 4 => Árbol de Navidad

        /*   ejemplo de árbol de 4 filas...
         *          3 espacios 1*
         ***         2 espacios 3*
         *****        1 espacio  5*
         *******       0 espacios 7*
         ***
         ***
         */


        System.out.println("Filas arbolito => ");
        int altura = teclado.nextInt();

        for (int fila = 0; fila < altura; fila++) {
            for (int space = 0; space < (altura - fila - 1); space++) {
                System.out.print(" ");
            }
            for (int ast = 0; ast < (fila * 2) + 1; ast++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        int largoTrono = 1;
        for (int base = 0; base < largoTrono; base++) {
            for (int espacio = 0; espacio < (altura - 2); espacio++) {
                System.out.print(" ");
            }
            for (int tronco = 0; tronco < 3; tronco++) {
                System.out.print("|");
            }
            System.out.println("");
        }
    }

}
