package Herencia;

public class Granja {
    public static void main(String[] args) {
        // Crear objetos de diferentes tipos de animales

        // Crear un Perro
        Perro miPerro = new Perro("Rex", "Carnívoro", 5, 9, "Pastor Alemán");
        System.out.println("Perro: " + miPerro.getNombre() + ", Raza: " + miPerro.getRaza() + ", Edad: " + miPerro.getEdad() + ", Gestación: " + miPerro.getGestacion() + " semanas");

        // Crear un Gato
        Gato miGato = new Gato("Felix", "Carnívoro", 3, 9, "Siamés");
        System.out.println("Gato: " + miGato.getNombre() + ", Pedigree: " + miGato.getPedigree() + ", Edad: " + miGato.getEdad() + ", Gestación: " + miGato.getGestacion() + " semanas");

        // Crear un Caballo
        Caballo miCaballo = new Caballo("Spirit", "Herbívoro", 7, 12, "Heno", 4);
        System.out.println("Caballo: " + miCaballo.getNombre() + ", Comida: " + miCaballo.getComida() + ", Edad: " + miCaballo.getEdad() + ", Ejercicio: " + miCaballo.getEjercicio() + " horas/día");
    }
}