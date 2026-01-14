package Herencia;

// Clase Caballo (hereda de Mamifero)
class Caballo extends Mamífero {
    // Atributos específicos de la clase Caballo
    String comida;
    int ejercicio;

    // Constructor de la clase Caballo
    public Caballo(String nombre, String tipo_alimentacion, int edad, int gestacion, String comida, int ejercicio) {
        super(nombre, tipo_alimentacion, edad, gestacion);  // Llamamos al constructor de Mamifero
        this.comida = comida;
        this.ejercicio = ejercicio;
    }

    // Getters y setters
    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(int ejercicio) {
        this.ejercicio = ejercicio;
    }
}