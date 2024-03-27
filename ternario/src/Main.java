import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double promedio;
        java.lang.String condicionFinal;

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Ingrese Promedio => ");
        promedio = teclado.nextDouble();

        condicionFinal = promedio <= 6 ? "Aprobado" : "Desaprobado";
        System.out.println(condicionFinal);
    }
}