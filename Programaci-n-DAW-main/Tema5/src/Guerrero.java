public class Guerrero extends Personaje {

    public Guerrero(String nombre) {
        super(nombre, 120);
    }

    @Override
    public int atacar() {
        // Espada: daño entre 10 y 25
        return random.nextInt(16) + 10;
    }
}
