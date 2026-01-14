package Herencia;
class ProductoFisico extends Producto {
    private double peso;
    private double costeEnvio;

    // Constructor de la clase ProductoFisico
    public ProductoFisico(int id, String nombre, double precio, double peso, double costeEnvio) {
        super(id, nombre, precio);
        this.peso = peso;
        this.costeEnvio = costeEnvio;
    }

    // Sobreescritura del método precioFinal
    @Override
    public double precioFinal() {
        double precioConImpuesto = precio;
        if (peso > 2) {
            precioConImpuesto *= 1.10;  // Se aplica un 10% más si el peso es mayor a 2 kg
        }
        return precioConImpuesto + costeEnvio;  // Se suma el coste de envío al precio final
    }
}