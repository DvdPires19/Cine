package clases;
public class Salas {
    private int numero;
    private Peliculas pelicula;
    private String[][] butacas;

    public Salas(int numero, Peliculas pelicula,int filas, int columnas) {
        this.numero = numero;
        this.pelicula = pelicula;
        this.butacas = new String[filas][columnas];
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                butacas[i][j] = "O";
            }

        }
    }
    public int getNumeroSala() {
        return numero;
    }

    public Peliculas getPelicula() {
        return pelicula;
    }
    /**
     * Muestra la información de una sala determinada, en la que se incluye el titulo y la duración de la película
     */
    public void informacionSalas() {
        System.out.println("SALA " + numero + " ------ " + pelicula.getTitulo() + " ------ DURACIÓN: " + pelicula.getDuracion() + " min") ;
    }
    public void reservarButaca(int fila, int columna, String email) {
        System.out.println("Comprobando la disponibilidad de los asientos elegidos. Por favor espere...");
        if (butacas[fila - 1][columna - 1] == "O") {
            System.out.println("Asientos disponibles!.\nReservando, espere unos segundos...");
            butacas[fila -1][columna -1 ] = email;
        } else {
            System.err.println("Lo sentimos, esa butaca ya está ocupada.");

        }
    }
}
