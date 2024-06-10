package Entregable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class ListarPersonasApellido {
        public static void main(String[] args) {
// Creo 5 objetos Persona con nombres y apellidos
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos", "García"));
        personas.add(new Persona("Ana", "Martínez"));
        personas.add(new Persona("Luis", "Rodríguez"));
        personas.add(new Persona("María", "López"));
        personas.add(new Persona("José", "Hernández"));

// Ordenar por nombre
        Collections.sort(personas, Comparator.comparing(Persona::getNombre));
        System.out.println("Ordenado por nombre:");
        for (Persona p : personas) {
            System.out.println(p);
        }

// Ordenar por apellido
        Collections.sort(personas, Comparator.comparing(Persona::getApellido));
        System.out.println("\nOrdenado por apellido:");
        for (Persona p : personas) {
            System.out.println(p);
        }

// Ordenar inversamente por apellido
        Collections.sort(personas, Comparator.comparing(Persona::getApellido).reversed());
        System.out.println("\nOrdenado inversamente por apellido:");
        for (Persona p : personas) {
                    System.out.println(p);
        }
    }
}








