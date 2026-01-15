public class Arquero extends Personaje {

    public Arquero(String nombre) {
        super(nombre, 100);
    }

    @Override
    public int atacar() {
        // Arco: daño entre 8 y 20
        return random.nextInt(13) + 8;
    }
}
