public class Main {
    public static void main(String[] args) {

        // Persona
        Persona p = new Persona();
        p.nombre = "Alexandra";
        p.edad = 17;
        p.mostrarInfo();

        // Actividad 3 - Rectángulo
        Rectangulo r = new Rectangulo();
        r.base = 7;
        r.altura = 9;
        System.out.println("Área del rectángulo: " + r.calcularArea());

        // Actividad 4 - Operaciones
        Operaciones op = new Operaciones();
        System.out.println("Suma: " + op.sumar(209, 23));
        System.out.println("Resta: " + op.restar(90, 60));

        // Actividad 5 - Alumno
        Estudiante e = new Estudiante("Nicolas", 15);
        e.imprimirInformacion();

        // Actividad 1 - Calculadora
        new Calculadora().setVisible(true);
    }
}