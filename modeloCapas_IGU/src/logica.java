//MODELO DE CAPAS => son 3
/*
La interfaz gráfica de usuario (IGU)´=> pantallas - botones - lo que el usuario ve..
La lógica de negocio => progrmaación..
La persistencia (o controladora de base de datos) => conectar nuestra lógica on un DB para guardar la info..
 */

/*
Swing => Contenedores Gráficos - Componentes Gráficos - Eventos
 */

import igu.Pantalla;

public class logica {
    public static void main(String[] args) {
        Pantalla panta = new Pantalla();

        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
    }
}