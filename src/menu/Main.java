package menu;
import clases.Salas;
import clases.Cine;
import clases.Peliculas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Inicialización del cine
        Cine cine1 = new Cine("YELMO CINES", 10);

        //Se inicializan las salas con sus películas
        Salas sala1 = new Salas(1, new Peliculas("VENOM", 100), 10, 10);
        Salas sala2 = new Salas(2, new Peliculas("SPIDERMAN", 150), 10, 10);
        Salas sala3 = new Salas(3, new Peliculas("BATMAN", 95), 10, 10);
        Salas sala4 = new Salas(4, new Peliculas("SUPERMAN", 110), 10, 10);
    }
}
