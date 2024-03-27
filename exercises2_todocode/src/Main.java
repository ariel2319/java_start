import java.util.Scanner;

public class Main {

    //Repositor => $15890 + 10%
//Cajeros => $25630,89 fijo
//Supervisor => $35560,2 - 11%
    public static void main(String[] args) {


        int employee;
        double cash;

        System.out.println("Ingrese la categoría de empleado: ");
        //capturar lo que ingrese por teclado..
        Scanner teclado = new Scanner(System.in);
        //nextInt escanea el próximo numero entero..
        employee = teclado.nextInt();

        switch (employee) {
            case 1:
                cash = 15890 * 1.1;
                System.out.println("Repositor => $" + cash);
                break;
            case 2:
                cash = 25630.89;
                System.out.println("Cajero => $" + cash);
                break;
            case 3:
                cash = 35560.2 * 0.89;
                System.out.println("Supervisor => $" + cash);
                break;

            default:
                System.out.println("No es una opción válida");
                break;
        }

    }
}