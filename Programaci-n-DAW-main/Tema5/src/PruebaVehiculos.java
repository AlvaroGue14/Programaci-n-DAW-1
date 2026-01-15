

import java.util.ArrayList;

public class PruebaVehiculos {
    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Coche("1234-ABC"));
        vehiculos.add(new Moto("5678-DEF"));
        vehiculos.add(new Camion("9012-GHI"));

        // Recorrer la lista
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
            System.out.println("--------------------");
        }
    }
}