package Herencia;

// Clase Hija ProductoDigital
class ProductoDigital extends Producto {
     String urlDescarga;
     double tamanoMb;

    // Constructor de la clase ProductoDigital
    public ProductoDigital(int id, String nombre, double precio, String urlDescarga, double tamanoMb) {
        super(id, nombre, precio);
        this.urlDescarga = urlDescarga;
        this.tamanoMb = tamanoMb;
    }

    // Sobreescritura del método precioFinal
    @Override
    public double precioFinal() {
        return precio;  // No hay alteración en el precio de los productos digitales
    }
}