
public class Main {
    public static void main(String[] args) {

        int num1 = 35, num2 = 20, aux;

        /*System.out.println("Valores Iniciales => \nnum1= " + num1 + "\tnum2= " + num2);
        aux = num1;
        num1 = num2;
        num2 = aux;*/


        // Bloque IF - ELSE

       /* System.out.println("Los valores intercambiaron => \nnum1= " + num1 + "\tnum2= " + num2);
        if (num1 > num2) {
            System.out.println("num1 mayor");
        } else {
            if (num1 < num2) {
                System.out.println("num2 mayor");
            } else {
                System.out.println("num1 es igual a num2");
            }
        }*/


        //Bloque SWITCH

        int dayNumber = 0;
        String dayOfWeek;

        switch (dayNumber) {
            case 1:
                dayOfWeek = "Lunes";
                break;
            case 2:
                dayOfWeek = "Martes";
                break;
            case 3:
                dayOfWeek = "Miércoles";
                break;
            case 4:
                dayOfWeek = "Jueves";
                break;
            case 5:
                dayOfWeek = "Viernes";
                break;
            case 6:
                dayOfWeek = "Sábado";
                break;
            case 7:
                dayOfWeek = "Domingo";
                break;
            default:
                dayOfWeek = "Número de día Inválido";
                break;
        }

        System.out.println("Día => " + dayOfWeek);
    }
}