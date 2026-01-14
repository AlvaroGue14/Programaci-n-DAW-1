package Herencia;

// Clase Perro (hereda de Mamifero)
class Perro extends Mamífero {
    // Atributo específico de la clase Perro
    String raza;

    // Constructor de la clase Perro
    public Perro(String nombre, String tipo_alimentacion, int edad, int gestacion, String raza) {
        super(nombre, tipo_alimentacion, edad, gestacion);  // Llamamos al constructor de Mamifero
        this.raza = raza;
    }

    // Getter y setter para raza
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}

