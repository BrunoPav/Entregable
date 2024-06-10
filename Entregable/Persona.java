package Entregable;

public class Persona {

//Propiedades o Atributos/Variables

    String nombre;
    String apellido;

    //Constructor
    Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


//genero los set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

//Genero los get

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;

    }
}