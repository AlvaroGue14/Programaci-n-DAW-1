import java.util.ArrayList;
import java.util.Random;

public class Batalla {

    public static void main(String[] args) {

        ArrayList<Personaje> equipo1 = new ArrayList<>();
        ArrayList<Personaje> equipo2 = new ArrayList<>();

        equipo1.add(new Guerrero("Thor"));
        equipo1.add(new Mago("Merlin"));

        equipo2.add(new Arquero("Legolas"));
        equipo2.add(new Guerrero("Ares"));

        System.out.println("⚔️ ¡Comienza la batalla!\n");

        Random random = new Random();

        while (!equipo1.isEmpty() && !equipo2.isEmpty()) {

            Personaje atacante = equipo1.get(random.nextInt(equipo1.size()));
            Personaje defensor = equipo2.get(random.nextInt(equipo2.size()));

            System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre());
            int daño = atacante.atacar();
            defensor.recibirDaño(daño);

            if (!defensor.estaVivo()) {
                System.out.println(defensor.getNombre() + " ha muerto 💀\n");
                equipo2.remove(defensor);
            }

            // Cambiar turno
            ArrayList<Personaje> temp = equipo1;
            equipo1 = equipo2;
            equipo2 = temp;

            System.out.println("-----------------------------");
        }

        System.out.println("Se ha terminado la batalla.");
        if (equipo1.isEmpty()) {
            System.out.println("Gana el equipo 2");
        } else {
            System.out.println("Gana el equipo 1");
        }
        System.out.println("⚔️ Fin de la batalla.");
    }
}
