package Herencia;
class Mamífero extends Animal {
    // Atributo adicional para los mamíferos
    int gestacion;

    // Constructor de la clase Mamifero
    public Mamífero(String nombre, String tipo_alimentacion, int edad, int gestacion) {
        super(nombre, tipo_alimentacion, edad);  // Llamamos al constructor de Animal
        this.gestacion = gestacion;
    }

    // Getter y setter para gestacion
    public int getGestacion() {
        return gestacion;
    }

    public void setGestacion(int gestacion) {
        this.gestacion = gestacion;
    }
}
