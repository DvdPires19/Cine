package clases;
public class Cine {
    private String nombre;
    private int aforo;
    private Salas[] salas;

    public Cine(String nombre, int numeroSalas) {
        this.nombre = nombre;
        this.salas = new Salas[numeroSalas];
    }
    public String getNombreCine() {
        return nombre;
    }
    public void añadirSala(Salas sala) {
        for (int i = 0; i < salas.length; i++) {
            if (salas[i] == null) {
                sala = salas[i];
            }
        }
    }
}
