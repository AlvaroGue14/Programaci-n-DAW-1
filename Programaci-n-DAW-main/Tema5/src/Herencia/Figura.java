package Herencia;

public abstract class Figura {
    
     String color;
    public Figura() {}
    public Figura(String color) {
        this.color = color;
    }
    abstract double area();
    abstract double perimetro();

    public String getColor() {
        return color;
    }
}
