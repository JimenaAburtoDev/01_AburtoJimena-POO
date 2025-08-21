public class Estudiante {
    private String nombreCompleto;
    private int anios;

    // Constructor
    public Estudiante(String nombreCompleto, int anios) {
        this.nombreCompleto = nombreCompleto;
        this.anios = anios;
    }

    public void imprimirInformacion() {
        System.out.println("Estudiante: " + nombreCompleto + " | Edad: " + anios + " años");
    }
}