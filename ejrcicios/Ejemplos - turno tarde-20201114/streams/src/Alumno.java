public class Alumno {

    private String nombre;
    private double promedio;

    public Alumno(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public boolean promociona() {
        return promedio >= 7;
    }

    @Override
    public String toString() {
        // especifica que se imprime cuando se llama a print(alumno).
        return "Alumno: " + nombre + "  -  Nota: " + promedio;
    }
}
