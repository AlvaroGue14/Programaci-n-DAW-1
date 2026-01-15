public class Mago extends Personaje {

    public Mago(String nombre) {
        super(nombre, 80);
    }

    @Override
    public int atacar() {
        // Hechizo: daño entre 15 y 30
        return random.nextInt(16) + 15;
    }
}
