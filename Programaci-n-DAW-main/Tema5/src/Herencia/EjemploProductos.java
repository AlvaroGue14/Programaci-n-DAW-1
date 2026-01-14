package Herencia;

public class EjemploProductos {
 public static void main(String[] args) {
        // Productos Físicos
        ProductoFisico productoFisico1 = new ProductoFisico(1, "Smartphone", 500, 1.5, 15);
        ProductoFisico productoFisico2 = new ProductoFisico(2, "Televisor", 1200, 3.2, 30);
        ProductoFisico productoFisico3 = new ProductoFisico(3, "Cámara digital", 800, 2.3, 20);

        // Productos Digitales
        ProductoDigital productoDigital1 = new ProductoDigital(4, "Juego de Video", 60, "www.juego.com", 5.5);
        ProductoDigital productoDigital2 = new ProductoDigital(5, "E-book", 15, "www.ebook.com", 0.3);
        ProductoDigital productoDigital3 = new ProductoDigital(6, "Software antivirus", 40, "www.software.com", 150);

        // Mostrar los resultados de los precios finales de los productos
        System.out.println("Ejemplo de productos físicos:");
        System.out.println("Precio final del " + productoFisico1.nombre + ": " + productoFisico1.precioFinal() + " euros");
        System.out.println("Precio final del " + productoFisico2.nombre + ": " + productoFisico2.precioFinal() + " euros");
        System.out.println("Precio final del " + productoFisico3.nombre + ": " + productoFisico3.precioFinal() + " euros");

        System.out.println("\nEjemplo de productos digitales:");
        System.out.println("Precio final del " + productoDigital1.nombre + ": " + productoDigital1.precioFinal() + " euros");
        System.out.println("Precio final del " + productoDigital2.nombre + ": " + productoDigital2.precioFinal() + " euros");
        System.out.println("Precio final del " + productoDigital3.nombre + ": " + productoDigital3.precioFinal() + " euros");
    }
}
