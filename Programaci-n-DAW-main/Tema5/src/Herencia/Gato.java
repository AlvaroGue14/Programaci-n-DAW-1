package Herencia;

// Clase Gato (hereda de Mamifero)
class Gato extends Mamífero {
    // Atributo específico de la clase Gato
    String pedigree;

    // Constructor de la clase Gato
    public Gato(String nombre, String tipo_alimentacion, int edad, int gestacion, String pedigree) {
        super(nombre, tipo_alimentacion, edad, gestacion);  // Llamamos al constructor de Mamifero
        this.pedigree = pedigree;
    }

    // Getter y setter para pedigree
    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }
}

