package Herencia;

// Clase Padre Producto
class Producto {
    protected int id;
    protected String nombre;
    protected double precio;

    // Constructor de la clase Producto
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método que calcula el precio final, puede ser sobreescrito en las clases hijas
    public double precioFinal() {
        return precio;  // El precio final es el precio base en la clase padre
    }
}