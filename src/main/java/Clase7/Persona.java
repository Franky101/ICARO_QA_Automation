package Clase7;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    // ALT + INSERT para crear un constructor o mas con lo existente.
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String saludar() {
        return "Hola, soy " + this.nombre + " " +  this.apellido;
    }
}
