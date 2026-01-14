package Herencia;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    double area() {
        return lado * lado;
    }

    @Override
    double perimetro() {
        return 4 * lado;
    }
}
